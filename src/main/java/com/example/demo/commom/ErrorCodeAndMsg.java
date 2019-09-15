package com.example.demo.commom;

public enum ErrorCodeAndMsg {

    RESPONSE_OK("200","请求成功"),

    RESPONSE_FAIL("201","请求失败"),

    PARAM_EXCEPTION("300","异常参数"),;
    private String code;
    private String msg;

    ErrorCodeAndMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
