package com.wsw.springboot.k8s.istio.user.service.controller;

import com.wsw.springboot.k8s.istio.user.service.facade.ProductFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: wangsongwen
 * @Date: 2022/12/13 16:58
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ProductFacade productFacade;

    @GetMapping("/hello")
    public String sayHello() {
        String msgFromUser = "hello from user service.";
        log.info(msgFromUser);
        return msgFromUser;
    }

    @GetMapping("/getProduct")
    public String getProduct() {
        String msgFromProduct = productFacade.sayHello();
        log.info(msgFromProduct);
        return msgFromProduct;
    }
}
