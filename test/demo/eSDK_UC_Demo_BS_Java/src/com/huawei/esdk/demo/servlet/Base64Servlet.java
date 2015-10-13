package com.huawei.esdk.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 对消息进行Base64编码
 * 
 * @author  xxxxxxxx
 * @see  [无]
 * @since  [eSDK UC V100R003C00]
 */
@WebServlet("/Base64Servlet")
public class Base64Servlet extends HttpServlet {
    
    /**
     * 序列号
     */
	private static final long serialVersionUID = 1L;
       

    public Base64Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	 // 获取需要调用的方法名
        String methodName = request.getParameter("method");
        String resp = "";
        
        if ("encodeBase64".equals(methodName))
        {
            // 对消息编码
            resp = encode(request.getParameter("message"));
        }
        // 输出流
        PrintWriter pw = response.getWriter();
        pw.print(resp);
        pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	    doGet(request, response);
	}
	
	/**
     * 对字符串进行Base64编码
     */
	public static String encode(String request)
	    {
	    
	        // 获取页面参数
            String message = request;
        
	        byte[] btData = message.getBytes();
	        int iLen = 0;
	        boolean l_bFlag;
	        int l_iGroup;
	        char[] l_szData;
	        byte[] l_btTmp;

	        int ii;
	        int jj;
	        int kk;

	        String l_stEncoding = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

	        if (btData == null)
	        {
	            return null;
	        }

	        if ((iLen <= 0) || (iLen > btData.length))
	        {
	            iLen = btData.length;
	        }

	        l_bFlag = ((iLen % 3) == 0);

	        l_iGroup = iLen / 3;

	        ii = l_iGroup;

	        if (!l_bFlag)
	        {
	            ii++;
	        }

	        l_szData = new char[4 * ii];
	        l_btTmp = new byte[3];

	        for (ii = 0, jj = 0, kk = 0; ii < l_iGroup; ii++)
	        {
	            l_btTmp[0] = btData[kk++];
	            l_btTmp[1] = btData[kk++];
	            l_btTmp[2] = btData[kk++];

	            l_szData[jj++] = l_stEncoding.charAt((l_btTmp[0] >> 2) & 0x3F);
	            l_szData[jj++] = l_stEncoding.charAt(((l_btTmp[0] & 0x03) << 4)
	                    | ((l_btTmp[1] >> 4) & 0x0F));
	            l_szData[jj++] = l_stEncoding.charAt(((l_btTmp[1] & 0x0F) << 2)
	                    | ((l_btTmp[2] >> 6) & 0x03));
	            l_szData[jj++] = l_stEncoding.charAt(l_btTmp[2] & 0x3F);
	        }

	        if (!l_bFlag)
	        {
	            l_btTmp[0] = btData[kk++];

	            l_szData[jj++] = l_stEncoding.charAt((l_btTmp[0] >> 2) & 0x3F);
	            l_szData[jj + 1] = '=';
	            l_szData[jj + 2] = '=';

	            if ((iLen % 3) == 1)
	            {
	                l_szData[jj] = l_stEncoding.charAt((l_btTmp[0] & 0x03) << 4);
	            }
	            else
	            // if ((iLen % 3) == 2)
	            {
	                l_btTmp[1] = btData[kk];

	                l_szData[jj++] = l_stEncoding.charAt(((l_btTmp[0] & 0x03) << 4)
	                        | ((l_btTmp[1] >> 4) & 0x0F));
	                l_szData[jj] = l_stEncoding.charAt((l_btTmp[1] & 0x0F) << 2);
	            }
	        }

	        return new String(l_szData);
	    }
}
