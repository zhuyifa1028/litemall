package com.github.litemall.mobile.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Schema(name = "商品分类表VO")
@Data
public class WisItemCategoryVo implements Serializable {

    @Schema(description = "主键")
    private String id;

    @Schema(description = "名称")
    private String name;

    @Schema(description = "排序")
    private Long sort;

    @Schema(description = "类型")
    private Integer type;

}
