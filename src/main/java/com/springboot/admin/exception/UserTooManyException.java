package com.springboot.admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author onlyWjt
 * @date 2022年09月04日 11:26
 * @desc
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户数量太多")//这种方式其实底层就是springboot封装之后发送了一个error请求，sendError
public class UserTooManyException extends RuntimeException{
    public UserTooManyException() {
    }
    public UserTooManyException(String message){
        super(message);
    }
}
