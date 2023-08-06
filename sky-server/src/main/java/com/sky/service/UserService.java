package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Otaku
 * @Date: 2023/08/06/15:33
 * @Description:
 */
public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
