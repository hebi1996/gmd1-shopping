package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * class1���Ӧ��ʵ���࣬���ڱ������һ�ж���������Ϣ
 * 
 * @author ����
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class2 implements java.io.Serializable{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 13851492467804786L;
	/**
     * ���������
     */
    private Integer class2Id;
    /**
     * �����������
     */
    private String class2Name;
    /**
     * һ�������
     */
    private Integer class1Id;
    /**
     * ��ע
     */
    private String remark;

   
}