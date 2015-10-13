package com.huawei.esdk.uc.professional.local.impl.service.callback;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.huawei.esdk.uc.professional.local.callback.CallCallback;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyCTDStatus;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyCTDStatusResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.ObjectFactory;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.UCProfessionalCTD;

@WebService(targetNamespace = "esdk_uc_professional_server", name = "UCProfessional.CTD")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class UCProfessionalCTDImpl implements UCProfessionalCTD
{
    
    @Override
    @WebResult(name = "notifyCTDStatusResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.notifyCTDStatus")
    public NotifyCTDStatusResponse notifyCTDStatus(
        @WebParam(partName = "parameters", name = "notifyCTDStatus", targetNamespace = "esdk_uc_professional_server")
        NotifyCTDStatus parameters)
    {
        CallCallback callCallback = (CallCallback)CallbackServiceExImpl.callbacks.get(CallCallback.class);
        callCallback.notifyCTDStatus(parameters.getInitiator(), parameters.getCallId(), parameters.getStatus());
        return new NotifyCTDStatusResponse();
    }
}
