package com.huawei.esdk.uc.professional.local.conference;

import java.util.Date;
import java.util.List;

import com.huawei.esdk.uc.professional.local.bean.ConfSummary;
import com.huawei.esdk.uc.professional.local.bean.ConfUser;
import com.huawei.esdk.uc.professional.local.bean.ConferenceInfo;
import com.huawei.esdk.uc.professional.local.bean.PageInfo;
import com.huawei.esdk.uc.professional.local.bean.QueryResultList;
import com.huawei.esdk.uc.professional.local.bean.TerminalInConfInfo;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;

public interface ConferenceServiceEx {
	
	/**
	 * 发起会议
	 * @param confInfo
	 * @return
	 */
	UCSDKResponse<String> createConf(ConferenceInfo confInfo) ;
	
	/**
	 * 添加与会者
	 * @param ucAccount
	 * @param confId
	 * @param confUsers
	 * @return
	 */
	Integer addIntoConf(String ucAccount,String confId, List<ConfUser> confUsers);
	
	/**
	 * 修改与会者发话权
	 * @param ucAccount
	 * @param confId
	 * @param number
	 * @param talkMode
	 * @return
	 */
	Integer modifyTalkMode(String ucAccount,String confId,String number,Integer talkMode);
	
	/**
	 * 踢出与会者
	 * @param ucAccount
	 * @param confId
	 * @return
	 */
	Integer delFromConf(String ucAccount,String confId, List<ConfUser> confUsers);
	
	/**
	 * 终止CTC会议
	 * @param ucAccount
	 * @param confId
	 * @return
	 */
	Integer endConf(String ucAccount,String confId);
	
	/**
	 * 查询CTC会议列表
	 * @param initiator
	 * @param queryType
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	UCSDKResponse<QueryResultList<ConfSummary>> getConfList(String initiator,String queryType,Date beginTime,Date endTime,PageInfo pageInfo, String confType);
	
	/**
	 * 查询会场信息
	 * @param ucAccount
	 * @param confId
	 * @return
	 */
	UCSDKResponse<ConferenceInfo> getConfInfo(String ucAccount,String confId);
	
//	/**
//	 * 查询会议与会成员
//	 * @param initiator
//	 * @param confId
//	 * @return
//	 */
//	UCSDKResponse<ConfMemberInfo>  getConfMember (String initiator,String confId);
	
	/**
	 * 主动入会
	 * @param ucAccount
	 * @param confId
	 * @param number
	 * @param name
	 * @param role
	 * @return
	 */
	Integer joinConf(String ucAccount,String confId,String number,String name,String role);
	
	/**
	 * 升级会议类型为多媒体
	 * @param ucAccount
	 * @param confId
	 * @return
	 */
	Integer audioToVideoConf(String ucAccount,String confId);
	
	/**
	 * 上报终端类型
	 * @param ucAccount
	 * @param confId
	 * @param terminalType
	 * @param terminalIP
	 * @param location
	 * @return
	 */
	UCSDKResponse<TerminalInConfInfo> informTerminalType(String ucAccount, String confId, String terminalType, String terminalIP, String location);
	
	/**
	 * 订阅会场状态变化通知
	 * @param appId
	 * @param confId
	 * @return
	 */
	Integer subConfStatus(String appId,String confId);
	
//	/**
//	 * 邀请加入会议扩展接口
//	 * @param ucAccount
//	 * @param confUsers
//	 * @param confId
//	 * @param msgInfo
//	 * @param sendNumber
//	 * @param dateTime
//	 * @return
//	 */
//	Integer addIntoConfEx(String ucAccount,List<ConfUser> confUsers, String confId, String msgInfo, String sendNumber, Date dateTime);
//	
//	/**
//	 * 邀请加入会议扩展接口
//	 * @param ucAccount
//	 * @param joinConfInfo
//	 * @return
//	 */
//	Integer invateIntoConfEx(String ucAccount,JoinConfInfo joinConfInfo);
	
	/**
	 * 观看会场
	 * @param confId
	 * @param ucAccount
	 * @param videoSourceUri
	 * @param isLock
	 * @return
	 */
	Integer viewSite(String confId,String ucAccount,String videoSourceUri,Integer isLock);
}
