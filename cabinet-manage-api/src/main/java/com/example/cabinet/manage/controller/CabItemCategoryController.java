package com.example.cabinet.manage.controller;

import com.example.cabinet.database.entity.item.CabItemCategory;
import com.example.cabinet.database.service.item.CabItemCategoryService;
import com.example.cabinet.manage.domain.converter.CabItemCategoryConverter;
import com.example.cabinet.manage.domain.vo.CabItemCategoryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "商品分类表")
@RestController
@RequestMapping(value = "/cabItemCategory")
public class CabItemCategoryController {

    @Autowired
    private CabItemCategoryConverter cabItemCategoryConverter;
    @Autowired
    private CabItemCategoryService cabItemCategoryService;

    @ApiOperation(value = "保存分类")
    @GetMapping(value = "/saveCategory")
    public void saveCategory(CabItemCategoryVo vo) {
        CabItemCategory category = cabItemCategoryConverter.toCabItemCategory(vo);
        cabItemCategoryService.saveCategory(category);
    }

}
