package com.example.engineapi.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransEvalCommentResponse {
    /**
     * 自增长主键
     */
    @ApiModelProperty(value="自增长主键")
    private Integer id;

    /**
     * 订单号
     */
    @ApiModelProperty(value="订单号")
    private Long orderNo;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createTime;

    /**
     * 处理备注：未处理1，处理中2，已处理3
     */
    @ApiModelProperty(value="处理备注：未处理1，处理中2，已处理3")
    private Integer disposeRemark;

}