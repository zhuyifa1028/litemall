package com.github.litemall.manage.controller;

import com.github.litemall.common.entity.item.WisItemCategory;
import com.github.litemall.common.service.item.WisItemCategoryService;
import com.github.litemall.manage.domain.converter.WisItemCategoryConverter;
import com.github.litemall.manage.domain.vo.WisItemCategoryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "商品分类表")
@RestController
@RequestMapping(value = "/wisItemCategory")
public class WisItemCategoryController {

    @Autowired
    private WisItemCategoryConverter wisItemCategoryConverter;
    @Autowired
    private WisItemCategoryService wisItemCategoryService;

    @ApiOperation(value = "保存分类")
    @GetMapping(value = "/saveCategory")
    public void saveCategory(WisItemCategoryVo vo) {
        WisItemCategory category = wisItemCategoryConverter.toWisItemCategory(vo);
        wisItemCategoryService.saveCategory(category);
    }

}
