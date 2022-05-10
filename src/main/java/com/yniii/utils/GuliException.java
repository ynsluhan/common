package com.yniii.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yNsLuHan
 */
//生成无参数构造
@Data
//生成有参数构造方法
@AllArgsConstructor
//生成无参数构造
@NoArgsConstructor
public class GuliException extends RuntimeException {
    //状态码
    private Integer code;
    //异常信息
    private String msg;

    @Override
    public String toString() {
        return "GuliException{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
