package com.koala.ch45consumer.service;


import com.koala.ch45consumer.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "ch4-5-provider")
public interface UserFeignService {
    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public String addUser(User user);

    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public String updateUser(@RequestBody User user);
}
