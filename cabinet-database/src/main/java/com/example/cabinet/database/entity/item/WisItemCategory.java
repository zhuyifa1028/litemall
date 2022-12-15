package com.example.cabinet.database.entity.item;

import com.example.cabinet.database.entity.BaseEntity;
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
public class WisItemCategory extends BaseEntity<String> {

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

}
