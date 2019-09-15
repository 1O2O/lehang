package com.example.demo.handler;

import com.example.demo.commom.ErrorCodeAndMsg;
import com.example.demo.commom.Response;
import com.example.demo.exception.BaseException;
import com.example.demo.exception.ParamException;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class ExceptionHandler {
    Logger logger = LogManager.getLogger("myLogger");
    @org.springframework.web.bind.annotation.ExceptionHandler(ParamException.class)
    @ResponseBody
    public Response handleParamException(HttpServletRequest request, ParamException ex) {
         Response response;

        logger.error("ParamException code:{},msg:{}",ex.getResponse().getCode(),ex.getResponse().getMsg());

        response = new Response(ex.getResponse().getCode(),ex.getResponse().getMsg(),null);

        return response;
    }
    @org.springframework.web.bind.annotation.ExceptionHandler(BaseException.class)
    @ResponseBody
    public Response handleException(HttpServletRequest request, Exception ex) {
        Response response;
        logger.error("exception error:{}",ex);
        response = new Response(ErrorCodeAndMsg.RESPONSE_FAIL.getCode(),
                ErrorCodeAndMsg.RESPONSE_FAIL.getMsg());
        return response;
    }

}
