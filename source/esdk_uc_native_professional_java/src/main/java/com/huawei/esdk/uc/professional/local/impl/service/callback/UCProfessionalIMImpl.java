package com.huawei.esdk.uc.professional.local.impl.service.callback;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.huawei.esdk.uc.professional.local.callback.IMCallback;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyAppMsg;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyAppMsgResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.ObjectFactory;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.UCProfessionalIM;

@WebService(targetNamespace = "esdk_uc_professional_server", name = "UCProfessional.IM")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class UCProfessionalIMImpl implements UCProfessionalIM
{
    
    @Override
    @WebResult(name = "notifyAppMsgResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.notifyAppMsg")
    public NotifyAppMsgResponse notifyAppMsg(
        @WebParam(partName = "parameters", name = "notifyAppMsg", targetNamespace = "esdk_uc_professional_server")
        NotifyAppMsg parameters)
    {
        IMCallback callback = (IMCallback)CallbackServiceExImpl.callbacks.get(IMCallback.class);
        callback.notifyAppMsg(parameters.getSendNumber(), parameters.getTargetNumber(), parameters.getMessage());
        return new NotifyAppMsgResponse();
    }
    
}
