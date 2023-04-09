package com.github.litemall.manage.domain.vo.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Schema(title = "系统用户表保存VO")
@Data
public class SystemUserSaveVo implements Serializable {

    @Schema(title = "用户名")
    private String username;

    @Schema(title = "密码")
    private String password;

}
