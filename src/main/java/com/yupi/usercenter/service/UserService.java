package com.yupi.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.usercenter.model.domain.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@Service
public interface UserService extends IService<User> {



    /**
     * 用户注册
     * @param userAccount 用户账号
     * @param password 用户密码
     * @param checkPassword 检验密码
     * @return 用户id
     */
    long userRegister(String userAccount, String password, String checkPassword, String planetCode);


    /**
     * 用户登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    //用户脱敏
    User getSafetyUser(User originUser);

    //用户注销
    int userLogout(HttpServletRequest request);
}
