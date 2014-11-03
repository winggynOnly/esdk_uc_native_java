package com.huawei.esdk.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.huawei.esdk.demo.factory.ServiceFactory;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;

/**
 * CTD模块处理类
 * 发起CTD呼叫
 * 
 * @author  xxxxxxxx
 * @see  [无]
 * @since  [eSDK UC V100R003C00]
 */
public class CallServlet extends HttpServlet
{
    /**
     * 序列号
     */
    private static final long serialVersionUID = 6749720431926648350L;
    
    /**
     * log日志对象
     */
    private static final Logger LOGGER = Logger.getLogger(CallServlet.class);
    
    
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
        
        if ("dialCall".equals(methodName))
        {
            // 发起CTD呼叫
            resp = dialCall(request);
        }
        
        // 输出流
        PrintWriter pw = response.getWriter();
        pw.print(resp);
        pw.close();
    }
    
    /** 
    * 发起CTD呼叫
    * 
    * @param request HttpServletRequest对象
    * @return json格式的字符串
    * @see [无]
    * @since  [eSDK UC V100R003C00]
    */
    public String dialCall(HttpServletRequest request)
    {
        // 定义返回结果
        String response = null;
        
        
        LOGGER.info("Begin to dialCall");
        
        // 获取输入参数
        String initiator = request.getParameter("initiator");
        String caller = request.getParameter("caller");
        String callee = request.getParameter("callee");
        
        UCSDKResponse<String> ucsdkResponse =
            ServiceFactory.getCallServiceEx().dialCall(initiator, caller, callee);
        
        // 根据接口返回数据生成JSON字符串，以便于页面展示
        response = gson.toJson(ucsdkResponse);
        LOGGER.info("Finish to dialCall, response is : " + response);
        
        return response;
    }
    
}
