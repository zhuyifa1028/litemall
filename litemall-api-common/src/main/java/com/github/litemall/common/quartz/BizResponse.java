package com.github.litemall.common.quartz;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

@Data
public class BizResponse<T> {

    private Integer code;

    private T data;

    private String message;

    private static <T> BizResponse<T> newInstance(T bizData) {
        BizResponse<T> response = new BizResponse<>();
        response.setData(bizData);
        response.setCode(BizCode.OK.getCode());
        response.setMessage(BizCode.OK.getMessage());
        return response;
    }

    public static BizResponse<Object> ok() {
        return ok(null);
    }

    public static <T> BizResponse<T> ok(T bizData) {
        return newInstance(bizData);
    }

    public static BizResponse<Object> fail(BizCode bizCode, String message) {
        BizResponse<Object> response = new BizResponse<>();
        response.setCode(bizCode.getCode());
        response.setMessage(StrUtil.nullToDefault(message, bizCode.getMessage()));
        return response;
    }

}
