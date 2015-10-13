package com.huawei.esdk.csdemo.common;

import com.huawei.esdk.uc.professional.local.ServiceFactoryEx;
import com.huawei.esdk.uc.professional.local.call.CallServiceEx;
import com.huawei.esdk.uc.professional.local.conference.ConferenceServiceEx;
import com.huawei.esdk.uc.professional.local.im.IMServiceEx;

public class ServiceFactory {
    
    // native服务单例
	private static ServiceFactory instance;
	
	// CTD模块服务接口
	private CallServiceEx callServiceEx;

	// CTC模块服务接口
	private ConferenceServiceEx conferenceServiceEx;
	
    // IM模块服务接口
	private IMServiceEx imServiceEx;
	
	private ServiceFactory()
	{
	    // 从native包中ServiceFactoryEx类中获取相应的服务 
	    callServiceEx = ServiceFactoryEx.getService(CallServiceEx.class);
	    conferenceServiceEx = ServiceFactoryEx.getService(ConferenceServiceEx.class);
	    imServiceEx = ServiceFactoryEx.getService(IMServiceEx.class);
	}
	
	//获取native服务单例
	public static ServiceFactory getInstance()
	{
		if(null == instance)
		{
			instance = new ServiceFactory();
		}
		return instance;
	}

    public CallServiceEx getCallServiceEx()
    {
        return callServiceEx;
    }

    public void setCallServiceEx(CallServiceEx callServiceEx)
    {
        this.callServiceEx = callServiceEx;
    }

    public ConferenceServiceEx getConferenceServiceEx()
    {
        return conferenceServiceEx;
    }

    public void setConferenceServiceEx(ConferenceServiceEx conferenceServiceEx)
    {
        this.conferenceServiceEx = conferenceServiceEx;
    }

    public IMServiceEx getIMServiceEx()
    {
        return imServiceEx;
    }

    public void setIMServiceEx(IMServiceEx imServiceEx)
    {
        this.imServiceEx = imServiceEx;
    }

}
