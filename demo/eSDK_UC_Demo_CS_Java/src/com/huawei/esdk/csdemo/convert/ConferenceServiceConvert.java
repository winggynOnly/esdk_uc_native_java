package com.huawei.esdk.csdemo.convert;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;

import com.huawei.esdk.csdemo.common.DemoException;
import com.huawei.esdk.csdemo.common.InterfaceNameConstant;
import com.huawei.esdk.csdemo.view.DemoApp;
import com.huawei.esdk.csdemo.view.tabs.CreateConf;
import com.huawei.esdk.csdemo.view.utils.InternationalUtils;
import com.huawei.esdk.uc.professional.local.bean.ConfUser;
import com.huawei.esdk.uc.professional.local.bean.ConferenceInfo;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;

public class ConferenceServiceConvert
{
    
    private static CreateConf createConfTab = (CreateConf)DemoApp.tabContent.getTabs()
        .get(InterfaceNameConstant.createConf);
    
    @SuppressWarnings("rawtypes")
    public static void getParametersFromConferenceInfoFrame(ConferenceInfo conferenceInfo) throws DemoException
    {
            conferenceInfo.setConfType(createConfTab.getInputText1().getText());
            conferenceInfo.setSubject(createConfTab.getInputText2().getText());
            conferenceInfo.setInitiator(createConfTab.getInputText3().getText());
            conferenceInfo.setMediaType(createConfTab.getInputText4().getText());
    
            try
            {
                conferenceInfo.setMaxAttendee(Integer.parseInt(createConfTab.getInputText9().getText()));
            }
            catch(NumberFormatException e)
            {
                String errInfo = InternationalUtils.getValue("maxAttendee") +
                    InternationalUtils.getValue("paramTypeError");
                DemoException demoEx = new DemoException(errInfo);
                throw demoEx;
            }
    
            if("2".equals(createConfTab.getInputText1().getText()) 
                || "4".equals(createConfTab.getInputText1().getText()))
            {
                conferenceInfo.setChairmanPassword(createConfTab.getInputText13().getText());
                conferenceInfo.setMemberPassword(createConfTab.getInputText14().getText());
                
                SimpleDateFormat format =  new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
                Date date = null;
                try
                {
                    date = format.parse(createConfTab.getInputText11().getText());
                    conferenceInfo.setBeginTime(date);
                }
                catch (ParseException e)
                {
                    String errInfo = InternationalUtils.getValue("beginTime") +
                        InternationalUtils.getValue("paramTypeError");
                    DemoException demoEx = new DemoException(errInfo);
                    throw demoEx;
                }
                
                try
                {          
                    date = format.parse(createConfTab.getInputText12().getText());
                    conferenceInfo.setEndTime(date);
                }
                catch (ParseException e)
                {
                    String errInfo = InternationalUtils.getValue("endTime") +
                        InternationalUtils.getValue("paramTypeError");
                    DemoException demoEx = new DemoException(errInfo);
                    throw demoEx;
                }
            }
            
            ConfUser chairman = new ConfUser();
            chairman.setNumber(createConfTab.getInputText5().getText());
            try
            {
                chairman.setTalkMode(Integer.parseInt(createConfTab.getInputText6().getText())); 
            }
            catch(NumberFormatException e)
            {
                String errInfo = InternationalUtils.getValue("talkMode") +
                    InternationalUtils.getValue("paramTypeError");
                DemoException demoEx = new DemoException(errInfo);
                throw demoEx;
            }
            
            try
            {
                chairman.setStatus(Integer.parseInt(createConfTab.getInputText7().getText()));
            }
            catch(NumberFormatException e)
            {
                String errInfo = InternationalUtils.getValue("status") +
                    InternationalUtils.getValue("paramTypeError");
                DemoException demoEx = new DemoException(errInfo);
                throw demoEx;
            }
            try
            {
                chairman.setIsSupportVideo(Integer.parseInt(createConfTab.getInputText8().getText())); 
            }
            catch(NumberFormatException e)
            {
                String errInfo = InternationalUtils.getValue("isSupportVideo") +
                    InternationalUtils.getValue("paramTypeError");
                DemoException demoEx = new DemoException(errInfo);
                throw demoEx;
            }
            try
            {
                chairman.setRole(Integer.parseInt(createConfTab.getInputText10().getText())); 
            }
            catch(NumberFormatException e)
            {
                String errInfo = InternationalUtils.getValue("role") +
                    InternationalUtils.getValue("paramTypeError");
                DemoException demoEx = new DemoException(errInfo);
                throw demoEx;
            }
            conferenceInfo.setChairman(chairman);
            
            List<ConfUser> confUsers = new ArrayList<ConfUser>(); 
            
            Vector data = createConfTab.getTableMode1().getDataVector();
            
            for (int i = 0; i < data.size(); i++)
            {
                
                Vector item = (Vector)data.get(i);
                ConfUser confUser = new ConfUser();
                
                for (int j = 0; j < item.size(); j++)
                {
                    if (0 == j)
                    {
                        confUser.setNumber((String)(null == item.get(0) ? "" : item.get(0)));
                    }
                    else if (1 == j)
                    {
                        confUser.setName((String)(null == item.get(1) ? "" : item.get(1)));
                    }
                    else if (2 == j)
                    {
                        confUser.setAccount((String)(null == item.get(2) ? "" : item.get(2)));
                    }
                    else if (3 == j)
                    {
                        try
                        {
                            confUser.setTalkMode(Integer.parseInt((String)item.get(3)));
                        }
                        catch(NumberFormatException e)
                        {
                            String errInfo =InternationalUtils.getValue("confUserList") +"-->"
                                + InternationalUtils.getValue("confUser.talkMode") +
                                InternationalUtils.getValue("paramTypeError");
                            DemoException demoEx = new DemoException(errInfo);
                            throw demoEx;
                        }
                    }
                    else if (4 == j)
                    {
                        try
                        {
                            confUser.setStatus(Integer.parseInt((String)item.get(4)));
                        }
                        catch(NumberFormatException e)
                        {
                            String errInfo =InternationalUtils.getValue("confUserList") +"-->"
                                + InternationalUtils.getValue("confUser.status") +
                                InternationalUtils.getValue("paramTypeError");
                            DemoException demoEx = new DemoException(errInfo);
                            throw demoEx;
                        }
                    }
                    else if (5 == j)
                    {
                        try
                        {
                            confUser.setIsSupportVideo(Integer.parseInt((String)item.get(5)));
                        }
                        catch(NumberFormatException e)
                        {
                            String errInfo =InternationalUtils.getValue("confUserList") +"-->"
                                + InternationalUtils.getValue("confUser.isSupportVideo") +
                                InternationalUtils.getValue("paramTypeError");
                            DemoException demoEx = new DemoException(errInfo);
                            throw demoEx;
                        }
                    }
                    else if (6 == j)
                    {
                        try
                        {
                            confUser.setRole(Integer.parseInt((String)item.get(6)));
                        }
                        catch(NumberFormatException e)
                        {
                            String errInfo =InternationalUtils.getValue("confUserList") +"-->"
                                + InternationalUtils.getValue("confUser.role") +
                                InternationalUtils.getValue("paramTypeError");
                            DemoException demoEx = new DemoException(errInfo);
                            throw demoEx;
                        }
                    }
                    else if (7 == j)
                    {
                        confUser.setEmail((String)(null == item.get(7) ? "" : item.get(7)));
                    }
                    
                }
                confUsers.add(confUser);
            }
            conferenceInfo.setConfUser(confUsers); 
            
            conferenceInfo.setBgMusicId(0); 
            conferenceInfo.setIsRecord(0);
        
    }
    
    public static void showConvertErrInfo(String errInfo)
    {
        createConfTab.getOutputText1().setText("");
        createConfTab.getOutputText2().setText("");
        createConfTab.showOperationStatus(null);
        JOptionPane.showMessageDialog(null, errInfo, "ERROR", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showResultInFrame(UCSDKResponse<String> result)
    {
        int resultCode = result.getResultCode();
        createConfTab.getOutputText1().setText(String.valueOf(result.getResultCode()));
        
        if(0 != resultCode)
        {
            createConfTab.getStatusPanel().setForeground(Color.red);
            createConfTab.showOperationStatus(false);
            createConfTab.getOutputText2().setText("");
            return;
        }
        
        createConfTab.getStatusPanel().setForeground(Color.blue);
        createConfTab.showOperationStatus(true);
        
        createConfTab.getOutputText2().setText(result.getResult());
   
    }
    
    public static void loginFailInGetDeviceListFrame(int loginErrorCode)
    {
        createConfTab.getOutputText1().setText(String.valueOf(loginErrorCode));
        createConfTab.getOutputText2().setText("");
        createConfTab.getStatusPanel().setForeground(Color.red);
        createConfTab.showOperationStatus(false);
    }
}
