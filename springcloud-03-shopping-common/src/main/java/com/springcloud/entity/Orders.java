package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author 罗丽
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements java.io.Serializable {
    
	private static final long serialVersionUID = 1L;
	/**
	 * 订单编号
	 */
	private Integer orderId;
	/**
	 * 当前订单的用户信息
	 */
    private Users user;
    /**
	 * 收货人联系姓名
	 */
    private String consigneeName;
    /**
	 * 收货人联系电话
	 */
    private String consigneeNumber;
    /**
	 * 收货人地址
	 */
    private String consigneeSite;
	/**
	 * 订单时间：默认当前时间
	 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderTime;
	/**
	 * 订单总量
	 */
    private Double orderAmount;
	/**
	 * 订单状态
	 */
    private Integer orderStatus;
	/**
	 * 查询条件：订单起始时间
	 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDateMin;
	/**
	 * 查询条件：订单终止时间
	 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDateMax;   
    /**
	 * 查询条件：起始年月
	 */
    private String startMonth;
    /**
	 * 查询条件：终止年月
	 */
    private String endMonth;
    /**
   	 * 统计结果的年月
   	 */
    private String orderMonth;
    /**
   	 * 统计结果的销售额
   	 */
    private Double orderPrice;
}