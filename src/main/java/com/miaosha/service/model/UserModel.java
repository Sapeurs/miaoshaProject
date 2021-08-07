package com.miaosha.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel implements Serializable {

    private Integer id;

    @NotBlank(message = "用户名不能为空")
    private String name;
    @NotNull(message = "需要填写性别")
    private Byte gender;
    @NotNull(message = "需要填写年龄")
    @Min(value = 0, message = "年龄必须大于0岁")
    @Max(value = 150, message = "年龄必须小于150岁")
    private Integer age;
    @NotBlank(message = "手机号码不能为空")
    private String telephone;

    private String registerMode;

    private Integer thirdPartyId;

    private String encryptPassword;

}
