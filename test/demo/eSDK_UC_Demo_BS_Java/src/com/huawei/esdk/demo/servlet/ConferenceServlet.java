package com.huawei.esdk.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.common.util.StringUtils;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.huawei.esdk.demo.factory.ServiceFactory;
import com.huawei.esdk.demo.utils.DateUtils;
import com.huawei.esdk.uc.professional.local.bean.ConfUser;
import com.huawei.esdk.uc.professional.local.bean.ConferenceInfo;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;

/**
 * 会议模块处理类
 * 创建会议
 * 
 * @author  xxxxxxxx
 * @see  [无]
 * @since  [eSDK UC V100R003C00]
 */
public class ConferenceServlet extends HttpServlet
{
    /**
     * 序列号
     */
    private static final long serialVersionUID = -1586272300179601609L;
    
    /**
     * log日志对象
     */
    private static final Logger LOGGER = Logger.getLogger(ConferenceServlet.class);
    
    
    /**
     * gson，用于转换String和json之间的转换
     */
    private Gson gson = new Gson();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        doGet(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        // 获取需要调用的方法名
        String methodName = request.getParameter("method");
        String resp = "";
        
        if ("createConf".equals(methodName))
        {
            // 创建会议
            resp = createConf(request);
        }
        
        // 输出流
        PrintWriter pw = response.getWriter();
        pw.print(resp);
        pw.close();
    }
    
    /** 
     * 获创建会议
     * 
     * @param request HttpServletRequest对象
     * @return json格式的字符串
     * @see [无]
     * @since  [eSDK UC V100R003C00]
     */
    public String createConf(HttpServletRequest request)
    {
        // 定义返回结果
        String response = null;
        
        LOGGER.info("Begin to createConf");
        
        // 获取页面参数,拼装会议对象
        ConferenceInfo confInfo = new ConferenceInfo();
        String confType = request.getParameter("confType");
        confInfo.setConfType(confType); 
        confInfo.setSubject(request.getParameter("subject")); 
        confInfo.setInitiator(request.getParameter("initiator")); 
        
        String beginTimeStr = request.getParameter("beginTime");
        if (!StringUtils.isEmpty(beginTimeStr) && !"1".equals(confType) && !"3".equals(confType))
        {
            Date beginTime = DateUtils.stringToDate(beginTimeStr, "yyyy/MM/dd HH:mm");
            if (null != beginTime)
            {
                confInfo.setBeginTime(beginTime);
            }
        }
        String endTimeStr = request.getParameter("endTime");
        if (!StringUtils.isEmpty(endTimeStr) && !"1".equals(confType) && !"3".equals(confType))
        {
            Date endTime = DateUtils.stringToDate(endTimeStr, "yyyy/MM/dd HH:mm");
            if (null != endTime)
            {
                confInfo.setEndTime(endTime);
            }
        }
         
        //填写会议主席信息 
        ConfUser chairman = new ConfUser(); 
        chairman.setNumber(request.getParameter("chairmanNumber")); 
        chairman.setName(request.getParameter("chairmanName")); 
        chairman.setAccount(request.getParameter("chairmanAccount")); 
        chairman.setTalkMode(Integer.parseInt(request.getParameter("chairmanTalkMode"))); 
        chairman.setStatus(Integer.parseInt(request.getParameter("chairmanStatus"))); 
        chairman.setIsSupportVideo(Integer.parseInt(request.getParameter("chairmanSupportVideo"))); 
        chairman.setRole(Integer.parseInt(request.getParameter("chairmanRole"))); 
        String chairmanEmail = request.getParameter("chairmanEmail");
        if (!StringUtils.isEmpty(chairmanEmail))
        {
            chairman.setEmail(chairmanEmail); 
        }
        confInfo.setChairman(chairman); 
        
        // 会议成员列表
        String[] confUserNumbers = !StringUtils.isEmpty(request.getParameter("confUserNumber")) ? request.getParameter("confUserNumber").split(",") : null;
        String[] confUserNames = !StringUtils.isEmpty(request.getParameter("confUserName")) ? request.getParameter("confUserName").split(",") : null;
        String[] confUserAccounts = !StringUtils.isEmpty(request.getParameter("confUserAccount")) ? request.getParameter("confUserAccount").split(",") : null;
        String[] confUserTalkModes = !StringUtils.isEmpty(request.getParameter("confUserTalkMode")) ? request.getParameter("confUserTalkMode").split(",") : null;
        String[] confUserStatus = !StringUtils.isEmpty(request.getParameter("confUserStatus")) ? request.getParameter("confUserStatus").split(",") : null;
        String[] confUserSupportVideos = !StringUtils.isEmpty(request.getParameter("confUserSupportVideo")) ? request.getParameter("confUserSupportVideo").split(",") : null;
        String[] confUserRoles = !StringUtils.isEmpty(request.getParameter("confUserRole")) ? request.getParameter("confUserRole").split(",") : null;
        String[] confUserEmails = !StringUtils.isEmpty(request.getParameter("confUserEmail")) ? request.getParameter("confUserEmail").split(",") : null;
        
        List<ConfUser> confUsers = new ArrayList<ConfUser>(); 
        if (null != confUserNumbers && 0 < confUserNumbers.length)
        {
            for (int i = 0; i< confUserNumbers.length; i++)
            {
                ConfUser confUser = new ConfUser();
                confUser.setNumber(confUserNumbers[i]); 
                
                if (null != confUserNames && confUserNames.length > i)
                {
                    String confUserName = confUserNames[i];
                    if (!StringUtils.isEmpty(confUserName))
                    {
                        confUser.setName(confUserName); 
                    }
                }
                
                if (null != confUserAccounts && confUserAccounts.length > i)
                {
                    String confUserAccount = confUserAccounts[i];
                    if (!StringUtils.isEmpty(confUserAccount))
                    {
                        confUser.setAccount(confUserAccount); 
                    }
                }
                
                confUser.setTalkMode(Integer.parseInt(confUserTalkModes[i])); 
                confUser.setStatus(Integer.parseInt(confUserStatus[i])); 
                confUser.setIsSupportVideo(Integer.parseInt(confUserSupportVideos[i])); 
                confUser.setRole(Integer.parseInt(confUserRoles[i]));
                
                if (null != confUserEmails && confUserEmails.length > i)
                {
                    String confUserEmail = confUserEmails[i];
                    if (!StringUtils.isEmpty(confUserEmail))
                    {
                        confUser.setEmail(confUserEmail);
                    }
                }
                
                confUsers.add(confUser);
            }
        }
        confInfo.setConfUser(confUsers); 
         

        // 目前仅支持100和111
        confInfo.setMediaType(request.getParameter("mediaType"));
        
        // 会议主席密码
        String chairmanPassword = request.getParameter("chairmanPassword");
        if (!StringUtils.isEmpty(chairmanPassword))
        {
            chairman.setEmail(chairmanPassword); 
        }
        
        // 普通成员会议密码
        String memberPassword = request.getParameter("memberPassword");
        if (!StringUtils.isEmpty(memberPassword))
        {
            chairman.setEmail(memberPassword); 
        }
        
        //最大与会者人数为10人 
        confInfo.setMaxAttendee(Integer.parseInt(request.getParameter("maxAttendee")));
        
        // 调用呼叫会议管理中的createConf方法
        UCSDKResponse<String> createConfResponse =
            ServiceFactory.getConferenceServiceEx().createConf(confInfo);
        
        // 根据接口返回数据生成JSON字符串，以便于页面展示
        response = gson.toJson(createConfResponse);
        LOGGER.info("Finish to createConf, response is : " + response);
        
        return response;
    }
}
