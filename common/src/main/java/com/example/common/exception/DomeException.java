package com.example.common.exception;

import lombok.Data;

/**
 * @Author: gaobaozong
 * @Description: TODO 描述类的作用
 * @Date: Created in 2021/8/28 - 20:32
 * @Version: V1.0
 */
@Data
public class DomeException extends RuntimeException{
    /**
     * 错误编码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String msg;

    public DomeException(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

}
