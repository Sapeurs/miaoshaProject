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

    private Integer status;
}