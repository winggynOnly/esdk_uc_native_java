package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.huawei.esdk.uc.professional.local.bean.LinkmanInfo;
import com.huawei.esdk.uc.professional.local.bean.PersonalChangeInfo;
import com.huawei.esdk.uc.professional.local.bean.PersonalInfo;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-15T18:36:15.949+08:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "esdk_uc_professional_server", name = "UCProfessional.UserProfile.PersonList")
@XmlSeeAlso({ObjectFactory.class})
public interface UCProfessionalUserProfilePersonList {

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "delLinkmanTeam", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.DelLinkmanTeam")
    @WebMethod(action = "esdk_uc_professional_server.delLinkmanTeam")
    @ResponseWrapper(localName = "delLinkmanTeamResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.DelLinkmanTeamResponse")
    public java.lang.Integer delLinkmanTeam(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "teamId", targetNamespace = "")
        java.lang.String teamId
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "modifyLinkmanTeam", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.ModifyLinkmanTeam")
    @WebMethod(action = "esdk_uc_professional_server.modifyLinkmanTeam")
    @ResponseWrapper(localName = "modifyLinkmanTeamResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.ModifyLinkmanTeamResponse")
    public java.lang.Integer modifyLinkmanTeam(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "teamId", targetNamespace = "")
        java.lang.String teamId,
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "delMemberFromTeam", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.DelMemberFromTeam")
    @WebMethod(action = "esdk_uc_professional_server.delMemberFromTeam")
    @ResponseWrapper(localName = "delMemberFromTeamResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.DelMemberFromTeamResponse")
    public java.lang.Integer delMemberFromTeam(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "teamId", targetNamespace = "")
        java.lang.String teamId,
        @WebParam(name = "linkmanId", targetNamespace = "")
        java.lang.String linkmanId
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "addLinkman", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.AddLinkman")
    @WebMethod(action = "esdk_uc_professional_server.addLinkman")
    @ResponseWrapper(localName = "addLinkmanResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.AddLinkmanResponse")
    public java.lang.Integer addLinkman(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "linkmanInfo", targetNamespace = "")
        com.huawei.esdk.uc.professional.local.bean.LinkmanInfo linkmanInfo,
        @WebParam(name = "teamId", targetNamespace = "")
        java.lang.String teamId
    );

    @RequestWrapper(localName = "getPersonTeamInfo", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.GetPersonTeamInfo")
    @WebMethod(action = "esdk_uc_professional_server.getPersonTeamInfo")
    @ResponseWrapper(localName = "getPersonTeamInfoResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.GetPersonTeamInfoResponse")
    public void getPersonTeamInfo(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "personalTeam", targetNamespace = "")
        javax.xml.ws.Holder<java.util.List<com.huawei.esdk.uc.professional.local.bean.PersonalTeam>> personalTeam
    );

    @RequestWrapper(localName = "getPersonIncAddressBook", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.GetPersonIncAddressBook")
    @WebMethod(action = "esdk_uc_professional_server.getPersonIncAddressBook")
    @ResponseWrapper(localName = "getPersonIncAddressBookResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.GetPersonIncAddressBookResponse")
    public void getPersonIncAddressBook(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "timeStamp", targetNamespace = "")
        java.util.Date timeStamp,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "personalChangeInfo", targetNamespace = "")
        javax.xml.ws.Holder<PersonalChangeInfo> personalChangeInfo
    );

    @RequestWrapper(localName = "addLinkmanTeam", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.AddLinkmanTeam")
    @WebMethod(action = "esdk_uc_professional_server.addLinkmanTeam")
    @ResponseWrapper(localName = "addLinkmanTeamResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.AddLinkmanTeamResponse")
    public void addLinkmanTeam(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "teamId", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> teamId
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "modifyTeamSN", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.ModifyTeamSN")
    @WebMethod(action = "esdk_uc_professional_server.modifyTeamSN")
    @ResponseWrapper(localName = "modifyTeamSNResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.ModifyTeamSNResponse")
    public java.lang.Integer modifyTeamSN(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "personalTeam", targetNamespace = "")
        com.huawei.esdk.uc.professional.local.bean.PersonalTeam personalTeam
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "addMemberToTeam", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.AddMemberToTeam")
    @WebMethod(action = "esdk_uc_professional_server.addMemberToTeam")
    @ResponseWrapper(localName = "addMemberToTeamResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.AddMemberToTeamResponse")
    public java.lang.Integer addMemberToTeam(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "teamId", targetNamespace = "")
        java.lang.String teamId,
        @WebParam(name = "linkmanId", targetNamespace = "")
        java.lang.String linkmanId
    );

    @RequestWrapper(localName = "getLinkmanInfo", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.GetLinkmanInfo")
    @WebMethod(action = "esdk_uc_professional_server.getLinkmanInfo")
    @ResponseWrapper(localName = "getLinkmanInfoResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.GetLinkmanInfoResponse")
    public void getLinkmanInfo(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "linkmanId", targetNamespace = "")
        java.lang.String linkmanId,
        @WebParam(name = "queryType", targetNamespace = "")
        java.lang.Integer queryType,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "linkmanInfo", targetNamespace = "")
        javax.xml.ws.Holder<LinkmanInfo> linkmanInfo
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "delLinkman", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.DelLinkman")
    @WebMethod(action = "esdk_uc_professional_server.delLinkman")
    @ResponseWrapper(localName = "delLinkmanResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.DelLinkmanResponse")
    public java.lang.Integer delLinkman(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "teamId", targetNamespace = "")
        java.lang.String teamId,
        @WebParam(name = "linkmanId", targetNamespace = "")
        java.lang.String linkmanId
    );

    @RequestWrapper(localName = "getPersonAllAddressBook", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.GetPersonAllAddressBook")
    @WebMethod(action = "esdk_uc_professional_server.getPersonAllAddressBook")
    @ResponseWrapper(localName = "getPersonAllAddressBookResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.GetPersonAllAddressBookResponse")
    public void getPersonAllAddressBook(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "personalInfo", targetNamespace = "")
        javax.xml.ws.Holder<PersonalInfo> personalInfo
    );
}
