package com.prac.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prac.mall.commons.utils.PageUtils;
import com.prac.mall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author wxy
 * @email wxyworkspace@gmail.com
 * @date 2022-10-20 00:05:09
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

