package com.prac.mall.coupon.dao;

import com.prac.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wxy
 * @email wxyworkspace@gmail.com
 * @date 2022-10-20 00:03:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
