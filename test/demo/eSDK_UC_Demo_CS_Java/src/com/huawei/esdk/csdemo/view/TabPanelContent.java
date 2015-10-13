package com.huawei.esdk.csdemo.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JPanel;
import com.huawei.esdk.csdemo.common.InterfaceNameConstant;
import com.huawei.esdk.csdemo.view.tabs.DialCall;
import com.huawei.esdk.csdemo.view.tabs.CreateConf;
import com.huawei.esdk.csdemo.view.tabs.MyTabPane;
import com.huawei.esdk.csdemo.view.tabs.AppSendMsgToUC;

public class TabPanelContent extends JPanel
{
    
    /**
     * 序列号
     */
    private static final long serialVersionUID = -8045395902158394465L;
    
    //存放所有接口对应的界面
    private Map<String, MyTabPane> tabs = new HashMap<String, MyTabPane>();
    
    public void init()
    {
        DialCall dialCallTab = new DialCall();
        dialCallTab.initComponents();
        dialCallTab.setVisible(false);
        this.add(dialCallTab);
        tabs.put(InterfaceNameConstant.dialCall, dialCallTab);
        
        CreateConf createConfTab = new CreateConf();
        createConfTab.initComponents();
        createConfTab.setVisible(false);
        this.add(createConfTab);
        tabs.put(InterfaceNameConstant.createConf, createConfTab);
        
        AppSendMsgToUC appSendMsgToUCTab = new AppSendMsgToUC();
        appSendMsgToUCTab.initComponents();
        appSendMsgToUCTab.setVisible(false);
        this.add(appSendMsgToUCTab);
        tabs.put(InterfaceNameConstant.appSendMsgToUC, appSendMsgToUCTab);
    }
    
    public void showTabByName(String name)
    {
        
        if (!tabs.containsKey(name))
        {
            return;
        }
        
        for (Entry<String, MyTabPane> entry : tabs.entrySet())
        {
            if (entry.getKey().equals(name))
            {
                if (!entry.getValue().isVisible())
                {
                    entry.getValue().setVisible(true);
                }
            }
            else
            {
                if (entry.getValue().isVisible())
                {
                    entry.getValue().setVisible(false);
                }
            }
        }
    }
    
    public Map<String, MyTabPane> getTabs()
    {
        return tabs;
    }
    
    public void setTabs(Map<String, MyTabPane> tabs)
    {
        this.tabs = tabs;
    }
    
}
