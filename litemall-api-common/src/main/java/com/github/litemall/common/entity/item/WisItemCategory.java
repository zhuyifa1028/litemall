package com.github.litemall.common.entity.item;

import com.github.litemall.common.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品分类表
 *
 * @author zhuyifa
 */
@Entity
@Table(name = "wis_item_category")
@Data
@EqualsAndHashCode(callSuper = true)
public class WisItemCategory extends BaseEntity {

    /**
     * 上级id
     */
    private String pid;
    /**
     * 图片
     */
    private String img;
    /**
     * 名称
     */
    private String name;
    /**
     * 排序
     */
    private Long sort;
    /**
     * 类型
     */
    private Integer type;
    /**
     * 是否为叶子节点
     */
    private Boolean leaf;

}
