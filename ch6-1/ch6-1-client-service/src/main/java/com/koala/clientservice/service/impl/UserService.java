package com.koala.clientservice.service.impl;

import com.koala.clientservice.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    @HystrixCommand(fallbackMethod = "defaultUser")
    public String getUser(String username) throws Exception {
        if(username.equals("spring")){
            return "This is real user";
        }else {
            throw new Exception();
        }
    }

    public String defaultUser(String username){
        return "The user does not exist in this system";
    }
}
