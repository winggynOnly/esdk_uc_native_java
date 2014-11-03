package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.huawei.esdk.uc.professional.local.bean.OneNumberService;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-10-15T18:36:15.839+08:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "esdk_uc_professional_server", name = "UCProfessional.VoiceService.OneNumber")
@XmlSeeAlso({ObjectFactory.class})
public interface UCProfessionalVoiceServiceOneNumber {

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "setBindingNumber", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.SetBindingNumber")
    @WebMethod(action = "esdk_uc_professional_server.setBindingNumber")
    @ResponseWrapper(localName = "setBindingNumberResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.SetBindingNumberResponse")
    public java.lang.Integer setBindingNumber(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "oneNumber", targetNamespace = "")
        java.lang.String oneNumber,
        @WebParam(name = "operationType", targetNamespace = "")
        java.lang.String operationType,
        @WebParam(name = "bindingNumber", targetNamespace = "")
        com.huawei.esdk.uc.professional.local.bean.BindingNumber bindingNumber
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "setOneNumber", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.SetOneNumber")
    @WebMethod(action = "esdk_uc_professional_server.setOneNumber")
    @ResponseWrapper(localName = "setOneNumberResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.SetOneNumberResponse")
    public java.lang.Integer setOneNumber(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "operationType", targetNamespace = "")
        java.lang.String operationType,
        @WebParam(name = "oneNumber", targetNamespace = "")
        java.lang.String oneNumber
    );

    @RequestWrapper(localName = "queryOneNumberService", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryOneNumberService")
    @WebMethod(action = "esdk_uc_professional_server.queryOneNumberService")
    @ResponseWrapper(localName = "queryOneNumberServiceResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryOneNumberServiceResponse")
    public void queryOneNumberService(
        @WebParam(name = "ucAccount", targetNamespace = "")
        java.lang.String ucAccount,
        @WebParam(name = "oneNumber", targetNamespace = "")
        java.lang.String oneNumber,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "oneNumberService", targetNamespace = "")
        javax.xml.ws.Holder<OneNumberService> oneNumberService
    );

    @RequestWrapper(localName = "queryBindingNumber", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryBindingNumber")
    @WebMethod(action = "esdk_uc_professional_server.queryBindingNumber")
    @ResponseWrapper(localName = "queryBindingNumberResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.QueryBindingNumberResponse")
    public void queryBindingNumber(
        @WebParam(name = "oneNumber", targetNamespace = "")
        java.lang.String oneNumber,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "bindingNumber", targetNamespace = "")
        javax.xml.ws.Holder<java.util.List<com.huawei.esdk.uc.professional.local.bean.BindingNumber>> bindingNumber
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "setOneNumberService", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.SetOneNumberService")
    @WebMethod(action = "esdk_uc_professional_server.setOneNumberService")
    @ResponseWrapper(localName = "setOneNumberServiceResponse", targetNamespace = "esdk_uc_professional_server", className = "com.huawei.esdk.uc.professional.local.impl.autogen.SetOneNumberServiceResponse")
    public java.lang.Integer setOneNumberService(
        @WebParam(name = "oneNumber", targetNamespace = "")
        java.lang.String oneNumber,
        @WebParam(name = "oneNumberService", targetNamespace = "")
        com.huawei.esdk.uc.professional.local.bean.OneNumberService oneNumberService
    );
}