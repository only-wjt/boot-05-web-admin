package com.springboot.admin.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.MissingFormatArgumentException;
import java.util.logging.Logger;

/**
 * @author onlyWjt
 * @date 2022年09月04日 11:18
 * @desc  处理异常的类
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({ArithmeticException.class,NullPointerException.class, MissingFormatArgumentException.class})
    public String handlerAithException(Exception e){
        log.error("异常是{}",e);
        return "login";
    }
}
