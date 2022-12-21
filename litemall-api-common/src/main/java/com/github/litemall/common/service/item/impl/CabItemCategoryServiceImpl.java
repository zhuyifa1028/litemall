package com.github.litemall.common.service.item.impl;

import com.github.litemall.common.entity.item.CabItemCategory;
import com.github.litemall.common.repository.item.CabItemCategoryRepository;
import com.github.litemall.common.service.item.CabItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class CabItemCategoryServiceImpl implements CabItemCategoryService {

    @Autowired
    private CabItemCategoryRepository cabItemCategoryRepository;

    /**
     * 获取分类列表
     */
    @Override
    public List<CabItemCategory> getCategoryList() {
        return cabItemCategoryRepository.findAll();
    }

    /**
     * 保存分类
     */
    @Override
    public void saveCategory(CabItemCategory category) {
        Optional<CabItemCategory> optional = cabItemCategoryRepository.findById(category.getPid());
        optional.ifPresent(parent -> {

            // 新增分类
            category.setLeaf(true);
            cabItemCategoryRepository.save(category);

            // 更新父级节点
            parent.setLeaf(false);
            cabItemCategoryRepository.saveAndFlush(parent);
        });
    }

}
