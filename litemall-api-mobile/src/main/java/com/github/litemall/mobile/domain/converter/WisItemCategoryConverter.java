package com.github.litemall.mobile.domain.converter;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.BooleanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.github.litemall.common.entity.item.WisItemCategory;
import com.github.litemall.mobile.domain.vo.WisItemCategoryVo;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品分类表Converter
 */
@Mapper(componentModel = "spring")
public interface WisItemCategoryConverter {

    WisItemCategoryVo toCabItemCategoryVo(WisItemCategory item);

    default List<WisItemCategoryVo> toCabItemCategoryVo(String pid, List<WisItemCategory> list) {
        if (CollUtil.isEmpty(list)) {
            return CollUtil.newArrayList();
        }

        // 过滤列表
        List<WisItemCategory> filterList = list.stream()
                .filter(item -> ObjectUtil.notEqual(item.getPid(), pid))
                .collect(Collectors.toList());

        return list.stream()
                .filter(item -> ObjectUtil.equals(item.getPid(), pid))
                .map(item -> {
                    WisItemCategoryVo vo = toCabItemCategoryVo(item);
                    // 不是叶子节点
                    if (BooleanUtil.isFalse(item.getLeaf())) {
                        vo.setList(toCabItemCategoryVo(item.getId(), filterList));
                    }
                    return vo;
                }).collect(Collectors.toList());
    }

}
