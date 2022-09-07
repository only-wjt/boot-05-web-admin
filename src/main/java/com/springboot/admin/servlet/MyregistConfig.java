package com.springboot.admin.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cglib.core.MethodWrapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author onlyWjt
 * @date 2022年09月04日 17:10
 * @desc
 */
//(proxyBeanMethods = false) 如果使用这个，每次都会新new一个对象，则会造成很多问题；保证以来的组件是单实例的
@Configuration(proxyBeanMethods = true)
public class MyregistConfig {
    @Bean
    public ServletRegistrationBean myservlet(){
        MyServlet myServlet = new MyServlet();
        return new ServletRegistrationBean(myServlet,"/my");
    }
    @Bean
    public FilterRegistrationBean myFilter(){
        MyFilter myFilter = new MyFilter();
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(myFilter, myservlet());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/my","./my02"));
        return filterRegistrationBean;
    }
    @Bean
    public ServletListenerRegistrationBean myLister(){
        MyservlertContextLister myservlertContextLister = new MyservlertContextLister();
        return new ServletListenerRegistrationBean(myservlertContextLister);
    }
}
