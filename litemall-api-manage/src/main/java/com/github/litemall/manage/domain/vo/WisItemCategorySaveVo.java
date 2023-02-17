package com.github.litemall.manage.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Schema(title = "商品分类表Vo")
@Data
public class WisItemCategorySaveVo implements Serializable {

    @Schema(title = "上级id")
    private String pid;

    @Schema(title = "分类名称")
    private String name;

    @Schema(title = "分类图标")
    private String icon;

}
