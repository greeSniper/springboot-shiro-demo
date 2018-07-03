package com.tangzhe.shiro.mapper;

import com.tangzhe.shiro.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findByUsername(@Param("username") String username);

}
