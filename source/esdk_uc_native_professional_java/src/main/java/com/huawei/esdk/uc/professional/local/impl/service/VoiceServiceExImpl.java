package com.huawei.esdk.uc.professional.local.impl.service;

import java.util.List;

import javax.xml.ws.Holder;

import com.huawei.esdk.uc.professional.local.bean.BindingNumber;
import com.huawei.esdk.uc.professional.local.bean.BlackWhiteList;
import com.huawei.esdk.uc.professional.local.bean.BlackWhiteNumberScope;
import com.huawei.esdk.uc.professional.local.bean.ForwardNumberInfo;
import com.huawei.esdk.uc.professional.local.bean.OneNumberService;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalVoiceServiceBlackWhiteNumber;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalVoiceServiceForwardNumber;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalVoiceServiceOneNumber;
import com.huawei.esdk.uc.professional.local.impl.utils.ClientProvider;
import com.huawei.esdk.uc.professional.local.impl.utils.ExceptionUtils;
import com.huawei.esdk.uc.professional.local.voice.VoiceServiceEx;

public class VoiceServiceExImpl implements VoiceServiceEx {

	private UCProfessionalVoiceServiceForwardNumber ucProfessionalVoiceServiceForwardNumber = (UCProfessionalVoiceServiceForwardNumber) ClientProvider
			.getClient(UCProfessionalVoiceServiceForwardNumber.class);
	private UCProfessionalVoiceServiceOneNumber ucProfessionalVoiceServiceOneNumber = (UCProfessionalVoiceServiceOneNumber) ClientProvider
			.getClient(UCProfessionalVoiceServiceOneNumber.class);
	private UCProfessionalVoiceServiceBlackWhiteNumber ucProfessionalVoiceServiceBlackWhiteNumber  = (UCProfessionalVoiceServiceBlackWhiteNumber) ClientProvider
	.getClient(UCProfessionalVoiceServiceBlackWhiteNumber.class);
	
	private static VoiceServiceExImpl instance = null;

	public static synchronized VoiceServiceExImpl getInstance() {
		if (null == instance) {
			instance = new VoiceServiceExImpl();
		}
		return instance;
	}

	@Override
	public Integer setForwardService(String userNumber, String fwdType,
			String fwdNumber) {
		try {
			return ucProfessionalVoiceServiceForwardNumber.setForwardService(
					userNumber, fwdType, fwdNumber);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<List<ForwardNumberInfo>> queryForwardService(
			String userNumber) {
		UCSDKResponse<List<ForwardNumberInfo>> result = new UCSDKResponse<List<ForwardNumberInfo>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<ForwardNumberInfo>> forwardNumberInfo = new Holder<List<ForwardNumberInfo>>();
		try {
			ucProfessionalVoiceServiceForwardNumber.queryForwardService(userNumber, resultCode, forwardNumberInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? forwardNumberInfo.value : null);
		
		return result;
	}

	@Override
	public Integer unsetForwardService(String userNumber, String fwdType) {
		try {
			return ucProfessionalVoiceServiceForwardNumber.unsetForwardService(
					userNumber, fwdType);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<String> setBlackWhiteListState(String userNumber,
			String bwListFlag) {
		UCSDKResponse<String> result = new UCSDKResponse<String>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<String> resultMessage = new Holder<String>();
		try {
			ucProfessionalVoiceServiceBlackWhiteNumber.setBlackWhiteListState(userNumber, bwListFlag, resultCode, resultMessage);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? resultMessage.value : null);
		
		return result;
	}

	@Override
	public Integer setBlackWhiteService(String userNumber, String optCode,
			String flowType, String bwListFlag,
			List<BlackWhiteNumberScope> screenNums) {
		try {
			return ucProfessionalVoiceServiceBlackWhiteNumber.setBlackWhiteService(userNumber, optCode, flowType, bwListFlag, screenNums);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<List<BlackWhiteList>> queryBlackWhiteService(
			String userNumber) {
		UCSDKResponse<List<BlackWhiteList>> result = new UCSDKResponse<List<BlackWhiteList>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<BlackWhiteList>> blackWhiteList = new Holder<List<BlackWhiteList>>();
		try {
			ucProfessionalVoiceServiceBlackWhiteNumber.queryBlackWhiteService(userNumber, resultCode, blackWhiteList);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? blackWhiteList.value : null);
		
		return result;
	}

	@Override
	public Integer setOneNumber(String ucAccount, String optCode,
			String oneNumber) {
		try {
			return ucProfessionalVoiceServiceOneNumber.setOneNumber(ucAccount, optCode, oneNumber);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer setOneNumberService(String oneNumber,
			OneNumberService oneNumberInfo) {
		try {
			return ucProfessionalVoiceServiceOneNumber.setOneNumberService(oneNumber, oneNumberInfo);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer setBindingNumber(String ucAccount, String oneNumber,
			String operationType, BindingNumber bindingNumber) {
		try {
			return ucProfessionalVoiceServiceOneNumber.setBindingNumber(ucAccount, oneNumber, operationType, bindingNumber);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<OneNumberService> queryOneNumberService(
			String ucAccount, String oneNumber) {
		UCSDKResponse<OneNumberService> result = new UCSDKResponse<OneNumberService>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<OneNumberService> oneNumberService = new Holder<OneNumberService>();
		try {
			ucProfessionalVoiceServiceOneNumber.queryOneNumberService(ucAccount, oneNumber, resultCode, oneNumberService);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? oneNumberService.value : null);
		
		return result;
	}

	@Override
	public UCSDKResponse<List<BindingNumber>> queryBindingNumber(
			String oneNumber) {
		UCSDKResponse<List<BindingNumber>> result = new UCSDKResponse<List<BindingNumber>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<BindingNumber>> bindingNumber = new Holder<List<BindingNumber>>();
		try {
			ucProfessionalVoiceServiceOneNumber.queryBindingNumber(oneNumber, resultCode, bindingNumber);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? bindingNumber.value : null);
		
		return result;
	}

}
