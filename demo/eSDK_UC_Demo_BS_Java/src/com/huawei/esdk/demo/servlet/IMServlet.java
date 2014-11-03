package com.huawei.esdk.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.huawei.esdk.demo.factory.ServiceFactory;

/**
 * 向UC用户发送消息
 * 
 * @author  xxxxxxxx
 * @see  [无]
 * @since  [eSDK UC V100R003C00]
 */
public class IMServlet extends HttpServlet
{
    /**
     * 序列号
     */
    private static final long serialVersionUID = -1586272300179601609L;
    
    /**
     * log日志对象
     */
    private static final Logger LOGGER = Logger.getLogger(IMServlet.class);
    
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
        
        if ("appSendMsgToUC".equals(methodName))
        {
            // 向UC用户发送消息
            resp = appSendMsgToUC(request);
        }
        
        // 输出流
        PrintWriter pw = response.getWriter();
        pw.print(resp);
        pw.close();
    }
    
    /** 
     * 向UC用户发送消息
     * 
     * @param request HttpServletRequest对象
     * @return json格式的字符串
     * @see [无]
     * @since  [eSDK UC V100R003C00]
     */
    public String appSendMsgToUC(HttpServletRequest request)
    {
        // 定义返回结果
        String response = null;
        
        
        LOGGER.info("Begin to appSendMsgToUC");
        
        // 获取页面参数
        String sendNumber = request.getParameter("sendNumber");
        String ucAccount = request.getParameter("ucAccount");
        String message = request.getParameter("message");
        
        
        // 调用向UC用户发送消息接口
        Integer resultCode =
            ServiceFactory.getImServiceEx().appSendMsgToUC(sendNumber, ucAccount, message, new Date());
        
        // 根据接口返回数据生成JSON字符串，以便于页面展示
        response = gson.toJson(resultCode);
        LOGGER.info("Finish to appSendMsgToUC, response is : " + response);
        
        return response;
    }
}
