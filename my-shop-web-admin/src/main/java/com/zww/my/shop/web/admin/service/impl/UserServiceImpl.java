package com.zww.my.shop.web.admin.service.impl;


import com.zww.my.shop.domain.User;
import com.zww.my.shop.web.admin.dao.UserDao;
import com.zww.my.shop.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User login(String email, String password) {
        /*SpringContext context = new SpringContext();
        UserDao userDao = (UserDao)context.getBean("userDao");*/
        return userDao.getUser(email,password);
    }
}
