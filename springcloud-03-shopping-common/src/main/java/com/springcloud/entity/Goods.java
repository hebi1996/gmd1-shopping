package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements java.io.Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 6742240151628448503L;
	/**
	 * 商品编号
	 */
	private Integer goodId;
	/**
	 * 商品名称
	 */
	private String goodName;
	/**
	 * 商品价格
	 */
	private Double goodPrices;
	/**
	 * 商品折扣价
	 */
	private Double goodDiscount;
	/**
	 * 商品状态：0预售，1热卖中，2已下架
	 */
	private Integer goodStatus;
	/**
	 * 商品数量
	 */
	private Integer goodCount;
	/**
	 * 商品是否新品
	 */
	private Integer goodIsNew;
	/**
	 * 商品是否热卖
	 */
	private Integer goodIsHot;
	/**
	 * 商品级别
	 */
	private Integer goodLevel;
	/**
	 * 商品简介
	 */
	private String goodBrief;
	/**
	 * 商品细节
	 */
	private String goodDetails;
	/**
	 * 商品图片
	 */
	private String goodPhoto;
	/**
	 * 商品类别2对应的id
	 */
	private Integer class2Id;
	/**
	 * 商品价格的下限
	 */
	private Double goodPricesMin;
	/**
	 * 商品价格的上限
	 */
	private Double goodPricesMax;
	/**
	 * 一级类别的编号
	 */
	private Integer class1Id;
	/**
	 * 商品销量：用于保存统计分组的结果
	 */
	private Integer goodsSum;
}