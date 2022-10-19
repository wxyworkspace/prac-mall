package com.prac.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prac.mall.commons.utils.PageUtils;
import com.prac.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wxy
 * @email wxyworkspace@gmail.com
 * @date 2022-10-19 22:10:19
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

