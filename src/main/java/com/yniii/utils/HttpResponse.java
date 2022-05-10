package com.yniii.utils;

/**
 * @author yNsluhan
 * @date 2021/6/17 10:26 上午
 */
public class HttpResponse {
    private int code;
    private String content;

    public HttpResponse(int status, String content) {
        this.code = status;
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return new StringBuilder("[ code = ").append(code)
                .append(" , content = ").append(content).append(" ]").toString();
    }
}
