package com.huawei.esdk.uc.professional.local.callback;

import com.huawei.esdk.uc.professional.local.bean.callback.ConfChangeEvent;
import com.huawei.esdk.uc.professional.local.bean.callback.ConfInfoNotify;

public interface ConferenceCallback  extends UCProfessionalCallback{
	
	void notifyConfInfo(ConfChangeEvent changeEvent,ConfInfoNotify confInfoNotify);
	
	void notifyConfStatus(String initiator,String confId,Integer confMessageType,Integer result,String memberNumber);
	
//	void notifyCCConfInfo(String confId,String eventId,ConfStatus confStatus,List<ConfUser> confUser);
}
