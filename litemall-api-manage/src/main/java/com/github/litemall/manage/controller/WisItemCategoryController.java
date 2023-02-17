package com.github.litemall.manage.controller;

import com.github.litemall.common.entity.item.WisItemCategory;
import com.github.litemall.common.service.item.WisItemCategoryService;
import com.github.litemall.manage.domain.converter.WisItemCategoryConverter;
import com.github.litemall.manage.domain.vo.WisItemCategorySaveVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "商品分类表")
@RestController
@RequestMapping(value = "/wisItemCategory")
public class WisItemCategoryController {

    @Resource
    private WisItemCategoryConverter wisItemCategoryConverter;
    @Resource
    private WisItemCategoryService wisItemCategoryService;

    @Operation(summary = "保存分类")
    @PostMapping(value = "/saveCategory")
    public void saveCategory(@RequestBody WisItemCategorySaveVo vo) {
        WisItemCategory category = wisItemCategoryConverter.toWisItemCategory(vo);
        wisItemCategoryService.saveCategory(category);
    }

}
