package com.wsw.springboot.k8s.istio.user.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: wangsongwen
 * @Date: 2022/12/13 16:58
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/hello")
    public String sayHello() {
        return "hello from user service.";
    }

    @GetMapping("/getProduct")
    public String getProduct() {
        RestTemplate restTemplate = new RestTemplate();
        String msgFromProduct = restTemplate.getForObject("http://127.0.0.1:9002/product/hello", String.class);
        return "getProduct: " + msgFromProduct;
    }
}
