package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author fff
 * @email fff@gmail.com
 * @date 2021-10-20 14:44:25
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

