package com.huawei.esdk.uc.professional.local;

import com.huawei.esdk.uc.professional.local.call.CallServiceEx;
import com.huawei.esdk.uc.professional.local.callback.CallbackServiceEx;
import com.huawei.esdk.uc.professional.local.clientmanager.ClientManagerServiceEx;
import com.huawei.esdk.uc.professional.local.conference.ConferenceServiceEx;
import com.huawei.esdk.uc.professional.local.im.IMServiceEx;
import com.huawei.esdk.uc.professional.local.impl.service.CallServiceExImpl;
import com.huawei.esdk.uc.professional.local.impl.service.ClientManagerServiceExImpl;
import com.huawei.esdk.uc.professional.local.impl.service.ConferenceServiceExImpl;
import com.huawei.esdk.uc.professional.local.impl.service.IMServiceExImpl;
import com.huawei.esdk.uc.professional.local.impl.service.UserProfileServiceExImpl;
import com.huawei.esdk.uc.professional.local.impl.service.VoiceServiceExImpl;
import com.huawei.esdk.uc.professional.local.impl.service.callback.CallbackServiceExImpl;
import com.huawei.esdk.uc.professional.local.userprofile.UserProfileServiceEx;
import com.huawei.esdk.uc.professional.local.voice.VoiceServiceEx;

public class ServiceFactoryEx
{
	static
	{
		System.setProperty("org.apache.cxf.JDKBugHacks.defaultUsesCaches", "true");
	}
	
    @SuppressWarnings("unchecked")
    public static <T> T getService(Class<? extends T> interfaceClass)
    {
        if (interfaceClass.getName().equals(ConferenceServiceEx.class.getName()))
        {
            return (T) ConferenceServiceExImpl.getInstance();
        }
        else if (interfaceClass.getName().equals(CallServiceEx.class.getName()))
        {
            return (T) CallServiceExImpl.getInstance();
        }
        else if (interfaceClass.getName().equals(IMServiceEx.class.getName()))
        {
            return (T) IMServiceExImpl.getInstance();
        }
        else if (interfaceClass.getName().equals(UserProfileServiceEx.class.getName()))
        {
            return (T) UserProfileServiceExImpl.getInstance();
        }
        else if (interfaceClass.getName().equals(VoiceServiceEx.class.getName()))
        {
            return (T) VoiceServiceExImpl.getInstance();
        }
        else if (interfaceClass.getName().equals(ClientManagerServiceEx.class.getName()))
        {
            return (T) ClientManagerServiceExImpl.getInstance();
        }
        else if (interfaceClass.getName().equals(CallbackServiceEx.class.getName()))
        {
            return (T) CallbackServiceExImpl.getInstance();
        }
       
   
        return null;
    }

}
