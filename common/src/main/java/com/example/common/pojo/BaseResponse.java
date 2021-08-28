package com.example.common.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: gaobaozong
 * @Description: 统一返回包装类
 * @Date: Created in 2021/8/28 - 20:35
 * @Version: V1.0
 */
@Data
@Builder
public class BaseResponse<T> implements Serializable {

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String errorMsg;

    /**
     * 返回实体
     */
    private T data;

}
