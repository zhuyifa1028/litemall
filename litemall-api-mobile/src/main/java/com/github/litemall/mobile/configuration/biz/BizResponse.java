package com.github.litemall.mobile.configuration.biz;

import cn.hutool.core.util.StrUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "业务响应")
@Data
public class BizResponse<T> {

    @ApiModelProperty(value = "状态码")
    private Integer code;

    @ApiModelProperty(value = "数据")
    private T data;

    @ApiModelProperty(value = "消息")
    private String message;

    private static <T> BizResponse<T> newInstance(T bizData) {
        BizResponse<T> response = new BizResponse<>();
        response.setData(bizData);
        response.setCode(BizCode.OK.getCode());
        response.setMessage(StrUtil.nullToDefault(null, BizCode.OK.getMessage()));
        return response;
    }

    public static <T> BizResponse<T> ok(T bizData) {
        return newInstance(bizData);
    }

}
