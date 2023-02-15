package com.wsw.springboot.k8s.istio.product.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.wsw")
public class SpringbootK8sIstioProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootK8sIstioProductServiceApplication.class, args);
    }

}
