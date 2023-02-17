package com.github.litemall.common.entity.user;

import com.github.litemall.common.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户表
 *
 * @author zhuyifa
 */
@Entity
@Table(name = "wis_user")
@Data
@EqualsAndHashCode(callSuper = true)
public class WisUser extends BaseEntity<String> {

    /**
     * 用户名称
     */
    private String name;

}
