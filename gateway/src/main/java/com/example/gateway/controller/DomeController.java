package com.example.gateway.controller;

import com.example.common.pojo.BaseResponse;
import com.example.engineapi.DomeApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gaobaozong
 * @Description: Dome web服务
 * @Date: Created in 2021/8/28 - 21:34
 * @Version: V1.0
 */
@RestController
@RequestMapping("/api/config")
public class DomeController {

    @Reference
    private DomeApi domeApi;

    @GetMapping("/userInfo")
    public BaseResponse<Void> userInfo(){
        return domeApi.getConfigName("user");
    }

}
