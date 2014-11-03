package com.huawei.esdk.uc.professional.local.impl.service.callback;

import com.huawei.esdk.uc.professional.local.callback.IMCallback;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyAppMsg;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyAppMsgResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.UCProfessionalIM;

public class UCProfessionalIMImpl implements UCProfessionalIM{

	@Override
	public NotifyAppMsgResponse notifyAppMsg(NotifyAppMsg parameters) {
		IMCallback callback = (IMCallback) CallbackServiceExImpl.callbacks.get(IMCallback.class);
		callback.notifyAppMsg(parameters.getSendNumber(),parameters.getTargetNumber(),parameters.getMessage());
		return new NotifyAppMsgResponse();
	}

}
