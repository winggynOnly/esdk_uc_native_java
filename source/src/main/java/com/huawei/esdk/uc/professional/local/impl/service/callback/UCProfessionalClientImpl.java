package com.huawei.esdk.uc.professional.local.impl.service.callback;

import com.huawei.esdk.uc.professional.local.bean.callback.GroupInfo;
import com.huawei.esdk.uc.professional.local.callback.ClientCallback;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyClientRegisterStatus;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyClientRegisterStatusResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyFriendPresInfo;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyFriendPresInfoResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyGroupManage;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyGroupManageResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyMessage;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyMessageResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.UCProfessionalClient;

public class UCProfessionalClientImpl implements UCProfessionalClient {

	@Override
	public NotifyGroupManageResponse notifyGroupManage(
			NotifyGroupManage parameters) {
		ClientCallback clientCallback = (ClientCallback) CallbackServiceExImpl.callbacks.get(ClientCallback.class);
		GroupInfo groupInfo = parameters.getGroupInfo();
		com.huawei.esdk.uc.professional.local.bean.GroupInfo info = new com.huawei.esdk.uc.professional.local.bean.GroupInfo();
		info.setCreator(groupInfo.getCreator());
		info.setGroupDesc(groupInfo.getGroupDesc());
		info.setGroupId(groupInfo.getGroupId());
		info.setGroupName(groupInfo.getGroupName());
		info.setGroupNumber(groupInfo.getGroupNumber());
		info.setGroupOwner(groupInfo.getOwner());
		info.setGroupPost(groupInfo.getGroupPost());
		info.setMaxMember(groupInfo.getMaxNumber());
		info.setMaxShareFileSize(null);
		info.setReceiveMsg(null);
		info.setValidateType(groupInfo.getValidateType());
		
		info.setCreatorUrl(groupInfo.getCreatorUrl());
		
		clientCallback.notifyGroupManage(parameters.getMsgType(),parameters.getMsgId(), parameters.getUcAccount(), parameters.getMemAccount(), parameters.getCreatorName(), info, parameters.getResult());
		return new NotifyGroupManageResponse();
	}

//	@Override
//	public NotifyGroupInfoResponse notifyGroupInfo(NotifyGroupInfo parameters) {
//		ClientCallback clientCallback = (ClientCallback) CallbackServiceExImpl.callbacks.get(ClientCallback.class);
//		clientCallback.notifyGroupInfo(parameters.getMsgType(), parameters.getUcAccount(), parameters.getGroupId(), parameters.getCreator(), parameters.getGroupMemberChange(), parameters.getGroupInfo(), parameters.getGroupMember());
//		return new NotifyGroupInfoResponse();
//	}

	@Override
	public NotifyMessageResponse notifyMessage(NotifyMessage parameters) {
		ClientCallback clientCallback = (ClientCallback) CallbackServiceExImpl.callbacks.get(ClientCallback.class);
		clientCallback.notifyMessage(parameters.getMsgUserType(), parameters.getSender(), parameters.getSenderName(), parameters.getGroupId(), parameters.getRecver(), parameters.getMessage(), parameters.getCreator(), parameters.getCreatorUrl());
		return new NotifyMessageResponse();
	}

	@Override
	public NotifyFriendPresInfoResponse notifyFriendPresInfo(
			NotifyFriendPresInfo parameters) {
		ClientCallback clientCallback = (ClientCallback) CallbackServiceExImpl.callbacks.get(ClientCallback.class);
		clientCallback.notifyFriendPresInfo(parameters.getUcAccount(), parameters.getBuddyInfo(), parameters.getExpires());
		return new NotifyFriendPresInfoResponse();
	}

	@Override
	public NotifyClientRegisterStatusResponse notifyClientRegisterStatus(
			NotifyClientRegisterStatus parameters) {
		ClientCallback clientCallback = (ClientCallback) CallbackServiceExImpl.callbacks.get(ClientCallback.class);
		clientCallback.notifyClientRegisterStatus(parameters.getUcAccount(), parameters.getRegisterStatus(), parameters.getHandleId());
		return new NotifyClientRegisterStatusResponse();
	}


}
