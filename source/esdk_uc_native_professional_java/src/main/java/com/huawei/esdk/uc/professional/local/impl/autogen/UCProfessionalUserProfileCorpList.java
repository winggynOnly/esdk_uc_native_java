package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.huawei.esdk.uc.professional.local.bean.CorpInfo;
import com.huawei.esdk.uc.professional.local.bean.DeptInfo;
import com.huawei.esdk.uc.professional.local.bean.PageInfo;
import com.huawei.esdk.uc.professional.local.bean.StaffInfo;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-15T18:36:15.824+08:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "esdk_uc_professional_server", name = "UCProfessional.UserProfile.CorpList")
@XmlSeeAlso({ObjectFactory.class})
public interface UCProfessionalUserProfileCorpList {

    @RequestWrapper(localName = "queryDeptListInfo", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryDeptListInfo")
    @WebMethod(action = "esdk_uc_professional_server.queryDeptListInfo")
    @ResponseWrapper(localName = "queryDeptListInfoResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryDeptListInfoResponse")
    public void queryDeptListInfo(
        @WebParam(name = "queryMode", targetNamespace = "")
        com.huawei.esdk.uc.professional.local.bean.QueryMode queryMode,
        @WebParam(name = "corpId", targetNamespace = "")
        java.lang.String corpId,
        @WebParam(name = "deptId", targetNamespace = "")
        java.lang.String deptId,
        @WebParam(name = "deptName", targetNamespace = "")
        java.lang.String deptName,
        @WebParam(name = "parentDeptId", targetNamespace = "")
        java.lang.String parentDeptId,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "pageInfo", targetNamespace = "")
        javax.xml.ws.Holder<PageInfo> pageInfo,
        @WebParam(mode = WebParam.Mode.OUT, name = "deptInfoBase", targetNamespace = "")
        javax.xml.ws.Holder<java.util.List<com.huawei.esdk.uc.professional.local.bean.DeptInfoBase>> deptInfoBase
    );

    @RequestWrapper(localName = "queryStaffInfo", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryStaffInfo")
    @WebMethod(action = "esdk_uc_professional_server.queryStaffInfo")
    @ResponseWrapper(localName = "queryStaffInfoResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryStaffInfoResponse")
    public void queryStaffInfo(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "staffInfo", targetNamespace = "")
        javax.xml.ws.Holder<StaffInfo> staffInfo
    );

    @RequestWrapper(localName = "queryStaffList", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryStaffList")
    @WebMethod(action = "esdk_uc_professional_server.queryStaffList")
    @ResponseWrapper(localName = "queryStaffListResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryStaffListResponse")
    public void queryStaffList(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "queryMode", targetNamespace = "")
        com.huawei.esdk.uc.professional.local.bean.QueryMode queryMode,
        @WebParam(name = "pageCond", targetNamespace = "")
        com.huawei.esdk.uc.professional.local.bean.PageQueryStaffCond pageCond,
        @WebParam(name = "offsetCond", targetNamespace = "")
        com.huawei.esdk.uc.professional.local.bean.OffsetQueryStaffCond offsetCond,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "pageInfo", targetNamespace = "")
        javax.xml.ws.Holder<PageInfo> pageInfo,
        @WebParam(mode = WebParam.Mode.OUT, name = "staffInfoBase", targetNamespace = "")
        javax.xml.ws.Holder<java.util.List<com.huawei.esdk.uc.professional.local.bean.StaffInfoBase>> staffInfoBase
    );

    @RequestWrapper(localName = "queryDeptInfo", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryDeptInfo")
    @WebMethod(action = "esdk_uc_professional_server.queryDeptInfo")
    @ResponseWrapper(localName = "queryDeptInfoResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryDeptInfoResponse")
    public void queryDeptInfo(
        @WebParam(name = "deptId", targetNamespace = "")
        java.lang.String deptId,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "deptInfo", targetNamespace = "")
        javax.xml.ws.Holder<DeptInfo> deptInfo
    );

    @RequestWrapper(localName = "queryCorpInfo", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryCorpInfo")
    @WebMethod(action = "esdk_uc_professional_server.queryCorpInfo")
    @ResponseWrapper(localName = "queryCorpInfoResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryCorpInfoResponse")
    public void queryCorpInfo(
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "corpInfo", targetNamespace = "")
        javax.xml.ws.Holder<CorpInfo> corpInfo
    );
}
