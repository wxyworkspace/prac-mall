package com.prac.mall.order.dao;

import com.prac.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wxy
 * @email wxyworkspace@gmail.com
 * @date 2022-10-20 00:01:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
