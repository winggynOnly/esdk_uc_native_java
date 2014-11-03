package com.huawei.esdk.uc.professional.local.impl.service.callback;

import java.util.HashMap;
import java.util.Map;

import javax.xml.ws.Endpoint;

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
import com.huawei.esdk.uc.professional.local.impl.utils.ClientProvider;
import com.huawei.esdk.uc.professional.local.impl.utils.ExceptionUtils;
import com.huawei.esdk.uc.professional.local.impl.utils.PropertiesUtils;

@SuppressWarnings("rawtypes")
public class CallbackServiceExImpl implements CallbackServiceEx {

	private static CallbackServiceExImpl instance = null;
	
	static UCProfessionalCommon ucProfessionalCommon = (UCProfessionalCommon)ClientProvider.getClient(UCProfessionalCommon.class);
	
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
		 if (null == endpoint || !endpoint.isPublished()) {
			 try
			 {
				 endpoint = Endpoint.publish(url, clz);
				 services.put(url, endpoint);
			 }
			 catch (Exception e) 
			 {
				 return ExceptionUtils.processSoapException(e);
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
	
}
