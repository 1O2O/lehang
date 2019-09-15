package com.example.demo.exception;

import com.example.demo.commom.ErrorCodeAndMsg;


/**
 * 统一的异常处理类
 *
 */
public class BaseException extends RuntimeException {

    private final ErrorCodeAndMsg response;

    public BaseException(ErrorCodeAndMsg response) {
        this.response = response;
    }
    public ErrorCodeAndMsg getResponse() {
        return response;
    }

}
