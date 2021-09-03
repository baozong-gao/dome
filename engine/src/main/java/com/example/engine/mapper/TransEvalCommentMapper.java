package com.example.engine.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.engine.dao.TransEvalCommentEntity;
import com.example.engine.dao.TransEvalCommentEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * TODO 描述类的作用
 * @date  Created in 2021/9/3 - 下午2:13
 * @version V1.0
 * @author gaobaozong
 */
public interface TransEvalCommentMapper extends BaseMapper<TransEvalCommentEntity> {
    long countByExample(TransEvalCommentEntityExample example);

    int deleteByExample(TransEvalCommentEntityExample example);

    List<TransEvalCommentEntity> selectByExample(TransEvalCommentEntityExample example);

    int updateByExampleSelective(@Param("record") TransEvalCommentEntity record, @Param("example") TransEvalCommentEntityExample example);

    int updateByExample(@Param("record") TransEvalCommentEntity record, @Param("example") TransEvalCommentEntityExample example);
}