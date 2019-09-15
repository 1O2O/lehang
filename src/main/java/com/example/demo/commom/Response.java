package com.example.demo.commom;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class Response<T> implements Serializable {

    private T data;
    //返回码
    private String code;
    //返回描述
    private String msg;

    public Response(){
        this.code = ErrorCodeAndMsg.RESPONSE_OK.getCode();
        this.msg = ErrorCodeAndMsg.RESPONSE_OK.getMsg();
    }

    public Response(String code,String msg){
        this();
        this.code = code;
        this.msg = msg;
    }
    public Response(String code,String msg,T data){
        this();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Response(T data){
        this();
        this.data = data;
    }

}
