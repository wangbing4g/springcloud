package com.koala.ch41hello.controller;

import com.koala.ch41hello.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFeignController {
    @Autowired
    private HelloFeignService helloFeignService;

    @GetMapping(value = "/search/github")
    public String serchGithubRepoByStr(@RequestParam("str") String queryStr){
        return helloFeignService.searchRepo(queryStr);
    }
}
