package com.example.pojo;

/**
 * 后端统一返回结果
 */

public class Result {
    private Integer code; //编码：1成功，0为失败
    private String msg; //错误信息
    private Object data; //数据


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public static Result success() {
        Result result = new Result();
        result.code = 0;
        result.msg = "success";
        return result;
    }

    public static Result success(Object object) {
        Result result = new Result();
        result.data = object;
        result.code = 0;
        result.msg = "success";
        return result;
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.msg = msg;
        result.code = 1;
        return result;
    }
    public static Result error(){
        Result result = new Result();
        result.msg = "error";
        result.code = 1;
        return result;
    }



}
