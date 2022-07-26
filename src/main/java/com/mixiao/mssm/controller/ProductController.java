package com.mixiao.mssm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//商品控制层
@RestController
@Controller
@RequestMapping("/product")
public class ProductController {
    @Value("hello")
    private String testHello;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!" + testHello;
    }
}
