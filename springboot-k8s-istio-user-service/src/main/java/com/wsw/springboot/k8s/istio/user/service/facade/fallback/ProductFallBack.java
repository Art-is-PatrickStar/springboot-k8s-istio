package com.wsw.springboot.k8s.istio.user.service.facade.fallback;

import com.wsw.springboot.k8s.istio.user.service.facade.ProductFacade;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: wangsongwen
 * @Date: 2023/2/15 14:38
 */
@Slf4j
@Component
public class ProductFallBack implements FallbackFactory<ProductFacade> {
    @Override
    public ProductFacade create(Throwable throwable) {
        return () -> "product服务调用失败: {}" + throwable.getMessage();
    }
}
