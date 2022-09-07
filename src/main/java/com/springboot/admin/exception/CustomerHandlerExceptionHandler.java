package com.springboot.admin.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author onlyWjt
 * @date 2022年09月04日 11:40
 * @desc  自定义的异常解析器
 */
@Order(value = Ordered.HIGHEST_PRECEDENCE)//优先级，数据越小优先级越高
@Component
public class CustomerHandlerExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        try {
            response.sendError(511, "想错就错");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ModelAndView();
    }
}
