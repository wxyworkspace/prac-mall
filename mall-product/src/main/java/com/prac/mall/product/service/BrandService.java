package com.prac.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prac.mall.commons.utils.PageUtils;
import com.prac.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author wxy
 * @email wxyworkspace@gmail.com
 * @date 2022-10-19 23:37:21
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

