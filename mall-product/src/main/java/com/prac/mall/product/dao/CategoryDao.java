package com.prac.mall.product.dao;

import com.prac.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wxy
 * @email wxyworkspace@gmail.com
 * @date 2022-10-19 23:37:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
