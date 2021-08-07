package com.miaosha.dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPasswordDO {
    private Integer id;

    private String encryptPassword;

    private Integer userId;
}