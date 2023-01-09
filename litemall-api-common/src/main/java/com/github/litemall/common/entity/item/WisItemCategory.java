package com.github.litemall.common.entity.item;

import com.github.litemall.common.entity.BaseEntity;
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
@Table(name = "wis_item_category")
@Data
@EqualsAndHashCode(callSuper = true)
public class WisItemCategory extends BaseEntity<String> {

    /**
     * 上级id
     */
    private String pid;
    /**
     * 类型
     */
    private Integer type;
    /**
     * 名称
     */
    private String name;
    /**
     * 图标
     */
    private String icon;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 是否为叶子节点
     */
    private Boolean leaf;

}
