package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springcloud.dao.GoodsMapper;
import com.springcloud.entity.Goods;

import com.springcloud.service.GoodsService;
/**
   *   鍟嗗搧妯″瀷灞傜殑瀹炵幇绫伙紝鐢ㄤ簬瀹炵幇鍟嗗搧妯″潡鐨勬柟娉�
 * @author 缃椾附
 *
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	@Transactional
	@Override
	public Integer insert(Goods goods) {
		
		return this.goodsMapper.insert(goods);
	}
	@Override
	public PageInfo<Goods> select(Goods goods, Integer pageNumber) {
		//商品名称两端加
		goods.setGoodName("%" + goods.getGoodName() +"%");
		PageHelper.startPage(pageNumber +1,8); //每个页面显示8个商品
		//查询满足条件的商品信息
		List<Goods> list = this.goodsMapper.select(goods);
		//返回分页信息
		return new PageInfo<>(list);
	}
	
	@Transactional
	@Override
	public Integer updateGoodsById(Goods goods) {
		return this.goodsMapper.updateGoodsById(goods);
		
	}
	@Transactional
	@Override
	public Integer update(Goods goods) {
		return this.goodsMapper.updateByPrimaryKey(goods);
	}
	@Transactional
	@Override
	public List<Goods> selectGroup() {
		return this.goodsMapper.selectGroup();
	}
}

