package com.zww.my.shop.web.admin.service;


import com.zww.my.shop.domain.User;

public interface UserService {
    public User login(String email, String password);

}
