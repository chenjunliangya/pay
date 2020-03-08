package com.jun.pay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wx")
public class WxController {

    @RequestMapping("pay")
    public String pay(){
        System.out.println("成功访问！");
        return "OK";
    }

}
