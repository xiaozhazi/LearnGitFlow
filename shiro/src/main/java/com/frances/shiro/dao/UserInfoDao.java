package com.frances.shiro.dao;

import com.frances.shiro.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<UserInfo,Long>{
    public UserInfo findByUsername(String username);
}
