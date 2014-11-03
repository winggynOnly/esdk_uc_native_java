package com.huawei.esdk.csdemo.action.impl;

import com.huawei.esdk.csdemo.action.DemoAction;
import com.huawei.esdk.csdemo.common.DemoException;
import com.huawei.esdk.csdemo.common.ServiceFactory;
import com.huawei.esdk.csdemo.convert.ConferenceServiceConvert;
import com.huawei.esdk.uc.professional.local.bean.ConferenceInfo;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;
import com.huawei.esdk.uc.professional.local.conference.ConferenceServiceEx;

public class CreateConfBtnActionImpl implements DemoAction
{
    @Override
    public void executeNativeMethod()
    {
        //初始化会议接口服务，该服务中包含会议管理的相关接口
        ConferenceServiceEx conferenceServiceEx = ServiceFactory.getInstance().getConferenceServiceEx();
        
        //设置入参
        ConferenceInfo conferenceInfo = new ConferenceInfo();
        
        //从面板中拿到所有参数
        try
        {
            ConferenceServiceConvert.getParametersFromConferenceInfoFrame(conferenceInfo);
        }
        catch (DemoException e)
        {
            //界面上输入参数类型错误时，显示错误信息
            ConferenceServiceConvert.showConvertErrInfo(e.getErrInfo());
            return;
        }
        
        //返回创建会议结果，result包含错误码及创建会议信息
        UCSDKResponse<String> result = conferenceServiceEx.createConf(conferenceInfo);
        
        //把返回结果渲染到面板中
        ConferenceServiceConvert.showResultInFrame(result);
        
    }
}
