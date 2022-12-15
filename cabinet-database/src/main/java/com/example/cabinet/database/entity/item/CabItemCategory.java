package com.example.cabinet.database.entity.item;

import com.example.cabinet.database.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 商品分类表
 *
 * @author zhuyifa
 */
@Entity
@Table(name = "cab_item_category")
@Data
@EqualsAndHashCode(callSuper = true)
public class CabItemCategory extends BaseEntity<String> {

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
