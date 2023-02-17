package com.github.litemall.common.service.item.impl;

import com.github.litemall.common.entity.item.WisItemCategory;
import com.github.litemall.common.repository.item.WisItemCategoryRepository;
import com.github.litemall.common.service.item.WisItemCategoryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * 商品分类表Service
 *
 * @author zhuyifa
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class WisItemCategoryServiceImpl implements WisItemCategoryService {

    @Resource
    private WisItemCategoryRepository wisItemCategoryRepository;

    /**
     * 获取分类列表
     */
    @Override
    public List<WisItemCategory> getCategoryList() {
        return wisItemCategoryRepository.findByPidIsNullOrderBySort();
    }

    /**
     * 保存分类
     */
    @Override
    public void saveCategory(WisItemCategory category) {
        Optional<WisItemCategory> optional = wisItemCategoryRepository.findById(category.getPid());
        optional.ifPresent(parent -> {

            // 新增分类
            category.setLeaf(true);
            wisItemCategoryRepository.save(category);

            // 更新父级节点
            parent.setLeaf(false);
            wisItemCategoryRepository.saveAndFlush(parent);
        });
    }

}
