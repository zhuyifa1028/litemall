package com.github.litemall.mobile.controller;

import com.example.cabinet.database.entity.item.CabItemCategory;
import com.example.cabinet.database.service.item.CabItemCategoryService;
import com.github.litemall.mobile.domain.converter.CabItemCategoryConverter;
import com.github.litemall.mobile.domain.vo.CabItemCategoryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "商品分类表")
@RestController
@RequestMapping(value = "/cabItemCategory")
public class CabItemCategoryController {

    @Autowired
    private CabItemCategoryConverter cabItemCategoryConverter;
    @Autowired
    private CabItemCategoryService cabItemCategoryService;

    @ApiOperation(value = "获取分类列表")
    @GetMapping(value = "/getCategoryList")
    public List<CabItemCategoryVo> getCategoryList() {
        List<CabItemCategory> categoryList = cabItemCategoryService.getCategoryList();
        return cabItemCategoryConverter.toCabItemCategoryVo("root", categoryList);
    }

}
