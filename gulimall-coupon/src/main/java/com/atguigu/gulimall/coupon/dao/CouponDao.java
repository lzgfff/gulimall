package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fff
 * @email fff@gmail.com
 * @date 2021-10-21 10:35:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
