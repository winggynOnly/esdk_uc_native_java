package com.huawei.esdk.csdemo.convert;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import com.huawei.esdk.csdemo.common.DemoException;
import com.huawei.esdk.csdemo.common.InterfaceNameConstant;
import com.huawei.esdk.csdemo.view.DemoApp;
import com.huawei.esdk.csdemo.view.tabs.AppSendMsgToUC;
import com.huawei.esdk.csdemo.view.utils.InternationalUtils;

public class IMServiceConvert
{
    
    private static AppSendMsgToUC appSendMsgToUCTab = (AppSendMsgToUC)DemoApp.tabContent.getTabs()
        .get(InterfaceNameConstant.appSendMsgToUC);
    
    public static void getParametersFromAppSendMsgToUCFrame(StringBuffer sendNumber,StringBuffer ucAccount,StringBuffer message,Date dateTime) throws DemoException
    {
        sendNumber.append(appSendMsgToUCTab.getInputText1().getText());
        ucAccount.append(appSendMsgToUCTab.getInputText2().getText());
        message.append(appSendMsgToUCTab.getInputText3().getText());
        SimpleDateFormat format =  new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date date = null;
        try
        {
            date = format.parse(appSendMsgToUCTab.getInputText4().getText());
            dateTime.setTime(date.getTime());
        }
        catch (ParseException e)
        {
            String errInfo = InternationalUtils.getValue("beginTime") +
                    InternationalUtils.getValue("paramTypeError");
                DemoException demoEx = new DemoException(errInfo);
                throw demoEx;
        }
    }

    public static void showResultInAppSendMsgToUcFrame(Integer result)
    {
        appSendMsgToUCTab.getOutputText1().setText(String.valueOf(result));
        
        if(0 != result)
        {
            appSendMsgToUCTab.getStatusPanel().setForeground(Color.red);
            appSendMsgToUCTab.showOperationStatus(false);
            return;
        }
        
        appSendMsgToUCTab.getStatusPanel().setForeground(Color.blue);
        appSendMsgToUCTab.showOperationStatus(true);
    }

	public static void showConvertErrInfo(String errInfo) 
	{
		appSendMsgToUCTab.getOutputText1().setText("");
		appSendMsgToUCTab.showOperationStatus(null);
        JOptionPane.showMessageDialog(null, errInfo, "ERROR", JOptionPane.INFORMATION_MESSAGE);
	}
    
}
