package com.springboot.admin.interceptor;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author onlyWjt
 * @date 2022年05月29日 16:05
 * @desc
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * @author onlyWjt
     * @date 2022/5/29 16:08
     * @param request
     * @param response
     * @param handler 
     * @return boolean  目标方法执行之前
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("拦截的请求路径是{}",request.getRequestURI());
        //登录检查逻辑
        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser != null){
            return true;
        }
        //拦截住，跳转到登录页面
        request.setAttribute("msg", "请先登录");
        request.getRequestDispatcher("/").forward(request, response);

        return false;
    }
    /**
     * @author onlyWjt
     * @date 2022/5/29 16:08
     * @param request
     * @param response
     * @param handler
     * @param modelAndView  目标方法执行之后
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
    /**
     * 页面渲染以后
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
