package com.koala.ch63helloservice.service.impl;

import com.koala.ch63helloservice.service.IHelloService;
import com.koala.ch63helloservice.service.dataservice.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IHelloServiceImpl implements IHelloService {
    @Autowired
    private ProviderService dataService;

    @Override
    public List<String> getProviderData() {
        return dataService.getProviderData();
    }
}
