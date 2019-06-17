package com.springcloud.dao;

import com.springcloud.entity.Goods;
import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodId);

    int insert(Goods record);

    Goods selectByPrimaryKey(Integer goodId);

    List<Goods> selectAll();

    int updateByPrimaryKey(Goods record);
    
    /**
     * 鏌ヨgoods琛ㄤ腑婊¤冻鏉′欢鐨勫晢鍝佷俊鎭�
     * @param goods  鏌ヨ鏉′欢
     * @return 鎴愬姛杩斿洖java.util.List绫诲瀷鐨勫疄渚嬶紝鍚﹀垯杩斿洖null
     */ 
    public abstract List<Goods> select (Goods goods);
    /**
     * 根据条件修改goods表中指定good_id的商品信息
     * @param goods  修改的商品信息
     * @return 成功返回大于0的整数，否则返回小于等于0的整数
     */
    public abstract Integer updateGoodsById(Goods goods);
    /**
     *   查询销量前10 的商品信息
     * @return 成功返回java.util.List否则返回null
     */
    public abstract List<Goods> selectGroup();
}