package com.miaosha.service;

import com.miaosha.error.BusinessException;
import com.miaosha.service.model.UserModel;

public interface UserService {

    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;

    //通过缓存获取用户对象
    UserModel getUserByIdInCache(Integer id);

    /*
    telephone:用户注册的手机
    encryptPassword:用户加密后的密码
     */
    UserModel validateLogin(String telephone,String encryptPassword) throws BusinessException;
}
