package com.huawei.esdk.uc.professional.local.voice;

import java.util.List;

import com.huawei.esdk.uc.professional.local.bean.BindingNumber;
import com.huawei.esdk.uc.professional.local.bean.BlackWhiteList;
import com.huawei.esdk.uc.professional.local.bean.BlackWhiteNumberScope;
import com.huawei.esdk.uc.professional.local.bean.ForwardNumberInfo;
import com.huawei.esdk.uc.professional.local.bean.OneNumberService;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;

public interface VoiceServiceEx {

	Integer setForwardService(String userNumber, String fwdType, String fwdNumber) ;
	
	UCSDKResponse<List<ForwardNumberInfo>> queryForwardService(String userNumber);
	
	Integer unsetForwardService(String userNumber, String fwdType);
	
	UCSDKResponse<String> setBlackWhiteListState(String userNumber, String bwListFlag);
	
	Integer setBlackWhiteService(String userNumber, String optCode, String flowType, String bwListFlag, List<BlackWhiteNumberScope> blackWhiteNumberScopes);
	
	UCSDKResponse<List<BlackWhiteList>> queryBlackWhiteService(String userNumber);
	
	Integer setOneNumber(String ucAccount, String optCode, String oneNumber);
	
	Integer setOneNumberService(String oneNumber, OneNumberService oneNumberService);
	
	Integer setBindingNumber(String ucAccount, String oneNumber, String operationType, BindingNumber bindingNumber);
	
	UCSDKResponse<OneNumberService> queryOneNumberService(String ucAccount, String oneNumber);
	
	UCSDKResponse< List<BindingNumber>> queryBindingNumber(String oneNumber);
	
}
