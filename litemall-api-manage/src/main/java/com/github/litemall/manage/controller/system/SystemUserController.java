package com.github.litemall.manage.controller.system;

import com.github.litemall.common.quartz.BizResponse;
import com.github.litemall.manage.domain.vo.system.SystemUserSaveVo;
import com.github.litemall.manage.service.system.SystemUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "系统用户表")
@Validated
@RestController
public class SystemUserController {

    @Resource
    private SystemUserService systemUserService;

    @Operation(summary = "保存用户")
    @PostMapping(value = "/saveSystemUser")
    public BizResponse<Object> saveSystemUser(@RequestBody SystemUserSaveVo saveVO) {
        systemUserService.saveSystemUser(saveVO);
        return BizResponse.ok();
    }

}
