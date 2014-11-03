package com.huawei.esdk.uc.professional.local.impl.utils;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.xml.namespace.QName;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.configuration.security.FiltersType;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalBMPAccountMaintenance;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalBMPNumber;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalCTC;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalCTD;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalIM;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalUserProfileCorpList;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalUserProfileFriend;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalUserProfilePSSvr;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalUserProfilePersonList;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalUserProfilePublicGroup;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalVoiceServiceBlackWhiteNumber;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalVoiceServiceForwardNumber;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalVoiceServiceOneNumber;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.UCProfessionalCommon;
import com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.UCProfessionalClientCommon;
import com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.UCProfessionalClientMsgServer;
import com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.UCProfessionalClientPersonal;
import com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.UCProfessionalClientPublicGroup;

public abstract class ClientProvider {
	private static final Logger LOGGER = Logger.getLogger(ClientProvider.class
			.getName());
	private static HashMap<String, Object> clientMap = new HashMap<String, Object>();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static synchronized Object getClient(Class clz) {
		Object clientObj = clientMap.get(clz.getName());
		if (null != clientObj) {
			return clientObj;
		}
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		String url = PropertiesUtils.getValue("sdkserver.url");

		if (null == url || (!url.startsWith("http:") && !url.startsWith("https:"))) {
			url = "";
		}
		if (!Boolean.valueOf(PropertiesUtils.getValue("ssl.support"))) {
			url = url.replaceFirst("https", "http");
		}

		String serviceUrl = getServiceUrl(clz);

		factory.setAddress(url + "/" + serviceUrl);

		Object service = null;
		service = factory.create(clz);

		if (Boolean.valueOf(PropertiesUtils.getValue("ssl.support"))
				&& url.startsWith("https")) {

			return configureSSL(service, clz);

		} else {
			return configureHttp(service, clz);
		}
	}

	@SuppressWarnings("rawtypes")
	private static String getServiceUrl(Class clz) {
		String serviceUrl = "";
		if (clz.getName().equals(UCProfessionalCTC.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.ctc.service.url");
		} else if (clz.getName().equals(UCProfessionalCTD.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.ctd.service.url");
		} else if (clz.getName().equals(UCProfessionalIM.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.im.service.url");
		} else if (clz.getName().equals(
				UCProfessionalUserProfileCorpList.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.userProfileEnterprise.service.url");
		} else if (clz.getName().equals(
				UCProfessionalUserProfileFriend.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.userProfileFriend.service.url");
		} else if (clz.getName().equals(
				UCProfessionalUserProfilePersonList.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.userProfilePerson.service.url");
		} else if (clz.getName().equals(
				UCProfessionalUserProfilePSSvr.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.userProfilePSSvr.service.url");
		} else if (clz.getName().equals(
				UCProfessionalUserProfilePublicGroup.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.userProfilePublicGroup.service.url");
		} else if (clz.getName().equals(
				UCProfessionalClientCommon.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.clientCommon.service.url");
		} else if (clz.getName().equals(
				UCProfessionalClientPersonal.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.clientPersonal.service.url");
		} else if (clz.getName().equals(
				UCProfessionalClientMsgServer.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.clientMsgServer.service.url");
		} else if (clz.getName().equals(
				UCProfessionalClientPublicGroup.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.clientPublicGroup.service.url");
		} else if (clz.getName().equals(
				UCProfessionalVoiceServiceForwardNumber.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.voiceServiceFWDNumber.service.url");
		} else if (clz.getName().equals(
				UCProfessionalVoiceServiceOneNumber.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.voiceServiceOneNumber.service.url");
		} else if (clz.getName().equals(
				UCProfessionalVoiceServiceBlackWhiteNumber.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.voiceServiceBWNumber.service.url");
		} else if(clz.getName().equals(UCProfessionalCommon.class.getName())){
			serviceUrl = PropertiesUtils
			.getValue("professional.ucProfessionalCommon.service.url");
		}else if (clz.getName().equals(UCProfessionalBMPNumber.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.UCProfessionalNumber.service.url");
		} else if (clz.getName().equals(UCProfessionalBMPAccountMaintenance.class.getName())) {
			serviceUrl = PropertiesUtils
					.getValue("professional.UCProfessionalAccountMaintenance.service.url");
		} 
		return serviceUrl;
	}

	@SuppressWarnings("rawtypes")
	private static Object configureHttp(Object obj, Class clz) {
		Client client = ClientProxy.getClient(obj);
		client.getRequestContext().put(Header.HEADER_LIST, getSoapHeaders());
		interceptorLoggingCtrl(client);

		HTTPConduit http = (HTTPConduit) client.getConduit();
		if (null == http) {
			return null;
		}
		configHttpClientPolicy(http);

		clientMap.put(clz.getName(), obj);
		return obj;
	}

	@SuppressWarnings("rawtypes")
	private static Object configureSSL(Object obj, Class clz) {

		System.setProperty("javax.net.debug",
				PropertiesUtils.getValue("ssl.javax.net.debug"));

		Client client = ClientProxy.getClient(obj);
		client.getRequestContext().put(Header.HEADER_LIST, getSoapHeaders());
		interceptorLoggingCtrl(client);
		HTTPConduit http = (HTTPConduit) client.getConduit();
		if (null == http) {
			return null;
		}
		InputStream is = null;
		try {
			TLSClientParameters tlsParams = http.getTlsClientParameters();// new
																			// TLSClientParameters();
			if (null == tlsParams) {
				tlsParams = new TLSClientParameters();
				tlsParams.setSecureSocketProtocol(PropertiesUtils
						.getValue("ssl.secure.socket.protocol"));
			}

			KeyStore keyStore = KeyStore.getInstance(
					PropertiesUtils.getValue("ssl.keystore.type"),
					PropertiesUtils.getValue("ssl.keystore.provider"));
			// String storePassword =
			// PropertiesUtils.getValue("ssl.keystore.password");
			String storePassword = new String(AESCbc128Utils.decode(Base64Utils
					.getFromBASE64(PropertiesUtils
							.getValue("ssl.keystore.password"))));
			is = (InputStream) ClassLoader.getSystemClassLoader().getResourceAsStream(
					PropertiesUtils.getValue("ssl.keystore"));
			if (null == is) {
				is = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream(PropertiesUtils.getValue("ssl.keystore"));
			}
			keyStore.load(is,storePassword.toCharArray());
			TrustManagerFactory trustFactory = TrustManagerFactory
					.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			trustFactory.init(keyStore);
			TrustManager[] trustManagers = trustFactory.getTrustManagers();

			SSLContext sslContext = SSLContext.getInstance(PropertiesUtils
					.getValue("ssl.secure.socket.protocol"));
            sslContext.init(null, trustManagers, new java.security.SecureRandom());
            SSLSocketFactory ssf = sslContext.getSocketFactory();
            tlsParams.setSSLSocketFactory(ssf);
			// TrustManager[] trustManagers = {new MyX509TrustManager()};

			tlsParams.setTrustManagers(trustManagers);
			tlsParams.setUseHttpsURLConnectionDefaultHostnameVerifier(false);

			FiltersType filtersTypes = new FiltersType();
			filtersTypes.getInclude().add(".*_EXPORT_.*");
			filtersTypes.getInclude().add(".*_EXPORT1024_.*");
			filtersTypes.getInclude().add(".*_WITH_DES_.*");
			filtersTypes.getInclude().add(".*_WITH_AES_.*");
			filtersTypes.getInclude().add(".*_WITH_NULL_.*");
			filtersTypes.getExclude().add(".*_DH_anon_.*");

			tlsParams.setCipherSuitesFilter(filtersTypes);
			tlsParams.setDisableCNCheck(true);

			http.setTlsClientParameters(tlsParams);
			configHttpClientPolicy(http);

			clientMap.put(clz.getName(), obj);

		} catch (Exception e) 
		{
			LOGGER.log(java.util.logging.Level.WARNING, "Exception happened in configureSSL() "  , e);
		}
		finally
		{
			if (null != is) {
				try {
					is.close();
				} catch (IOException e) {
					LOGGER.log(java.util.logging.Level.WARNING, "Exception happened in configureSSL() "  , e);
				}
			}
		}
		return obj;
	}

	private static void interceptorLoggingCtrl(Client client) {
		if (Boolean.valueOf(PropertiesUtils
				.getValue("cxf.logging.interceptor.on"))) {
			client.getOutInterceptors().add(new LoggingOutInterceptor());
			client.getInInterceptors().add(new LoggingInInterceptor());
		}
	}

	private static void configHttpClientPolicy(HTTPConduit http) {
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		httpClientPolicy.setConnectionTimeout(60000);
		httpClientPolicy.setAllowChunking(false);
		httpClientPolicy.setReceiveTimeout(60000);
		http.setClient(httpClientPolicy);
	}

	private static List<Header> getSoapHeaders() {

		List<Header> headerList = new ArrayList<Header>();
		Header headerAppId;
		String appId = PropertiesUtils.getValue("appId");
		String pw = PropertiesUtils.getValue("password");

		try {
			String base64Pwd = new String(AESCbc128Utils.decode(Base64Utils
					.getFromBASE64(pw)));
			headerAppId = new Header(new QName("", "appId"), appId,
					new JAXBDataBinding(String.class));
			headerList.add(headerAppId);

			Header headerPw = new Header(new QName("", "password"),
					SHA256Utils.encrypt(base64Pwd), new JAXBDataBinding(
							String.class));
			headerList.add(headerPw);
		} catch (Exception e) {
			LOGGER.log(java.util.logging.Level.WARNING, "Exception happened in getSoapHeaders() "  , e);
		} 

		return headerList;
	}
}