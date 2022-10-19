package com.prac.mall.order.dao;

import com.prac.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author wxy
 * @email wxyworkspace@gmail.com
 * @date 2022-10-20 00:01:32
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
