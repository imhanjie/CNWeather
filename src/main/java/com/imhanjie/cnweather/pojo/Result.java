package com.imhanjie.cnweather.pojo;

/**
 * Description
 *
 * @author hanjie
 * @date 2018/6/4
 */

public class Result {

    public static final String CODE_SUCCESS = "1";
    public static final String CODE_FAILED = "0";
    public static final String CODE_ERROR = "-1";

    private String code;
    private String message;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Result getSuccess() {
        return getSuccess(null);
    }

    public static Result getSuccess(Object obj) {
        Result result = new Result();
        result.code = CODE_SUCCESS;
        result.message = "success";
        result.data = obj;
        return result;
    }

    public static Result getFail(String msg) {
        Result result = new Result();
        result.code = CODE_FAILED;
        result.message = msg;
        return result;
    }

}
