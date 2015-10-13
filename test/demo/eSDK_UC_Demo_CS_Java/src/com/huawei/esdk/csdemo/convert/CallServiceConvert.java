package com.huawei.esdk.csdemo.convert;

import java.awt.Color;

import com.huawei.esdk.csdemo.common.InterfaceNameConstant;
import com.huawei.esdk.csdemo.view.DemoApp;
import com.huawei.esdk.csdemo.view.tabs.DialCall;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;

public class CallServiceConvert
{
    private static DialCall dialCallTab = (DialCall)DemoApp.tabContent.getTabs()
        .get(InterfaceNameConstant.dialCall);
    
    public static void getParametersFromDialCallFrame(StringBuffer initiator, 
        StringBuffer caller, StringBuffer callee)
    {
        initiator.append(dialCallTab.getInputText1().getText());
        caller.append(dialCallTab.getInputText2().getText());
        callee.append(dialCallTab.getInputText3().getText());
    }
    
    public static void showResultInGetDialCalFrame(UCSDKResponse<String> result)
    {
        int resultCode = result.getResultCode();
        dialCallTab.getOutputText1().setText(String.valueOf(resultCode));
        
        if (0 != resultCode)
        {
            dialCallTab.getStatusPanel().setForeground(Color.red);
            dialCallTab.showOperationStatus(false);
            dialCallTab.getOutputText2().setText("");
            return;
        }
        
        dialCallTab.getStatusPanel().setForeground(Color.blue);
        dialCallTab.showOperationStatus(true);
        
        dialCallTab.getOutputText2().setText(result.getResult());
    }
}
