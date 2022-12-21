package com.github.litemall.manage.domain.converter;

import com.example.cabinet.database.entity.item.CabItemCategory;
import com.github.litemall.manage.domain.vo.CabItemCategoryVo;
import org.mapstruct.Mapper;

/**
 * 商品分类表Converter
 */
@Mapper(componentModel = "spring")
public interface CabItemCategoryConverter {

    CabItemCategory toCabItemCategory(CabItemCategoryVo vo);

}
