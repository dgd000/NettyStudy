package org.netty.publicinterface.impl;

import org.netty.publicinterface.HelloService;

public class HelloServiceImpl implements HelloService{
    public String sayHello(String msg) {
        return msg != null ? msg + " -----> I am fine." : "I am fine.";
    }
}
