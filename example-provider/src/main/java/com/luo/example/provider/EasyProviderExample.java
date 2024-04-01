package com.luo.example.provider;

import com.luo.example.common.service.UserService;
import com.luo.luorpc.registry.LocalRegistry;
import com.luo.luorpc.server.HttpServer;
import com.luo.luorpc.server.VertxHttpServer;
public class EasyProviderExample {
    public static void main(String[] args) {
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
