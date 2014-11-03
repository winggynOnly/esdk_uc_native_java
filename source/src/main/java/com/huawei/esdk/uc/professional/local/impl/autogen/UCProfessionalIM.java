package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-15T18:36:15.965+08:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "esdk_uc_professional_server", name = "UCProfessional.IM")
@XmlSeeAlso({ObjectFactory.class})
public interface UCProfessionalIM {

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "appSendMsgToDept", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.AppSendMsgToDept")
    @WebMethod(action = "esdk_uc_professional_server.appSendMsgToDept")
    @ResponseWrapper(localName = "appSendMsgToDeptResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.AppSendMsgToDeptResponse")
    public java.lang.Integer appSendMsgToDept(
        @WebParam(name = "sendNumber", targetNamespace = "")
        java.lang.String sendNumber,
        @WebParam(name = "deptNumber", targetNamespace = "")
        java.lang.String deptNumber,
        @WebParam(name = "message", targetNamespace = "")
        java.lang.String message,
        @WebParam(name = "subject", targetNamespace = "")
        java.lang.String subject
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "appSendMsgToGroup", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.AppSendMsgToGroup")
    @WebMethod(action = "esdk_uc_professional_server.appSendMsgToGroup")
    @ResponseWrapper(localName = "appSendMsgToGroupResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.AppSendMsgToGroupResponse")
    public java.lang.Integer appSendMsgToGroup(
        @WebParam(name = "sendNumber", targetNamespace = "")
        java.lang.String sendNumber,
        @WebParam(name = "groupId", targetNamespace = "")
        java.lang.String groupId,
        @WebParam(name = "groupCreator", targetNamespace = "")
        java.lang.String groupCreator,
        @WebParam(name = "message", targetNamespace = "")
        java.lang.String message,
        @WebParam(name = "dateTime", targetNamespace = "")
        java.util.Date dateTime
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "appSendMsgToUC", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.AppSendMsgToUC")
    @WebMethod(action = "esdk_uc_professional_server.appSendMsgToUC")
    @ResponseWrapper(localName = "appSendMsgToUCResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.AppSendMsgToUCResponse")
    public java.lang.Integer appSendMsgToUC(
        @WebParam(name = "sendNumber", targetNamespace = "")
        java.lang.String sendNumber,
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "message", targetNamespace = "")
        java.lang.String message,
        @WebParam(name = "dateTime", targetNamespace = "")
        java.util.Date dateTime
    );
}