package com.github.litemall.manage.domain.converter;

import com.github.litemall.common.entity.item.WisItemCategory;
import com.github.litemall.manage.domain.vo.WisItemCategoryVo;
import org.mapstruct.Mapper;

/**
 * 商品分类表Converter
 */
@Mapper(componentModel = "spring")
public interface WisItemCategoryConverter {

    WisItemCategory toWisItemCategory(WisItemCategoryVo vo);

}
