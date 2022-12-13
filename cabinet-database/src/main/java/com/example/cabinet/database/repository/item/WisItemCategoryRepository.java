package com.example.cabinet.database.repository.item;

import com.example.cabinet.database.entity.item.WisItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 商品分类表 Repository
 *
 * @author zhuyifa
 */
public interface WisItemCategoryRepository extends JpaRepository<WisItemCategory, String> {

}
