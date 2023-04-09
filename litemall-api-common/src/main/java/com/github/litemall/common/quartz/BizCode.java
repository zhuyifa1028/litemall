package com.github.litemall.common.quartz;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BizCode {

    OK(0, "ok"),
    FAIL(9999, "服务器开小差了"),
    ADDR_ANALYSIS_FAIL(9995, "地址解析失败"),
    TOKEN_TIME_OUT(9996, "TOKEN过期"),
    LOGIN_SESSION_TIMEOUT(9997, "登录过期"),
    ILLEGAL_REQ_PARAM(9998, "非法请求参数");

    private final Integer code;
    private final String message;

    @Override
    public final String toString() {
        return "[ " + code + " : " + message + " ]";
    }

}
