package com.springcloud.dao;

import com.springcloud.entity.OrderDetail;
import java.util.List;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer orderDetailId);

    int insert(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer orderDetailId);

    List<OrderDetail> selectAll();

    int updateByPrimaryKey(OrderDetail record);
    /**
     * 
     * @param orderId
     * @return 成功返回import java.util.List类型的实例，否则返回null
     */
    public abstract List<OrderDetail> selectByOrderId(Integer orderId);
}