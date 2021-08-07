package com.miaosha.controller.viewobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemVO {

    private Integer id;

    //商品名称
    private String title;

    private BigDecimal price;

    private Integer sales;

    private String description;

    private String imgUrl;

    private Integer stock;

    //记录商品是否在秒杀活动中，以及对应的状态: 0表示没有秒杀活动，1表示秒杀活动待开始，2表示秒杀活动进行中
    private Integer promoStatus;

    //秒杀活动价格
    private BigDecimal promoPrice;

    //秒杀活动Id
    private Integer promoId;

    //秒杀活动开始时间
    private String startDate;
}
