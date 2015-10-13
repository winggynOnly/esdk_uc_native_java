package com.huawei.esdk.uc.professional.local.impl.service.callback;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.URL;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.xml.ws.Endpoint;

import org.apache.log4j.Logger;

import com.huawei.esdk.platform.professional.local.PlatformServiceFactoryEx;
import com.huawei.esdk.platform.professional.local.bean.SDKResponse;
import com.huawei.esdk.platform.professional.local.constant.PlatformNativeConstant;
import com.huawei.esdk.platform.professional.local.impl.utils.RSA2048Utils;
import com.huawei.esdk.platform.professional.local.service.common.PlatformKeyServiceEx;
import com.huawei.esdk.uc.professional.local.callback.CallCallback;
import com.huawei.esdk.uc.professional.local.callback.CallbackServiceEx;
import com.huawei.esdk.uc.professional.local.callback.ClientCallback;
import com.huawei.esdk.uc.professional.local.callback.ConferenceCallback;
import com.huawei.esdk.uc.professional.local.callback.IMCallback;
import com.huawei.esdk.uc.professional.local.callback.UCProfessionalCallback;
import com.huawei.esdk.uc.professional.local.constant.NativeConstant;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.MessageNotification;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.RegisterNotificationRequest;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.UCProfessionalCommon;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.UnregisterNotification;
import com.huawei.esdk.uc.professional.local.impl.utils.AES128Utils;
import com.huawei.esdk.uc.professional.local.impl.utils.AESCbc128Utils;
import com.huawei.esdk.uc.professional.local.impl.utils.Base64Utils;
import com.huawei.esdk.uc.professional.local.impl.utils.ClientProvider;
import com.huawei.esdk.uc.professional.local.impl.utils.ExceptionUtils;
import com.huawei.esdk.uc.professional.local.impl.utils.PropertiesUtils;
import com.sun.net.httpserver.HttpsConfigurator;
import com.sun.net.httpserver.HttpsServer;

@SuppressWarnings("rawtypes")
public class CallbackServiceExImpl implements CallbackServiceEx {

	private static CallbackServiceExImpl instance = null;
	
	private static final Logger LOGGER = Logger.getLogger(CallbackServiceExImpl.class);
	
	static UCProfessionalCommon ucProfessionalCommon = (UCProfessionalCommon)ClientProvider.getClient(UCProfessionalCommon.class);
	
	private PlatformKeyServiceEx keyServiceEx = PlatformServiceFactoryEx.getService(PlatformKeyServiceEx.class);
	
	static Map<Class,UCProfessionalCallback> callbacks = null;
	
	static Map<String,Endpoint> services = null;
	
	static
	{
		callbacks = new HashMap<Class,UCProfessionalCallback>();
		services = new HashMap<String, Endpoint>();
		
	}
	
	public static synchronized CallbackServiceExImpl getInstance() {
		if (null == instance) {
			instance = new CallbackServiceExImpl();
		}
		return instance;
	}
	@Override
	public Integer regeditCallback(UCProfessionalCallback ucCallback) {
		
		String url = PropertiesUtils.getValue("callback.url");
		
		int result = NativeConstant.REDEGIT_CALLBAK_ERRORCODE;
		if (url.isEmpty()) {
			return result;
		}
		
		if (ucCallback instanceof IMCallback) {
			url += PropertiesUtils.getValue("professional.callback.im");
			result = publishServices("IM", url, new UCProfessionalIMImpl());
			if(0 == result)
			{
				callbacks.put(IMCallback.class, ucCallback);
			}
			return result;
		}
		else if (ucCallback instanceof ClientCallback) {
			url += PropertiesUtils.getValue("professional.callback.client");
			result = publishServices("Client", url, new UCProfessionalClientImpl());
			if(0 == result)
			{
				callbacks.put(ClientCallback.class, ucCallback);
			}
			return result;
		}
		else if (ucCallback instanceof ConferenceCallback) {
		    
		    
		    LOGGER.info("begin to execute getPublicKey method");
	        SDKResponse<String> key = keyServiceEx.getPublicKey("RSA2048");
	        if (null == key || 0 != key.getResultCode())
	        {
	            LOGGER.info("failed to get publicKey");
	            return PlatformNativeConstant.FAILED_TO_GET_PUTLIC_KEY;
	        }
	        LOGGER.info("execute getPublicKey method completed");
	        
	        Integer setSecretKeyResultCode = setSecretKey();
	        if (null == setSecretKeyResultCode || 0 != setSecretKeyResultCode)
	        {
	            return PlatformNativeConstant.FAILED_TO_SET_SECRET_KEY;
	        }
		    
			url += PropertiesUtils.getValue("professional.callback.ctc");
			result = publishServices("CTC", url, new UCProfessionalCTCImpl());
			if(0 == result)
			{
				callbacks.put(ConferenceCallback.class, ucCallback);
			}
			return result;
		}
		else if (ucCallback instanceof CallCallback) {
			url += PropertiesUtils.getValue("professional.callback.ctd");
			result = publishServices("CTD", url, new UCProfessionalCTDImpl());
			if(0 == result)
			{
				callbacks.put(CallCallback.class, ucCallback);
			}
			return result;
		}
		return result;
	}

	@Override
	public Integer unRegeditCallback(UCProfessionalCallback ucCallback) 
	{
		int result = NativeConstant.UNREDEGIT_CALLBAK_ERRORCODE;
		String url = PropertiesUtils.getValue("callback.url");
		
		if (ucCallback instanceof IMCallback) 
		{
			url += PropertiesUtils.getValue("professional.callback.im");
			result = stopServices("IM",url);
			if(0 == result)
			{
				callbacks.remove(IMCallback.class);
			}
			return result;
		}
		else if (ucCallback instanceof ClientCallback) 
		{
			url += PropertiesUtils.getValue("professional.callback.client");
			result = stopServices("Client",url);
			if(0 == result)
			{
				callbacks.remove(ClientCallback.class);
			}
			return result;
		}
		else if (ucCallback instanceof ConferenceCallback) 
		{
			url += PropertiesUtils.getValue("professional.callback.ctc");
			result = stopServices("CTC",url);
			if(0 == result)
			{
				callbacks.remove(ConferenceCallback.class);
			}
			return result;
		}
		else if (ucCallback instanceof CallCallback)
		{
			url += PropertiesUtils.getValue("professional.callback.ctd");
			result = stopServices("CTD",url);
			if(0 == result)
			{
				callbacks.remove(CallCallback.class);
			}
			return result;
		}
		return result;
	}

	 private int publishServices(String module, String url, Object clz)
	 {
		 int result = NativeConstant.REDEGIT_CALLBAK_ERRORCODE;
		 RegisterNotificationRequest request = new RegisterNotificationRequest();
		 MessageNotification messageNotification = new MessageNotification();
		 messageNotification.setModule(module);
		 messageNotification.setWsUri(url);
		 request.getMessageNotification().add(messageNotification);
		 
		 Endpoint endpoint = services.get(url);
		 if (null == endpoint || !endpoint.isPublished()) 
		 {
		     InputStream is = null;
			 try
            {
                if (null != url && url.contains("https:"))
                {
                    String keystoreFile = PropertiesUtils.getValue("callback.keystore.path");
                    
                    String keyPass =
                        new String(
                            AESCbc128Utils.decode(Base64Utils.getFromBASE64(PropertiesUtils.getValue("callback.ssl.keystore.password"))));
                    
                    URL uri = new URL(url);
                    int port = uri.getPort();
                    
                    SSLContext ssl =
                        SSLContext.getInstance(getDefaultValueIfEmpty(PropertiesUtils.getValue("callback.ssl.secure.socket.protocol"), "SSL"));
                    
                    KeyManagerFactory keyFactory =
                        KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                    KeyStore store =
                        KeyStore.getInstance(getDefaultValueIfEmpty(PropertiesUtils.getValue("callback.ssl.keystore.type"), "JKS"),
                            getDefaultValueIfEmpty(PropertiesUtils.getValue("callback.ssl.keystore.provider"), "SUN"));
                    
                    is = Thread.currentThread().getContextClassLoader().getResourceAsStream(keystoreFile);
                    store.load(is, keyPass.toCharArray());
                    
                    keyFactory.init(store, keyPass.toCharArray());
                    
                    ssl.init(keyFactory.getKeyManagers(), null, null);
                    
                    HttpsConfigurator configurator = new HttpsConfigurator(ssl);
                    
                    HttpsServer httpsServer = HttpsServer.create(new InetSocketAddress(uri.getHost(), port), 0);
                    httpsServer.setHttpsConfigurator(configurator);
                    
                    ExecutorService threads = Executors.newFixedThreadPool(200);
                    httpsServer.setExecutor(threads);
                    httpsServer.start();
                    
                    com.sun.net.httpserver.HttpContext httpContext = httpsServer.createContext(uri.getPath());
                    
                    endpoint = new com.sun.xml.internal.ws.spi.ProviderImpl().createEndpoint(null, clz);
                    endpoint.publish(httpContext);
                }
                else
                {
                    endpoint = Endpoint.publish(url, clz);
                }
                
                services.put(url, endpoint);
            }
            catch (Exception e)
            {
                return ExceptionUtils.processSoapException(e);
            }
            finally
            {
                if (null != is)
                {
                    try
                    {
                        is.close();
                    }
                    catch (IOException e)
                    {
                        return ExceptionUtils.processSoapException(e);
                    }
                }
            }
		 }
		 
		 if (endpoint.isPublished()) 
		 {
			 try{
			     return ucProfessionalCommon.registerNotificationRequest(request).getResultCode();
		     } 
			 catch (Exception e) 
			 {
				return ExceptionUtils.processSoapException(e);
			 }
		 }
		 return result;
	 }
	 
	 private int stopServices(String module,String url)
	 {
		UnregisterNotification request = new UnregisterNotification();
		request.getModule().add(module);
		try
		{
			int response = ucProfessionalCommon.unregisterNotification(request).getResultCode();
			if (0 == response) {
				Endpoint endpoint = services.get(url);
				if (null != endpoint) {
					endpoint.stop();
					services.remove(url);
				}
			}
			return response;
		} 
		catch (Exception e) 
		{
			return ExceptionUtils.processSoapException(e);
		}
	 }
	 
    private String getDefaultValueIfEmpty(String value, String defaultValue)
    {
        if (null == value || value.trim().isEmpty())
        {
            return defaultValue;
        }
        return value;
    }
    
    private Integer setSecretKey()
    {
        LOGGER.info("begin to execute setSecretKey method");
        byte[] secretKey = AES128Utils.getBT_KEY();
        byte[] iv = AES128Utils.getBT_IV();
        Integer resultCode = null;
        try
        {
            String secretKeyStr =
                Base64Utils.encode(RSA2048Utils.encode(AES128Utils.byte2Hex(secretKey).getBytes("UTF-8")));
            String ivStr = Base64Utils.encode(RSA2048Utils.encode(AES128Utils.byte2Hex(iv).getBytes("UTF-8")));
            
            resultCode = keyServiceEx.setSecretKey("AES128", secretKeyStr, ivStr);
        }
        catch (Exception e)
        {
            LOGGER.info("failed to setSecretKey");
            resultCode = PlatformNativeConstant.FAILED_TO_SET_SECRET_KEY;
        }
        LOGGER.info("execute setSecretKey method completed");
        return resultCode;
    }
	
}
