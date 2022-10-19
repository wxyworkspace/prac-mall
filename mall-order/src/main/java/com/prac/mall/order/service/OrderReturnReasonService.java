package com.prac.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prac.mall.commons.utils.PageUtils;
import com.prac.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author wxy
 * @email wxyworkspace@gmail.com
 * @date 2022-10-20 00:01:32
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

