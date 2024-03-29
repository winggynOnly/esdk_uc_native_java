package com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-09-09T19:36:59.529+08:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "esdk_uc_professional_server", name = "UCProfessional.Client.PublicGroup")
@XmlSeeAlso({ObjectFactory.class})
public interface UCProfessionalClientPublicGroup {

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "applyQuitGroup", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.ApplyQuitGroup")
    @WebMethod(action = "esdk_uc_professional_server.applyQuitGroup")
    @ResponseWrapper(localName = "applyQuitGroupResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.ApplyQuitGroupResponse")
    public java.lang.Integer applyQuitGroup(
        @WebParam(name = "groupId", targetNamespace = "")
        java.lang.String groupId,
        @WebParam(name = "groupName", targetNamespace = "")
        java.lang.String groupName,
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "creator", targetNamespace = "")
        java.lang.String creator
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "applyJoinGroup", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.ApplyJoinGroup")
    @WebMethod(action = "esdk_uc_professional_server.applyJoinGroup")
    @ResponseWrapper(localName = "applyJoinGroupResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.ApplyJoinGroupResponse")
    public java.lang.Integer applyJoinGroup(
        @WebParam(name = "groupId", targetNamespace = "")
        java.lang.String groupId,
        @WebParam(name = "groupName", targetNamespace = "")
        java.lang.String groupName,
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "creator", targetNamespace = "")
        java.lang.String creator
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "replyGroupApply", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.ReplyGroupApply")
    @WebMethod(action = "esdk_uc_professional_server.replyGroupApply")
    @ResponseWrapper(localName = "replyGroupApplyResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.ReplyGroupApplyResponse")
    public java.lang.Integer replyGroupApply(
        @WebParam(name = "groupId", targetNamespace = "")
        java.lang.String groupId,
        @WebParam(name = "groupName", targetNamespace = "")
        java.lang.String groupName,
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "creator", targetNamespace = "")
        java.lang.String creator,
        @WebParam(name = "result", targetNamespace = "")
        java.lang.Integer result
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "replyGroupInvite", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.ReplyGroupInvite")
    @WebMethod(action = "esdk_uc_professional_server.replyGroupInvite")
    @ResponseWrapper(localName = "replyGroupInviteResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.ReplyGroupInviteResponse")
    public java.lang.Integer replyGroupInvite(
        @WebParam(name = "groupId", targetNamespace = "")
        java.lang.String groupId,
        @WebParam(name = "groupName", targetNamespace = "")
        java.lang.String groupName,
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "creator", targetNamespace = "")
        java.lang.String creator,
        @WebParam(name = "result", targetNamespace = "")
        java.lang.Integer result
    );
}
