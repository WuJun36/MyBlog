package com.blog.dao;

import com.blog.entity.User;

public interface UserMapper {

    /**
     * 根据用户ID查询用户信息
     * @param id 用户ID
     * @return
     */
    User selectUserById(Integer id);
}
