package com.github.litemall.common.quartz;

import lombok.Data;

import java.util.Objects;

@Data
public class BizAssert {

    public static void isNull(Object object, String message) {
        if (Objects.nonNull(object)) {
            throw new BizException(BizCode.ILLEGAL_REQ_PARAM, message);
        }
    }

}
