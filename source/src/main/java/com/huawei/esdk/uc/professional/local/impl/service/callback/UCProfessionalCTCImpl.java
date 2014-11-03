package com.huawei.esdk.uc.professional.local.impl.service.callback;

import org.apache.cxf.common.util.StringUtils;
import org.apache.log4j.Logger;

import com.huawei.esdk.platform.professional.local.PlatformServiceFactoryEx;
import com.huawei.esdk.platform.professional.local.bean.SDKResponse;
import com.huawei.esdk.platform.professional.local.constant.PlatformNativeConstant;
import com.huawei.esdk.platform.professional.local.impl.utils.RSA2048Utils;
import com.huawei.esdk.platform.professional.local.service.common.PlatformKeyServiceEx;
import com.huawei.esdk.uc.professional.local.bean.callback.ConfInfoNotify;
import com.huawei.esdk.uc.professional.local.callback.ConferenceCallback;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyConfInfo;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyConfInfoResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyConfStatus;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyConfStatusResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.UCProfessionalCTC;
import com.huawei.esdk.uc.professional.local.impl.service.ConferenceServiceExImpl;

public class UCProfessionalCTCImpl implements UCProfessionalCTC {
    
    private static final Logger LOGGER = Logger.getLogger(ConferenceServiceExImpl.class);
    
    private PlatformKeyServiceEx keyServiceEx = PlatformServiceFactoryEx.getService(PlatformKeyServiceEx.class);

	@Override
	public NotifyConfStatusResponse notifyConfStatus(NotifyConfStatus parameters) {
		ConferenceCallback conferenceCallback = (ConferenceCallback) CallbackServiceExImpl.callbacks.get(ConferenceCallback.class);
		conferenceCallback.notifyConfStatus(parameters.getInitiator(), parameters.getConfId(), parameters.getConfMessageType(), parameters.getResult(), parameters.getMemberNumber());
		return new NotifyConfStatusResponse();
	}

//	@Override
//	public NotifyCCConfInfoResponse notifyCCConfInfo(NotifyCCConfInfo parameters) {
//		ConferenceCallback conferenceCallback = (ConferenceCallback) CallbackServiceExImpl.callbacks.get(ConferenceCallback.class);
//		conferenceCallback.notifyCCConfInfo(parameters.getConfId(), parameters.getEventId(), parameters.getConfStatus(), parameters.getConfUser());
//		return new NotifyCCConfInfoResponse();
//	}

	@Override
	public NotifyConfInfoResponse notifyConfInfo(NotifyConfInfo parameters) {
	    
	    LOGGER.info("begin to execute getPublicKey method");
        SDKResponse<String> key = keyServiceEx.getPublicKey();
        if (null == key || 0 != key.getResultCode())
        {
            LOGGER.info("failed to get publicKey");
            return new NotifyConfInfoResponse();
        }
        LOGGER.info("execute getPublicKey method completed");
	    
		ConferenceCallback conferenceCallback = (ConferenceCallback) CallbackServiceExImpl.callbacks.get(ConferenceCallback.class);
		
		ConfInfoNotify confInfo = parameters.getConfInfoNotify();
		
		if (null != confInfo)
        {
            if (!StringUtils.isEmpty(confInfo.getChairmanPassword()))
            {
                confInfo.setChairmanPassword(RSA2048Utils.decodeFromBase64(confInfo.getChairmanPassword()));
            }
            if (!StringUtils.isEmpty(confInfo.getMemberPassword()))
            {
                confInfo.setMemberPassword(RSA2048Utils.decodeFromBase64(confInfo.getMemberPassword()));
            }
        }
		
		conferenceCallback.notifyConfInfo(parameters.getChangeEvent(), confInfo);
		return new NotifyConfInfoResponse();
	}

}
