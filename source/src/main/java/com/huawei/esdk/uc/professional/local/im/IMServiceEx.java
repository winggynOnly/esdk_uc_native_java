package com.huawei.esdk.uc.professional.local.im;

import java.util.Date;

public interface IMServiceEx {
	
	/**
	 * 向UC用户发送消息
	 * @param sendNumber
	 * @param ucAccount
	 * @param message
	 * @param dateTime
	 * @return
	 */
	Integer appSendMsgToUC(String sendNumber,String ucAccount,String message,Date dateTime);

	/**
	 * 向群组发送消息
	 * @param sendNumber
	 * @param groupId
	 * @param groudCreator
	 * @param message
	 * @param dateTime
	 * @return
	 */
	Integer appSendMsgToGroup(String sendNumber,String groupId,String groudCreator, String message , Date dateTime);
	
	/**
	 * 向部门发送系统通知消息
	 * @param sendNumber
	 * @param deptNo
	 * @param message
	 * @param subject
	 * @return
	 */
	Integer appSendMsgToDept(String sendNumber,String deptNumber,String message,String subject);
	
//	/**
//	 * 增强型消息接口
//	 * @param sendNumber
//	 * @param ucAccount
//	 * @param message
//	 * @param dateTime
//	 * @return
//	 */
//	Integer appSendMsgToUCEx(String sendNumber,String ucAccount,String message,Date dateTime);
//	
//	/**
//	 * 通讯录集成消息发送接口
//	 * @param ucAccount
//	 * @param receiverType
//	 * @param receiver
//	 * @param message
//	 * @return
//	 */
//	Integer appSendMsgToUCWithAD(String ucAccount,Integer receiverType,String receiver,MsgInfo message);
	
	
}
