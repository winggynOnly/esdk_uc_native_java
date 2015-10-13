package com.huawei.esdk.uc.professional.local.callback;

import com.huawei.esdk.uc.professional.local.bean.callback.MessageInfo;

public interface IMCallback extends UCProfessionalCallback {
	
	void notifyAppMsg(String sendNumber,String targetNumber,MessageInfo  msg);
	
}
