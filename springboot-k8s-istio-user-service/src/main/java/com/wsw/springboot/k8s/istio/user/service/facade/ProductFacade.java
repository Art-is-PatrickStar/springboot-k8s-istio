package com.wsw.springboot.k8s.istio.user.service.facade;

import com.wsw.springboot.k8s.istio.user.service.facade.fallback.ProductFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: 在k8s中可以使用openFeign来调用微服务
 * <p>
 * 利用openFeign的url属性, 简写成 service_name.namespace, 只需要服务的名称和其所在的namespace就可以访问
 * @Author: wangsongwen
 * @Date: 2023/2/15 14:37
 */
@FeignClient(name = "${product.service.name}", url = "${product.service.url}", fallback = ProductFallBack.class)
public interface ProductFacade {
    @GetMapping("/product/hello")
    String sayHello();
}
