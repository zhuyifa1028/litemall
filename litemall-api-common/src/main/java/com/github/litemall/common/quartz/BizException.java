package com.github.litemall.common.quartz;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public final class BizException extends RuntimeException {

    private BizCode bizCode;
    private String message;

    public BizException(BizCode bizCode, String message) {
        super(message);
        this.bizCode = bizCode;
        this.message = message;
    }

}
