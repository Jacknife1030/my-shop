package com.zww.my.shop.web.admin.dao;


import com.zww.my.shop.domain.User;

public interface UserDao {
    public User getUser(String email, String password);
}
