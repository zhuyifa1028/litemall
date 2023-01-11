package com.github.litemall.mobile.domain.converter;

import com.github.litemall.common.entity.item.WisItemCategory;
import com.github.litemall.mobile.domain.vo.WisItemCategoryVo;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 商品分类表Converter
 */
@Mapper(componentModel = "spring")
public interface WisItemCategoryConverter {

    WisItemCategoryVo toCabItemCategoryVo(WisItemCategory item);

    List<WisItemCategoryVo> toCabItemCategoryVo(List<WisItemCategory> list);

}
