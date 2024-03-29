package com.huawei.esdk.uc.professional.local.impl.autogen.callback;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-09-30T09:21:28.032+08:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "esdk_uc_professional_server", name = "UCProfessional.CTC")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UCProfessionalCTC {

    @WebResult(name = "notifyConfStatusResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.notifyConfStatus")
    public NotifyConfStatusResponse notifyConfStatus(
        @WebParam(partName = "parameters", name = "notifyConfStatus", targetNamespace = "esdk_uc_professional_server")
        NotifyConfStatus parameters
    );

    @WebResult(name = "notifyConfInfoResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.notifyConfInfo")
    public NotifyConfInfoResponse notifyConfInfo(
        @WebParam(partName = "parameters", name = "notifyConfInfo", targetNamespace = "esdk_uc_professional_server")
        NotifyConfInfo parameters
    );
}
