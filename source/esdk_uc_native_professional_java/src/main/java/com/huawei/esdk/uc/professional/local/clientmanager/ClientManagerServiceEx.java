package com.huawei.esdk.uc.professional.local.clientmanager;

import java.util.Date;
import java.util.List;

import com.huawei.esdk.uc.professional.local.bean.QueryResultList;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;
import com.huawei.esdk.uc.professional.local.bean.clientmanager.MsgHistoryCondition;
import com.huawei.esdk.uc.professional.local.bean.clientmanager.MsgHistoryInfo;
import com.huawei.esdk.uc.professional.local.bean.clientmanager.MsgInfo;
import com.huawei.esdk.uc.professional.local.bean.clientmanager.ResPubPresInfo;
import com.huawei.esdk.uc.professional.local.bean.clientmanager.UserMobile;
import com.huawei.esdk.uc.professional.local.bean.PageInfo;
import com.huawei.esdk.uc.professional.local.bean.PresPublishInfo;

public interface ClientManagerServiceEx {

	Integer userLogin(String ucAccount, String pwd, String registerFunc);
	
	Integer userLogOut(String ucAccount);
	
	Integer setSignature (String ucAccount, String userInfo);
	
	UCSDKResponse<ResPubPresInfo> publishPresenceInfo(String ucAccount, PresPublishInfo presPublish, Long expires);
	
	UCSDKResponse<ResPubPresInfo> refreshPresInfo(String ucAccount, PresPublishInfo presPublish, Long expires, String etag);
	
	UCSDKResponse<Long> subPGM(String ucAccount, String subFlag, String groupUrl, String creator, Long expires);
	
	UCSDKResponse<Long> refreshSubscribePGM(String ucAccount, String subFlag, String groupUrl, String creator, Long expires);
	
	UCSDKResponse<List<UserMobile>> uploadMobileAddress(String ucAccount, List<String> mobilePhones);
	
	Integer uploadHeadImageId (String ucAccount, String headImageId);
	
	Integer sendMessage(String ucAccount, Integer recvType, String recver, MsgInfo msg);
	
	Integer withdrawMessage(Integer msgType, String sender, String recver, MsgInfo msg);
	
	Integer applyJoinGroup(String groupId, String groupName, String ucAccount, String creator);
	
	Integer applyQuitGroup(String groupId, String groupName, String ucAccount, String creator);
	
	Integer replyGroupApply(String groupId, String groupName, String ucAccount, String creator, Integer result);
	
	Integer replyGroupInvite(String groupId, String groupName, String ucAccount, String creator, Integer result);
	
	Integer markMsgReadFlag(String ucAccount,MsgHistoryCondition msgHistoryCondition, String msgId);
	
	UCSDKResponse <QueryResultList<MsgHistoryInfo>> getMsgLog(String ucAccount, MsgHistoryCondition msgHistoryCondition, PageInfo pageInfo);
	
	UCSDKResponse <QueryResultList<MsgHistoryInfo>> getMessage(String ucAccount, Date timeStamp,  String msgType,PageInfo pageInfo);
	
	
}
