package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Goods;

/**
 * 鍟嗗搧妯″瀷鐨勬帴鍙ｏ紝鐢ㄤ簬瀹氫箟妯″潡鐨勬柟娉�
 * 
 * @author 缃椾附
 *
 */
public interface GoodsService {
	/**
	 * 添加新商品信息
	 * 
	 * @param goods 新商品信息
	 * @return 成功返回大于0的整数，否则返回小于等于0的整数
	 */
	public abstract Integer insert(Goods goods);

	/**
	 * 查询满足条件的商品条件 （分页功能）
	 * 
	 * @param goods      查询条件
	 * @param pageNumber 页数
	 * @return 成功返回 import com.github.pagehelper.PageInfo实例，否则返回null/
	 */
	public abstract PageInfo<Goods> select(Goods goods, Integer pageNumber);

	/**
	 * 根据条件修改商品信息
	 * 
	 * @param goods 修改商品的信息
	 * @return 成功返回大于0的整数，否则返回小于等于0的整数
	 */
	public abstract Integer updateGoodsById(Goods goods);

	/**
	 * 修改指定编号的商品信息
	 * 
	 * @param goods 修改的商品信息
	 * @return 成功返回大于0的整数，否则返回小于等于0的整数成功返回大于0的整数，否则返回小于等于0的整数
	 */
	public abstract Integer update(Goods goods);
	/**
	 * 查询销量前10 的商品信息
	 * @return 成功返回java.util.List;类型的实例，否则返回null 
	 */
	public abstract List<Goods> selectGroup();
}
