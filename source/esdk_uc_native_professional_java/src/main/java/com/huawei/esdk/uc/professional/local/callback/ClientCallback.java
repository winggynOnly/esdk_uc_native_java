package com.huawei.esdk.uc.professional.local.callback;

import java.util.List;

import com.huawei.esdk.uc.professional.local.bean.callback.BuddyInfo;
import com.huawei.esdk.uc.professional.local.bean.GroupInfo;
import com.huawei.esdk.uc.professional.local.bean.callback.MessageInfo;

public interface ClientCallback  extends UCProfessionalCallback{
	
	void notifyClientRegisterStatus(String ucAccount,String registerStatus,String handleId);
	
	void notifyFriendPresInfo(String ucAccount,List<BuddyInfo> buddyInfo,Long expires);
	
	void notifyMessage(Integer msgUserType,String sender,String senderName,List<String> groupId,String recver,MessageInfo msg,String creator, String creatorUrl);
	
//	void notifyGroupInfo(Integer msgType,String ucAccount,String groupId,String creator,GroupMember groupMemberChange,GroupInfo groupInfo,List<GroupMember> groupMember);
	
	void notifyGroupManage(Integer msgType,String msgId, String ucAccount,String memAccount,String creatorName,GroupInfo groupInfo,List<String> result);
}
