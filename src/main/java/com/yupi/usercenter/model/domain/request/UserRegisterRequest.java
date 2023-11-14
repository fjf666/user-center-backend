package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 */
@Data
public class UserRegisterRequest implements Serializable {

    // 序列化id  光标放在UserRegisterRequest，按下快捷键alt+enter，选择add'serialVersionUID'fileld
    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;
}
