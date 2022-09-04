package com.springboot.admin.config;

import com.springboot.admin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author onlyWjt
 * @date 2022年05月29日 16:10
 * @desc
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")//所有请求都会被拦截，包括静态资源
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/js/**","/images/**");//
    }
}
