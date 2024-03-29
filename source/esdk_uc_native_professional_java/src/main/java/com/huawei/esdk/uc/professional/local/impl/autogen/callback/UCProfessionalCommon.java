package com.huawei.esdk.uc.professional.local.impl.autogen.callback;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-09-30T09:21:28.119+08:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "esdk_uc_professional_server", name = "UCProfessional.common")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UCProfessionalCommon {

    @WebResult(name = "registerNotificationRequestResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.registerNotificationRequest")
    public RegisterNotificationRequestResponse registerNotificationRequest(
        @WebParam(partName = "parameters", name = "registerNotificationRequest", targetNamespace = "esdk_uc_professional_server")
        RegisterNotificationRequest parameters
    );

    @WebResult(name = "unregisterNotificationResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.unregisterNotification")
    public UnregisterNotificationResponse unregisterNotification(
        @WebParam(partName = "parameters", name = "unregisterNotification", targetNamespace = "esdk_uc_professional_server")
        UnregisterNotification parameters
    );
}
