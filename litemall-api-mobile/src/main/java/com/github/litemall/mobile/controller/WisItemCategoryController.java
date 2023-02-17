package com.github.litemall.mobile.controller;

import com.github.litemall.common.entity.item.WisItemCategory;
import com.github.litemall.common.service.item.WisItemCategoryService;
import com.github.litemall.mobile.configuration.biz.BizResponse;
import com.github.litemall.mobile.domain.converter.WisItemCategoryConverter;
import com.github.litemall.mobile.domain.vo.WisItemCategoryVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "商品分类表")
@RestController
@RequestMapping(value = "/wisItemCategory")
public class WisItemCategoryController {

    @Resource
    private WisItemCategoryConverter wisItemCategoryConverter;
    @Resource
    private WisItemCategoryService wisItemCategoryService;

    @Operation(summary = "获取分类列表")
    @GetMapping(value = "/getCategoryList")
    public BizResponse<List<WisItemCategoryVo>> getCategoryList() {
        List<WisItemCategory> categoryList = wisItemCategoryService.getCategoryList();
        return BizResponse.ok(wisItemCategoryConverter.toCabItemCategoryVo(categoryList));
    }

}
