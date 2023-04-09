package com.github.litemall.common.entity.system;

import com.github.litemall.common.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 系统用户表
 *
 * @author zhuyifa
 */
@Entity
@Table(name = "system_user")
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemUser extends BaseEntity {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

}
