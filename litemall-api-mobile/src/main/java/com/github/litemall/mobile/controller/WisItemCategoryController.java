package com.github.litemall.mobile.controller;

import com.github.litemall.common.entity.item.WisItemCategory;
import com.github.litemall.common.service.item.WisItemCategoryService;
import com.github.litemall.mobile.domain.converter.WisItemCategoryConverter;
import com.github.litemall.mobile.domain.vo.WisItemCategoryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "商品分类表")
@RestController
@RequestMapping(value = "/wisItemCategory")
public class WisItemCategoryController {

    @Autowired
    private WisItemCategoryConverter wisItemCategoryConverter;
    @Autowired
    private WisItemCategoryService wisItemCategoryService;

    @ApiOperation(value = "获取分类列表")
    @GetMapping(value = "/getCategoryList")
    public List<WisItemCategoryVo> getCategoryList() {
        List<WisItemCategory> categoryList = wisItemCategoryService.getCategoryList();
        return wisItemCategoryConverter.toCabItemCategoryVo("root", categoryList);
    }

}
