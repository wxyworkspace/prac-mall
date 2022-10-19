package com.prac.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prac.mall.commons.utils.PageUtils;
import com.prac.mall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author wxy
 * @email wxyworkspace@gmail.com
 * @date 2022-10-20 00:03:46
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

