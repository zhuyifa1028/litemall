package com.example.cabinet.database.entity.item;

import cn.hutool.core.util.IdUtil;
import com.example.cabinet.database.entity.JpaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 商品分类表
 *
 * @author zhuyifa
 */
@Entity
@Table(name = "wis_item_category")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class WisItemCategory extends JpaEntity<String> {

    /**
     * 上级id
     */
    private String pid;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 分类图标
     */
    private String icon;

    public WisItemCategory(boolean isNew) {
        if (isNew) {
            setId(IdUtil.getSnowflakeNextIdStr());
        }
    }

}
