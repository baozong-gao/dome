package com.example.common.util;

import com.example.common.enums.WebStatusCode;
import com.example.common.pojo.BaseResponse;

/**
 * @Author: gaobaozong
 * @Description: 返回生成器
 * @Date: Created in 2021/8/28 - 20:40
 * @Version: V1.0
 */
public class ResultGeneratorUtil {

    public static BaseResponse succeed() {
        return BaseResponse.builder()
                .code(WebStatusCode.SUCCEED.getCode())
                .data(null)
                .build();
    }

    public static BaseResponse succeed(String data) {
        return BaseResponse.builder()
                .code(WebStatusCode.SUCCEED.getCode())
                .data(data)
                .build();
    }




}
