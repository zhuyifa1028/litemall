package com.example.cabinet.database.service.item;

import com.example.cabinet.database.entity.item.CabItemCategory;

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
