package com.miaosha.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

//用户下单的交易模型
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel implements Serializable {

    private String id;

    //购买用户的id
    private Integer userId;

    //购买商品的id
    private Integer itemId;

    //若非空，则表示是以秒杀商品方式下单
    private Integer promoId;

    //购买商品的单价
    private BigDecimal itemPrice;

    //购买数量
    private Integer amount;

    //购买金额
    private BigDecimal orderPrice;


}
