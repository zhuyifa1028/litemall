package com.github.litemall.mobile.configuration.biz;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public final class BizException extends RuntimeException {

    private BizCode bizCode;
    private String message;

    private BizException(BizCode bizCode, String message) {
        super(toMessage(bizCode, message));
        this.bizCode = bizCode;
        this.message = message;
    }

    private static String toMessage(BizCode bizCode, String message) {
        StringBuilder sb = StrUtil.builder();

        sb.append("[");

        if (ObjectUtil.isNotEmpty(bizCode)) {
            sb.append(bizCode);
        }

        if (ObjectUtil.isNotEmpty(message)) {
            sb.append(message);
        }

        sb.append("]");

        return sb.toString();
    }

}
