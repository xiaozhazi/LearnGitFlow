package com.frances.shiro.service;

import com.frances.shiro.entity.UserInfo;

public interface UserInfoService {
    public UserInfo findByUsername(String username);
}
