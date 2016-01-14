package com.pyt.facade.user.service.impl;

import org.springframework.stereotype.Service;

import com.pyt.facade.user.service.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService {
	 
    public String sayHello(String name) {
        return "Hello " + name;
    }
 
}