package com.wsw.springboot.k8s.istio.user.service.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: wangsongwen
 * @Date: 2022/12/17 18:12
 */
@Component
public class ProductClient {
    @Value("${product.service.endpoint}")
    private String productServiceEndPoint;

    public String getProduct() {
        RestTemplate restTemplate = new RestTemplate();
        String msgFromProduct = restTemplate.getForObject(productServiceEndPoint + "/product/hello", String.class);
        return "product: " + msgFromProduct;
    }
}
