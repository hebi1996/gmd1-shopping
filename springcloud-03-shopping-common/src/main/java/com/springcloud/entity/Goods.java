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
	 * ��Ʒ���
	 */
	private Integer goodId;
	/**
	 * ��Ʒ����
	 */
	private String goodName;
	/**
	 * ��Ʒ�۸�
	 */
	private Double goodPrices;
	/**
	 * ��Ʒ�ۿۼ�
	 */
	private Double goodDiscount;
	/**
	 * ��Ʒ״̬��0Ԥ�ۣ�1�����У�2���¼�
	 */
	private Integer goodStatus;
	/**
	 * ��Ʒ����
	 */
	private Integer goodCount;
	/**
	 * ��Ʒ�Ƿ���Ʒ
	 */
	private Integer goodIsNew;
	/**
	 * ��Ʒ�Ƿ�����
	 */
	private Integer goodIsHot;
	/**
	 * ��Ʒ����
	 */
	private Integer goodLevel;
	/**
	 * ��Ʒ���
	 */
	private String goodBrief;
	/**
	 * ��Ʒϸ��
	 */
	private String goodDetails;
	/**
	 * ��ƷͼƬ
	 */
	private String goodPhoto;
	/**
	 * ��Ʒ���2��Ӧ��id
	 */
	private Integer class2Id;
	/**
	 * ��Ʒ�۸������
	 */
	private Double goodPricesMin;
	/**
	 * ��Ʒ�۸������
	 */
	private Double goodPricesMax;
	/**
	 * һ�����ı��
	 */
	private Integer class1Id;
	/**
	 * ��Ʒ���������ڱ���ͳ�Ʒ���Ľ��
	 */
	private Integer goodsSum;
}