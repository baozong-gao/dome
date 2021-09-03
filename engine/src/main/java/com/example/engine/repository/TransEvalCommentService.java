package com.example.engine.repository;

import com.example.engine.dao.TransEvalCommentEntityExample;
import java.util.List;
import com.example.engine.dao.TransEvalCommentEntity;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 * TODO 描述类的作用
 * @date  Created in 2021/9/3 - 下午2:13
 * @version V1.0
 * @author gaobaozong
 */
public interface TransEvalCommentService extends IService<TransEvalCommentEntity>{


    long countByExample(TransEvalCommentEntityExample example);

    int deleteByExample(TransEvalCommentEntityExample example);

    List<TransEvalCommentEntity> selectByExample(TransEvalCommentEntityExample example);

    int updateByExampleSelective(TransEvalCommentEntity record,TransEvalCommentEntityExample example);

    int updateByExample(TransEvalCommentEntity record,TransEvalCommentEntityExample example);

}
