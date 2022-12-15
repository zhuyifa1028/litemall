package com.example.cabinet.database.entity.user;

import cn.hutool.core.util.IdUtil;
import com.example.cabinet.database.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户信息表
 *
 * @author zhuyifa
 */
@Entity
@Table(name = "wis_user_info")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class WisUserInfo extends BaseEntity<String> {

    /**
     * 用户名称
     */
    private String name;

    public WisUserInfo(boolean isNew) {
        if (isNew) {
            setId(IdUtil.getSnowflakeNextIdStr());
        }
    }

}
