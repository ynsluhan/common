package com.yniii.utils;

import lombok.Data;

import java.util.HashMap;

/**
 * @author yNsLuHan
 */
@Data
public class R {

    private Integer code;

    private String message;

    private Object data;

    private R() {
    }

    public static R ok() {
        R r = new R();
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("success");
        return r;
    }

    public static R error() {
        R r = new R();
        r.setCode(ResultCode.ERROR);
        r.setMessage("error");
        return r;
    }

    public R message(String message) {
        this.setMessage(message);
        return this;
    }

    public R code(Integer code) {
        this.setCode(code);
        return this;
    }

    public R data(HashMap<String, Object> a) {
        this.setData(a);
        return this;
    }

    public R data(Object a) {
        this.setData(a);
        return this;
    }
}
