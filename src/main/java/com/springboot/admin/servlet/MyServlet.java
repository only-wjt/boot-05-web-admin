package com.springboot.admin.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author onlyWjt
 * @date 2022年09月04日 16:59
 * @desc
 */
@WebServlet(urlPatterns = "/my")//貌似没有经过spring的拦截器;直接调用的是tomcat的方式调用，因为会存在地址精确优先原则
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("test");
        super.doGet(req, resp);
    }
}
