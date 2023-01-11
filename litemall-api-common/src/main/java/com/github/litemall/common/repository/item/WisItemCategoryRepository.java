package com.github.litemall.common.repository.item;

import com.github.litemall.common.entity.item.WisItemCategory;
import com.github.litemall.common.repository.BaseRepository;

import java.util.List;

/**
 * 商品分类表Repository
 *
 * @author zhuyifa
 */
public interface WisItemCategoryRepository extends BaseRepository<WisItemCategory, String> {

    List<WisItemCategory> findByPidIsNullOrderBySort();

}
