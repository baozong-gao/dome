package com.example.engine.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * TODO 描述类的作用
 * @date  Created in 2021/9/3 - 下午2:13
 * @version V1.0
 * @author gaobaozong
 */
@ApiModel(value="com-example-engine-dao-TransEvalCommentEntity")
@Data
@TableName(value = "trans_eval_comment")
public class TransEvalCommentEntity {
    /**
     * 自增长主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="自增长主键")
    private Integer id;

    /**
     * 订单号
     */
    @TableField(value = "order_no")
    @ApiModelProperty(value="订单号")
    private Long orderNo;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createTime;

    /**
     * 处理备注：未处理1，处理中2，已处理3
     */
    @TableField(value = "dispose_remark")
    @ApiModelProperty(value="处理备注：未处理1，处理中2，已处理3")
    private Integer disposeRemark;

    public static final String COL_ID = "id";

    public static final String COL_ORDER_NO = "order_no";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_DISPOSE_REMARK = "dispose_remark";
}