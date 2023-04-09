package com.github.litemall.manage.configuration;

import com.github.litemall.common.quartz.BizCode;
import com.github.litemall.common.quartz.BizException;
import com.github.litemall.common.quartz.BizResponse;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.stream.Collectors;


/**
 * 全局异常处理
 *
 * @author zhuyifa
 */
@Slf4j
@ControllerAdvice
public class BizExceptionHandler {

    /**
     * HTTP请求方法不支持异常处理
     */
    @ResponseBody
    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    public BizResponse<Object> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        return BizResponse.fail(BizCode.FAIL, e.getMessage());
    }

    /**
     * 方法参数无效异常处理
     */
    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public BizResponse<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        String collect = e.getBindingResult().getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.joining("；"));
        return BizResponse.fail(BizCode.ILLEGAL_REQ_PARAM, collect);
    }

    /**
     * 约束违反异常处理
     */
    @ResponseBody
    @ExceptionHandler(value = ConstraintViolationException.class)
    public BizResponse<Object> handleConstraintViolationException(ConstraintViolationException e) {
        String collect = e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.joining("；"));
        return BizResponse.fail(BizCode.ILLEGAL_REQ_PARAM, collect);
    }

    /**
     * 绑定异常处理
     */
    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public BizResponse<Object> handleBindException(BindException e) {
        String collect = e.getBindingResult().getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.joining("；"));
        return BizResponse.fail(BizCode.ILLEGAL_REQ_PARAM, collect);
    }

    /**
     * 业务异常处理
     */
    @ResponseBody
    @ExceptionHandler(value = BizException.class)
    public BizResponse<Object> handleBizException(BizException e) {
        log.error(">>>>>>业务异常：", e);
        return BizResponse.fail(e.getBizCode(), e.getMessage());
    }

    /**
     * 默认异常处理
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public BizResponse<Object> handleException(Exception e) {
        log.error(">>>>>>系统异常：", e);
        return BizResponse.fail(BizCode.FAIL, "系统繁忙，请稍后重试！");
    }

}
