package com.miaosha.dataobject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockLogDO {
    private String stockLogId;

    private Integer itemId;

    private Integer amount;
    /**
     * 1：消息状态未知  2：消息成功提交   3：消息回滚
     */
    private Integer status;
}