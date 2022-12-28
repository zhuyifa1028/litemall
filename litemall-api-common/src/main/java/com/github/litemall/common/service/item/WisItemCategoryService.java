package com.github.litemall.common.service.item;

import com.github.litemall.common.entity.item.WisItemCategory;

import java.util.List;

/**
 * 商品分类表Service
 *
 * @author zhuyifa
 */
public interface WisItemCategoryService {

    /**
     * 获取分类列表
     */
    List<WisItemCategory> getCategoryList();

    /**
     * 保存分类
     */
    void saveCategory(WisItemCategory category);

}
