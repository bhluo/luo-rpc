package com.luo.example.consumer;
import com.luo.example.common.model.User;
import com.luo.example.common.service.UserService;
import com.luo.luorpc.proxy.ServiceProxyFactory;


public class EasyConsumerExample {
    public static void main(String[] args) {
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("luo");
        User newUser = userService.getUser(user);
        if(newUser != null){
            System.out.println(newUser.getName());
        }else{
            System.out.println("user == null");
        }
    }
}
