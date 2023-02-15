package com.wsw.springboot.k8s.istio.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.wsw")
public class SpringbootK8sIstioUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootK8sIstioUserServiceApplication.class, args);
    }

}
