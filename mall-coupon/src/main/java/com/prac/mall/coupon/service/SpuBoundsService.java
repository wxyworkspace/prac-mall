package com.prac.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prac.mall.commons.utils.PageUtils;
import com.prac.mall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author wxy
 * @email wxyworkspace@gmail.com
 * @date 2022-10-20 00:03:45
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

