package com.huawei.esdk.demo.factory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.huawei.esdk.uc.professional.local.ServiceFactoryEx;
import com.huawei.esdk.uc.professional.local.call.CallServiceEx;
import com.huawei.esdk.uc.professional.local.conference.ConferenceServiceEx;
import com.huawei.esdk.uc.professional.local.im.IMServiceEx;

/**
 * 业务工厂管理类
 * 
 * @author  cWX191990
 * @see  [无]
 * @since  [eSDK IVS V100R003C00]
 */
public class ServiceFactory extends HttpServlet
{
    /**
     * 注释内容
     */
    private static final long serialVersionUID = 4659959607228940247L;
    
    /**
     * CTD模块服务接口
     */
    private static CallServiceEx callServiceEx;
    
    /**
     * 会议管理模块服务接口
     */
    private static ConferenceServiceEx conferenceServiceEx;
    
    /**
     * 应用即时消息模块服务接口
     */
    private static IMServiceEx imServiceEx;
    
    /** 
     * 重写init方法 
     */
    public void init(ServletConfig config)
        throws ServletException
    {
        super.init(config);
        
        // 从native包中ServiceFactoryEx类中获取相应的服务
        callServiceEx = ServiceFactoryEx.getService(CallServiceEx.class);
        conferenceServiceEx = ServiceFactoryEx.getService(ConferenceServiceEx.class);
        imServiceEx = ServiceFactoryEx.getService(IMServiceEx.class);
    }
    
    public static CallServiceEx getCallServiceEx()
    {
        return callServiceEx;
    }
    
    public static ConferenceServiceEx getConferenceServiceEx()
    {
        return conferenceServiceEx;
    }
    
    public static IMServiceEx getImServiceEx()
    {
        return imServiceEx;
    }
    
}
