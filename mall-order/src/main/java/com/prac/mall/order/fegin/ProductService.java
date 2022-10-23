package com.prac.mall.order.fegin;

import com.prac.mall.commons.utils.R;
//import com.msb.mall.order.vo.OrderItemSpuInfoVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @FeignClient 指明我们要从注册中心中发现的服务的名称
 */
@FeignClient(name = "mall-product")
public interface ProductService {

    /**
     * 需要访问的远程方法
     * @return
     */
    @GetMapping("/product/brand/all")
    public R queryAllBrand();
}
