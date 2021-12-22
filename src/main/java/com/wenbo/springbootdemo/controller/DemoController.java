package com.wenbo.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class DemoController {
    @RequestMapping("/demo")
    public String demo(){
        return "hello springboot!";
    }

    @RequestMapping("/host")
    public String host() {
        InetAddress addr = null;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String hostname = addr.getHostName();
        return "hostName: "+ hostname + "，hostAddress:" + addr.getHostAddress();
    }
}