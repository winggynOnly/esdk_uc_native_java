package com.huawei.esdk.uc.professional.local.impl.service.callback;

import com.huawei.esdk.uc.professional.local.callback.CallCallback;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyCTDStatus;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyCTDStatusResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.UCProfessionalCTD;

public class UCProfessionalCTDImpl implements UCProfessionalCTD {

	@Override
	public NotifyCTDStatusResponse notifyCTDStatus(NotifyCTDStatus parameters) {
		CallCallback callCallback = (CallCallback)CallbackServiceExImpl.callbacks.get(CallCallback.class);
		callCallback.notifyCTDStatus(parameters.getInitiator(), parameters.getCallId(), parameters.getStatus());
		return new NotifyCTDStatusResponse();
	}
}
