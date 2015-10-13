package com.huawei.esdk.uc.professional.local.impl.service.callback;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

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
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.ObjectFactory;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.UCProfessionalClient;

@WebService(targetNamespace = "esdk_uc_professional_server", name = "UCProfessional.Client")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class UCProfessionalClientImpl implements UCProfessionalClient
{
    
    @Override
    @WebResult(name = "notifyGroupManageResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.notifyGroupManage")
    public NotifyGroupManageResponse notifyGroupManage(
        @WebParam(partName = "parameters", name = "notifyGroupManage", targetNamespace = "esdk_uc_professional_server")
        NotifyGroupManage parameters)
    {
        ClientCallback clientCallback = (ClientCallback)CallbackServiceExImpl.callbacks.get(ClientCallback.class);
        GroupInfo groupInfo = parameters.getGroupInfo();
        com.huawei.esdk.uc.professional.local.bean.GroupInfo info =
            new com.huawei.esdk.uc.professional.local.bean.GroupInfo();
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
        
        clientCallback.notifyGroupManage(parameters.getMsgType(),
            parameters.getMsgId(),
            parameters.getUcAccount(),
            parameters.getMemAccount(),
            parameters.getCreatorName(),
            info,
            parameters.getResult());
        return new NotifyGroupManageResponse();
    }
    
    //	@Override
    //	public NotifyGroupInfoResponse notifyGroupInfo(NotifyGroupInfo parameters) {
    //		ClientCallback clientCallback = (ClientCallback) CallbackServiceExImpl.callbacks.get(ClientCallback.class);
    //		clientCallback.notifyGroupInfo(parameters.getMsgType(), parameters.getUcAccount(), parameters.getGroupId(), parameters.getCreator(), parameters.getGroupMemberChange(), parameters.getGroupInfo(), parameters.getGroupMember());
    //		return new NotifyGroupInfoResponse();
    //	}
    
    @Override
    @WebResult(name = "notifyMessageResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.notifyMessage")
    public NotifyMessageResponse notifyMessage(
        @WebParam(partName = "parameters", name = "notifyMessage", targetNamespace = "esdk_uc_professional_server")
        NotifyMessage parameters)
    {
        ClientCallback clientCallback = (ClientCallback)CallbackServiceExImpl.callbacks.get(ClientCallback.class);
        clientCallback.notifyMessage(parameters.getMsgUserType(),
            parameters.getSender(),
            parameters.getSenderName(),
            parameters.getGroupId(),
            parameters.getRecver(),
            parameters.getMessage(),
            parameters.getCreator(),
            parameters.getCreatorUrl());
        return new NotifyMessageResponse();
    }
    
    @Override
    @WebResult(name = "notifyFriendPresInfoResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.notifyFriendPresInfo")
    public NotifyFriendPresInfoResponse notifyFriendPresInfo(
        @WebParam(partName = "parameters", name = "notifyFriendPresInfo", targetNamespace = "esdk_uc_professional_server")
        NotifyFriendPresInfo parameters)
    {
        ClientCallback clientCallback = (ClientCallback)CallbackServiceExImpl.callbacks.get(ClientCallback.class);
        clientCallback.notifyFriendPresInfo(parameters.getUcAccount(),
            parameters.getBuddyInfo(),
            parameters.getExpires());
        return new NotifyFriendPresInfoResponse();
    }
    
    @Override
    @WebResult(name = "notifyClientRegisterStatusResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.notifyClientRegisterStatus")
    public NotifyClientRegisterStatusResponse notifyClientRegisterStatus(
        @WebParam(partName = "parameters", name = "notifyClientRegisterStatus", targetNamespace = "esdk_uc_professional_server")
        NotifyClientRegisterStatus parameters)
    {
        ClientCallback clientCallback = (ClientCallback)CallbackServiceExImpl.callbacks.get(ClientCallback.class);
        clientCallback.notifyClientRegisterStatus(parameters.getUcAccount(),
            parameters.getRegisterStatus(),
            parameters.getHandleId());
        return new NotifyClientRegisterStatusResponse();
    }
    
}
