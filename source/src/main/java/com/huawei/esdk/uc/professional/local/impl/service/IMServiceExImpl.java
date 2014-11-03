package com.huawei.esdk.uc.professional.local.impl.service;

import java.util.Date;

import com.huawei.esdk.uc.professional.local.im.IMServiceEx;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalIM;
import com.huawei.esdk.uc.professional.local.impl.utils.ClientProvider;
import com.huawei.esdk.uc.professional.local.impl.utils.ExceptionUtils;

public class IMServiceExImpl implements IMServiceEx {

	private UCProfessionalIM ucProfessionalIM = (UCProfessionalIM)ClientProvider.getClient(UCProfessionalIM.class);
	
    private static IMServiceExImpl instance = null;
	
	public static synchronized IMServiceExImpl getInstance()
	{
		if (null == instance) {
			instance = new IMServiceExImpl();
		}
		return instance;
	}

	@Override
	public Integer appSendMsgToUC(String sendNumber, String ucAccount,
			String message, Date dateTime) {
		try {
			return ucProfessionalIM.appSendMsgToUC(sendNumber, ucAccount, message, dateTime);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer appSendMsgToGroup(String sendNumber, String groupId,
			String groupCreator, String message, Date dateTime) {
		try {
			return ucProfessionalIM.appSendMsgToGroup(sendNumber, groupId, groupCreator, message, dateTime);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer appSendMsgToDept(String sendNumber, String deptNumber,
			String message, String subject) {
		try {
			return ucProfessionalIM.appSendMsgToDept(sendNumber, deptNumber, message, subject);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

//	@Override
//	public Integer appSendMsgToUCEx(String sendNumber, String ucAccount,
//			String message, Date dateTime) {
//		try {
//			return ucProfessionalIM.appSendMsgToUCEx(ucAccount, confId, number, talkMode);
//		} catch (Exception e) {
//			return ExceptionUtils.processSoapException(e);
//		}
//	}
//
//	@Override
//	public Integer appSendMsgToUCWithAD(String ucAccount, Integer receiverType,
//			String receiver, MsgInfo message) {
//		try {
//			return ucProfessionalIM.modifyTalkMode(ucAccount, confId, number, talkMode);
//		} catch (Exception e) {
//			return ExceptionUtils.processSoapException(e);
//		}
//	}
}
