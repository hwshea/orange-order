package com.sfg.orange.order.dao.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.sfg.orange.order.dao.entity.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper extends BaseMapper<Order> {

    String selectOrderNoById(@Param("id") Long id);
}
