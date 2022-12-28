package com.github.litemall.manage.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "商品分类表Vo")
@Data
public class WisItemCategoryVo implements Serializable {

    @ApiModelProperty(value = "上级id")
    private String pid;

    @ApiModelProperty(value = "分类名称")
    private String name;

    @ApiModelProperty(value = "分类图标")
    private String icon;

}
