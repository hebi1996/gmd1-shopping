package com.springcloud.entity;

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
public class OrderDetail implements java.io.Serializable {
	
   
	private static final long serialVersionUID = -5046298509700334785L;
	/**
	 * 订单详情编号
	 */
	private Integer orderDetailId;
	/**
	 * 订单编号
	 */
    private Integer orderId;
	/**
	 * 商品编号
	 */
    private Integer goodId;
	/**
	 * 商品名称
	 */
    private String goodName;
	/**
	 * 订单交易价格
	 */
    private Double transationPrice;
    /**
	 * 订单交易总量
	 */
    private Integer transationCount;

    

   
}