package com.huawei.esdk.uc.professional.local.impl.service.callback;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.cxf.common.util.StringUtils;

import com.huawei.esdk.uc.professional.local.bean.callback.ConfInfoNotify;
import com.huawei.esdk.uc.professional.local.callback.ConferenceCallback;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyConfInfo;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyConfInfoResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyConfStatus;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.NotifyConfStatusResponse;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.ObjectFactory;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.UCProfessionalCTC;
import com.huawei.esdk.uc.professional.local.impl.utils.AES128Utils;

@WebService(targetNamespace = "esdk_uc_professional_server", name = "UCProfessional.CTC")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class UCProfessionalCTCImpl implements UCProfessionalCTC
{
    
    @Override
    @WebResult(name = "notifyConfStatusResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.notifyConfStatus")
    public NotifyConfStatusResponse notifyConfStatus(
        @WebParam(partName = "parameters", name = "notifyConfStatus", targetNamespace = "esdk_uc_professional_server")
        NotifyConfStatus parameters)
    {
        ConferenceCallback conferenceCallback =
            (ConferenceCallback)CallbackServiceExImpl.callbacks.get(ConferenceCallback.class);
        conferenceCallback.notifyConfStatus(parameters.getInitiator(),
            parameters.getConfId(),
            parameters.getConfMessageType(),
            parameters.getResult(),
            parameters.getMemberNumber());
        return new NotifyConfStatusResponse();
    }
    
    //	@Override
    //	public NotifyCCConfInfoResponse notifyCCConfInfo(NotifyCCConfInfo parameters) {
    //		ConferenceCallback conferenceCallback = (ConferenceCallback) CallbackServiceExImpl.callbacks.get(ConferenceCallback.class);
    //		conferenceCallback.notifyCCConfInfo(parameters.getConfId(), parameters.getEventId(), parameters.getConfStatus(), parameters.getConfUser());
    //		return new NotifyCCConfInfoResponse();
    //	}
    
    @Override
    @WebResult(name = "notifyConfInfoResponse", targetNamespace = "esdk_uc_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_uc_professional_server.notifyConfInfo")
    public NotifyConfInfoResponse notifyConfInfo(
        @WebParam(partName = "parameters", name = "notifyConfInfo", targetNamespace = "esdk_uc_professional_server")
        NotifyConfInfo parameters)
    {
        
        ConferenceCallback conferenceCallback =
            (ConferenceCallback)CallbackServiceExImpl.callbacks.get(ConferenceCallback.class);
        
        ConfInfoNotify confInfo = parameters.getConfInfoNotify();
        
        if (null != confInfo)
        {
            if (!StringUtils.isEmpty(confInfo.getChairmanPassword()))
            {
                confInfo.setChairmanPassword(AES128Utils.decodeFromBase64(confInfo.getChairmanPassword()));
            }
            if (!StringUtils.isEmpty(confInfo.getMemberPassword()))
            {
                confInfo.setMemberPassword(AES128Utils.decodeFromBase64(confInfo.getMemberPassword()));
            }
        }
        
        conferenceCallback.notifyConfInfo(parameters.getChangeEvent(), confInfo);
        return new NotifyConfInfoResponse();
    }
    
}
