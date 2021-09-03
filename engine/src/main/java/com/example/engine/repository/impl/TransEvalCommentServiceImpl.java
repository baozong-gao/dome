package com.example.engine.repository.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.engine.mapper.TransEvalCommentMapper;
import com.example.engine.dao.TransEvalCommentEntityExample;
import java.util.List;
import com.example.engine.dao.TransEvalCommentEntity;
import com.example.engine.repository.TransEvalCommentService;
/**
 * TODO 描述类的作用
 * @date  Created in 2021/9/3 - 下午2:13
 * @version V1.0
 * @author gaobaozong
 */
@Service
public class TransEvalCommentServiceImpl extends ServiceImpl<TransEvalCommentMapper, TransEvalCommentEntity> implements TransEvalCommentService{

    @Override
    public long countByExample(TransEvalCommentEntityExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(TransEvalCommentEntityExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<TransEvalCommentEntity> selectByExample(TransEvalCommentEntityExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(TransEvalCommentEntity record,TransEvalCommentEntityExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(TransEvalCommentEntity record,TransEvalCommentEntityExample example) {
        return baseMapper.updateByExample(record,example);
    }
}
