package controller;

import service.AtmService;
import spring.MySpring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginController extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String aname = request.getParameter("aname");
        String apassword = request.getParameter("apassword");
        System.out.println("接收到浏览器的aname："+aname+"  apassword:"+apassword);


        AtmService Service = MySpring.getBean("service.AtmService");
        String result = Service.login(aname,apassword);
        System.out.println("Service判定的结果为："+result);

        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.write("<html>");
        out.write(" <head>");
        out.write("     <meta charset=\"UTF-8\">");//浏览器按照此字符集解析
        out.write(" </head>");
        out.write(" <body>");
        out.write("     ===============================<br>");
        out.write("     ======= 欢迎"+aname+"进入银行系统 =======<br>");
        out.write("     ===============================<br>");
        out.write("     请输入操作项<br>");
        out.write("     <a href=\"inquiry?aname="+aname+"\">查询</a><br>");
        out.write("     <a href=\"depositPage?aname="+aname+"\">存款</a><br>");
        out.write("     <a href=\"\">取款</a><br>");
        out.write("     <a href=\"\">转账</a><br>");
        out.write(" </body>");
        out.write("</html>");
        out.flush();
    }
}