package com.github.litemall.mobile.domain.converter;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.BooleanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.github.litemall.common.entity.item.CabItemCategory;
import com.github.litemall.mobile.domain.vo.CabItemCategoryVo;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品分类表Converter
 */
@Mapper(componentModel = "spring")
public interface CabItemCategoryConverter {

    CabItemCategoryVo toCabItemCategoryVo(CabItemCategory item);

    default List<CabItemCategoryVo> toCabItemCategoryVo(String pid, List<CabItemCategory> list) {
        if (CollUtil.isEmpty(list)) {
            return CollUtil.newArrayList();
        }

        // 过滤列表
        List<CabItemCategory> filterList = list.stream()
                .filter(item -> ObjectUtil.notEqual(item.getPid(), pid))
                .collect(Collectors.toList());

        return list.stream()
                .filter(item -> ObjectUtil.equals(item.getPid(), pid))
                .map(item -> {
                    CabItemCategoryVo vo = toCabItemCategoryVo(item);
                    // 不是叶子节点
                    if (BooleanUtil.isFalse(item.getLeaf())) {
                        vo.setList(toCabItemCategoryVo(item.getId(), filterList));
                    }
                    return vo;
                }).collect(Collectors.toList());
    }

}