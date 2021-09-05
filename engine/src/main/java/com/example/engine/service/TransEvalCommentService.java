package com.example.engine.service;

import com.example.common.pojo.BaseResponse;
import com.example.common.util.ResultGeneratorUtil;
import com.example.engine.dao.TransEvalCommentEntity;
import com.example.engine.repository.impl.TransEvalCommentServiceImpl;
import com.example.engineapi.TransEvalCommentApi;
import com.example.engineapi.request.TransEvalCommentRequest;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

/**
 * @Author: gaobaozong
 * @Description: TODO 描述类的作用
 * @Date: Created in 2021/9/5 - 16:32
 * @Version: V1.0
 */
@Service
public class TransEvalCommentService implements TransEvalCommentApi {

    @Resource
    TransEvalCommentServiceImpl service;

    @Override
    public BaseResponse<Void> addTransEvalComment(TransEvalCommentRequest request){
        TransEvalCommentEntity entity = new TransEvalCommentEntity();
        BeanUtils.copyProperties(request, entity);
        service.save(entity);
        return ResultGeneratorUtil.succeed();
    }



}
