package com.example.cabinet.database.repository.item;

import cn.hutool.json.JSONUtil;
import com.example.cabinet.database.entity.item.WisItemCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class WisItemCategoryRepositoryTest {

    @Autowired
    private WisItemCategoryRepository wisItemCategoryRepository;

    @Test
    void testInsert() {
        WisItemCategory entity = new WisItemCategory(true);
        entity.setPid("root");
        entity.setName("");
        entity.setIcon("");

        wisItemCategoryRepository.save(entity);
    }

    @Test
    void testSelect() {
        Optional<WisItemCategory> optional = wisItemCategoryRepository.findById("1602662442354245632");
        optional.ifPresent(wisItemCategory -> System.out.println(JSONUtil.toJsonStr(wisItemCategory)));
    }

}