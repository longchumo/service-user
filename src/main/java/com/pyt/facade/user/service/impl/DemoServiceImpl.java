package com.pyt.facade.user.service.impl;

import com.pyt.facade.user.service.DemoService;

public class DemoServiceImpl implements DemoService {
	 
    public String sayHello(String name) {
        return "Hello " + name;
    }
 
}