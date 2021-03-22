package com.hello.web.admin.feign.service;

import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but fegin request error.";
    }
}
