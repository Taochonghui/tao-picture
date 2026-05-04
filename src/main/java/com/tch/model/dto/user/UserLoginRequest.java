package com.tch.model.dto.user;

/**
 * @author 陶崇慧
 * @version 1.0
 */

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求类
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 5591824943218937138L;

    /**
     * 账户
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}
