package com.example.common.enums;

/**
 * @Author: gaobaozong
 * @Description: 返回码
 * @Date: Created in 2021/8/28 - 20:42
 * @Version: V1.0
 */
public enum WebStatusCode {
    SUCCEED(200),
    FAIL(9999);

    WebStatusCode(Integer code){
        this.code = code;
    }

    private Integer code;

    public Integer getCode() {
        return code;
    }
}
