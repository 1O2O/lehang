package com.example.demo.exception;

import com.example.demo.commom.ErrorCodeAndMsg;

public class ParamException extends BaseException {


    public ParamException(ErrorCodeAndMsg response) {
        super(response);
    }
}
