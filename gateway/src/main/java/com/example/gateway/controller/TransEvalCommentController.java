package com.example.gateway.controller;

import com.example.common.pojo.BaseResponse;
import com.example.engineapi.TransEvalCommentApi;
import com.example.engineapi.request.TransEvalCommentRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @Author: gaobaozong
 * @Description: TODO 描述类的作用
 * @Date: Created in 2021/9/5 - 16:41
 * @Version: V1.0
 */
@RestController
@RequestMapping("/api/trans")
@Api(value = "交易接口", tags = { "交易接口" })
public class TransEvalCommentController {

    @Reference
    TransEvalCommentApi transEvalCommentApi;

    @PostMapping("/eval")
    @ApiOperation("创建交易单")
    public BaseResponse<Void> add(TransEvalCommentRequest request){
       return  transEvalCommentApi.addTransEvalComment(request);
    }


}
