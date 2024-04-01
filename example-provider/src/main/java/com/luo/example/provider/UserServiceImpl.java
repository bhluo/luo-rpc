package com.luo.example.provider;
import com.luo.example.common.model.User;
import com.luo.example.common.service.UserService;

public class UserServiceImpl implements UserService{
    public User getUser(User user){
        System.out.println("用户名："+user.getName());
        return user;
    }
}
