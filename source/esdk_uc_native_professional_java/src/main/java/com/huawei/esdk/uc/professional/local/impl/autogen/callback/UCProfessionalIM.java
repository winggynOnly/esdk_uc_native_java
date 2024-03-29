package com.huawei.esdk.uc.professional.local.impl.autogen.callback;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2013-09-30T09:21:28.108+08:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "esdk_uc_professional_server", name = "UCProfessional.IM")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UCProfessionalIM {

    @WebResult(name = "notifyAppMsgResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.notifyAppMsg")
    public NotifyAppMsgResponse notifyAppMsg(
        @WebParam(partName = "parameters", name = "notifyAppMsg", targetNamespace = "esdk_uc_professional_server")
        NotifyAppMsg parameters
    );
}
