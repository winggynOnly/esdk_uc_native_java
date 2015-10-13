package com.huawei.esdk.uc.professional.local.callback;

public interface CallCallback extends UCProfessionalCallback{
	
	void notifyCTDStatus(String initiator,String callId,Integer status );
}
