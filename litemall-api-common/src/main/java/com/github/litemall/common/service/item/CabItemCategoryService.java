package com.github.litemall.common.service.item;

import com.github.litemall.common.entity.item.CabItemCategory;

import java.util.List;

/**
 * 商品分类表Service
 *
 * @author zhuyifa
 */
public interface CabItemCategoryService {

    /**
     * 获取分类列表
     */
    List<CabItemCategory> getCategoryList();

    /**
     * 保存分类
     */
    void saveCategory(CabItemCategory category);

}
