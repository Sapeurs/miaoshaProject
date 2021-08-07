package com.miaosha.controller.viewobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
    private Integer id;

    private String name;

    private Byte gender;

    private Integer age;

    private String telephone;
}
