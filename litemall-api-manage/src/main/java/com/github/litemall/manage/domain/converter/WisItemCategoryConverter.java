package com.github.litemall.manage.domain.converter;

import com.github.litemall.common.entity.item.WisItemCategory;
import com.github.litemall.manage.domain.vo.WisItemCategorySaveVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * 商品分类表Converter
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WisItemCategoryConverter {

    WisItemCategory toWisItemCategory(WisItemCategorySaveVo vo);

}
