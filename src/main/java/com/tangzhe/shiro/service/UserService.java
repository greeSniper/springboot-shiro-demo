package com.tangzhe.shiro.service;

import com.tangzhe.shiro.entity.User;

public interface UserService {

    User findByUsername(String username);

}
