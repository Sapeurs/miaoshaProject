package com.miaosha.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemModel implements Serializable {

    private Integer id;

    //商品名称
    @NotNull(message = "商品名称不能为空")
    private String title;

    @NotNull(message = "商品价格不能为空")
    @Min(value = 0,message = "商品价格必须大于0元")
    private BigDecimal price;

    private Integer sales;

    @NotNull(message = "商品描述信息不能为空")
    private String description;

    @NotNull(message = "商品图片信息不能为空")
    private String imgUrl;

    @NotNull(message = "库存需要填写")
    private Integer stock;

    //使用聚合模型，如果promoModel不为空，则表示其拥有还未结束的秒杀活动
    private PromoModel promoModel;

}
