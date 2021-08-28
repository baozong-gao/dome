package com.example.engine.service;

import com.example.common.pojo.BaseResponse;
import com.example.common.util.ResultGeneratorUtil;
import com.example.engineapi.DomeApi;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: gaobaozong
 * @Description: 服务提供者类
 * @Date: Created in 2021/8/28 - 20:30
 * @Version: V1.0
 */
@Service
public class DomeService implements DomeApi {

    /**
     *  返回配置中心值
     * @return
     */
    @Override
    public BaseResponse<Void>  getConfigName(String name){
        return ResultGeneratorUtil.succeed();
    }
}
