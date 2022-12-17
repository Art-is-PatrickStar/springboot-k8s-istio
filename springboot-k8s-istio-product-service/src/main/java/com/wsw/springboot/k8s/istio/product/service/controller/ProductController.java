package com.wsw.springboot.k8s.istio.product.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: wangsongwen
 * @Date: 2022/12/13 17:00
 */
@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/hello")
    public String sayHello() {
        String msgFromProduct = "hello from product service.";
        log.info(msgFromProduct);
        return msgFromProduct;
    }
}
