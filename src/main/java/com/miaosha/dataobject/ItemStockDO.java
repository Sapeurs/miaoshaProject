package com.miaosha.dataobject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemStockDO {
    private Integer id;

    private Integer stock;

    private Integer itemId;
}