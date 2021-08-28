package com.example.engineapi;

import com.example.common.pojo.BaseResponse;

/**
 * @Author: gaobaozong
 * @Description: 服务API
 * @Date: Created in 2021/8/28 - 20:59
 * @Version: V1.0
 */
public interface DomeApi {

    BaseResponse<Void> getConfigName(String name);
}
