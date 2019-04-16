package com.zww.my.shop.web.admin.dao.impl;


import com.zww.my.shop.domain.User;
import com.zww.my.shop.web.admin.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    public User getUser(String email, String password) {
        logger.debug("调用 getUser() email:{} password:{}",email,password);

        User user = null;
        if("admin@zww.com".equals(email)){
            if("admin".equals(password)){
                user = new User();
                user.setEmail("admin@zww.com");
                user.setUsername("admin");

                logger.info("成功获取 \" {} \" 的用户信息", user.getUsername());
            }
        }else{
            logger.warn("获取 \" {} \" 的用户信息失败");
        }
        return user;
    }
}
