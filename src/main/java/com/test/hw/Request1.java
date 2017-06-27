package com.test.hw;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Request验证学习(获取客户机信息)
 * Created by huangwei on 2017/6/27.
 */
public class Request1 extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        doGet(request,response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //得到请求的URL地址
        String url = request.getRequestURL().toString();
        //得到请求的资源
        String uri = request.getRequestURI();
        //得到请求的附带参数
        String query = request.getQueryString();
        //得到来访者的IP
        String remoteAddr = request.getRemoteAddr();
        //得到来访者的主机名
        String remoteHost = request.getRemoteHost();
        //得到来访者的网络端口号
        int remotePort = request.getRemotePort();
        //
        String remoteUser = request.getRemoteUser();
        //得到请求URL地址时使用的方法
        String method = request.getMethod();
        //
        String pathInfo = request.getPathInfo();
        //获取WEB服务器的IP地址
        String localAddr = request.getLocalAddr();
        //获取WEB服务器的主机名
        String localName = request.getLocalName();
        response.setCharacterEncoding("UTF-8");
        response.setHeader("content-type","text/html;charset=UTF-8");
        PrintWriter printWriter= response.getWriter();
        printWriter.write("获取的客户端信息如下：");
        printWriter.write("<hr/>");
        printWriter.write("请求地址的URL：" + url);
        printWriter.write("</br>");
        printWriter.write("请求的资源：" + uri);
        printWriter.write("</br>");
        printWriter.write("请求的参数：" + query);
        printWriter.write("</br>");
        printWriter.write("客户端的IP"+ remoteAddr);
        printWriter.write("</br>");
        printWriter.write("客户端的主机名：" + remoteHost);
        printWriter.write("</br>");
    }


}
