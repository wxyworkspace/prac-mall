package com.prac.mall.member.dao;

import com.prac.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wxy
 * @email wxyworkspace@gmail.com
 * @date 2022-10-20 00:05:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
