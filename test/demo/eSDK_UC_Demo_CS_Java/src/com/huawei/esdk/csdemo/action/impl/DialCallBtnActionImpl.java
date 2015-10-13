package com.huawei.esdk.csdemo.action.impl;

import com.huawei.esdk.csdemo.action.DemoAction;
import com.huawei.esdk.csdemo.common.ServiceFactory;
import com.huawei.esdk.csdemo.convert.CallServiceConvert;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;
import com.huawei.esdk.uc.professional.local.call.CallServiceEx;

public class DialCallBtnActionImpl implements DemoAction
{
    
    @Override
    public void executeNativeMethod()
    {
        //初始化呼叫管理服务，该服务中包含呼叫管理的相关接口
        CallServiceEx callServiceEx = ServiceFactory.getInstance().getCallServiceEx();
        
        //设置入参
        StringBuffer initiator = new StringBuffer();
        StringBuffer caller = new StringBuffer();
        StringBuffer callee = new StringBuffer();
        
        //从面板中拿到所有参数
        CallServiceConvert.getParametersFromDialCallFrame(initiator, caller, callee);
        
        //返回呼叫结果，result包含错误码及呼叫相关信息
        UCSDKResponse<String> result = callServiceEx.dialCall(
            initiator.toString(), caller.toString(), callee.toString());
        
        //把返回结果渲染到面板中
        CallServiceConvert.showResultInGetDialCalFrame(result);
        
    }
}
