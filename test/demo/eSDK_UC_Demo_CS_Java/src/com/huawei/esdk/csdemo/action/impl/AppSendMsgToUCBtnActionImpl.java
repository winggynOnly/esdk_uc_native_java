package com.huawei.esdk.csdemo.action.impl;

import java.util.Date;
import com.huawei.esdk.csdemo.action.DemoAction;
import com.huawei.esdk.csdemo.common.DemoException;
import com.huawei.esdk.csdemo.common.ServiceFactory;
import com.huawei.esdk.csdemo.convert.IMServiceConvert;
import com.huawei.esdk.uc.professional.local.im.IMServiceEx;

public class AppSendMsgToUCBtnActionImpl implements DemoAction
{
    @Override
    public void executeNativeMethod()
    {
        //初始化消息服务，该服务中包含应用即时消息的相关接口
        IMServiceEx imServiceEx = ServiceFactory.getInstance().getIMServiceEx();
        
        //设置入参
        StringBuffer sendNumber = new StringBuffer();
        StringBuffer ucAccount = new StringBuffer();
        StringBuffer message = new StringBuffer();
        Date dateTime = new Date();
        
        //从面板中拿到所有参数
        try
        {
        	IMServiceConvert.getParametersFromAppSendMsgToUCFrame(sendNumber,ucAccount,message,dateTime);
	    }
	    catch (DemoException e)
	    {
	        //界面上输入参数类型错误时，显示错误信息
	    	IMServiceConvert.showConvertErrInfo(e.getErrInfo());
	        return;
	    }
 
        //返回发送消息结果，result包含错误码
        Integer result = imServiceEx.appSendMsgToUC(sendNumber.toString(), 
            ucAccount.toString(), message.toString(), dateTime);
        
        //把返回结果渲染到面板中
        IMServiceConvert.showResultInAppSendMsgToUcFrame(result);

    }

}
