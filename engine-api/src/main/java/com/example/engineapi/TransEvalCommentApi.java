package com.example.engineapi;

import com.example.common.pojo.BaseResponse;
import com.example.engineapi.request.TransEvalCommentRequest;

/**
 * @Author: gaobaozong
 * @Description: TODO 描述类的作用
 * @Date: Created in 2021/9/5 - 16:40
 * @Version: V1.0
 */
public interface TransEvalCommentApi {

    /**
     * 添加
     * @param request
     * @return
     */
    BaseResponse<Void> addTransEvalComment(TransEvalCommentRequest request);

}
