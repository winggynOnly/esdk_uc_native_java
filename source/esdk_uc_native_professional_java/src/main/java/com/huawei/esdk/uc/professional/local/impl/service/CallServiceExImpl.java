package com.huawei.esdk.uc.professional.local.impl.service;

import javax.xml.ws.Holder;

import com.huawei.esdk.uc.professional.local.bean.CallStatusInfo;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;
import com.huawei.esdk.uc.professional.local.call.CallServiceEx;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalCTD;
import com.huawei.esdk.uc.professional.local.impl.utils.ClientProvider;
import com.huawei.esdk.uc.professional.local.impl.utils.ExceptionUtils;

public class CallServiceExImpl implements CallServiceEx {
	
	private UCProfessionalCTD ucProfessionalCTD = (UCProfessionalCTD)ClientProvider.getClient(UCProfessionalCTD.class);

    private static CallServiceExImpl instance = null;

    
	public static synchronized CallServiceExImpl getInstance()
	{
		if (null == instance) {
			instance = new CallServiceExImpl();
		}
		return instance;
	}

	@Override
	public UCSDKResponse<String> dialCall(String initiator, String caller,
			String callee) {
		UCSDKResponse<String> result = new UCSDKResponse<String>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<String> callId = new Holder<String>();
		try {
			ucProfessionalCTD.dialCall(initiator, caller, callee, resultCode, callId);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? callId.value : null);
		
		return result;
	}

	@Override
	public Integer releaseCall(String callId) {
		try {
			return ucProfessionalCTD.releaseCall(callId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<CallStatusInfo> getCallStatus(String callId) {
		UCSDKResponse<CallStatusInfo> result = new UCSDKResponse<CallStatusInfo>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<CallStatusInfo> callStatusInfo = new Holder<CallStatusInfo>();
		try {
			ucProfessionalCTD.getCallStatus(callId, resultCode, callStatusInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? callStatusInfo.value : null);
		
		return result;
	}


}
