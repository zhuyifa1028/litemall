package com.github.litemall.mobile.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "商品分类表Vo")
@Data
public class WisItemCategoryVo implements Serializable {

    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "排序")
    private Long sort;

    @ApiModelProperty(value = "类型")
    private Integer type;

}
