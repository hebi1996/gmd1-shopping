package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author ����
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail implements java.io.Serializable {
	
   
	private static final long serialVersionUID = -5046298509700334785L;
	/**
	 * ����������
	 */
	private Integer orderDetailId;
	/**
	 * �������
	 */
    private Integer orderId;
	/**
	 * ��Ʒ���
	 */
    private Integer goodId;
	/**
	 * ��Ʒ����
	 */
    private String goodName;
	/**
	 * �������׼۸�
	 */
    private Double transationPrice;
    /**
	 * ������������
	 */
    private Integer transationCount;

    

   
}