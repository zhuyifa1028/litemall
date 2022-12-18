package com.example.cabinet.mobile.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@ApiModel(value = "商品分类表Vo")
@Data
public class CabItemCategoryVo implements Serializable {

    @ApiModelProperty(value = "分类id")
    private String id;

    @ApiModelProperty(value = "分类名称")
    private String name;

    @ApiModelProperty(value = "分类图标")
    private String icon;

    @ApiModelProperty(value = "下级列表")
    private List<CabItemCategoryVo> list;

}
