package com.example.cabinet.database.repository.item;

import cn.hutool.json.JSONUtil;
import com.example.cabinet.database.entity.item.WisItemCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WisItemCategoryRepositoryTests {

    @Autowired
    WisItemCategoryRepository repository;

    @Test
    void insertTest() {
        WisItemCategory entity = new WisItemCategory();
        entity.setId("1602662442354245632");
        entity.setPid("root");
        entity.setName("");
        entity.setIcon("");

        repository.save(entity);
    }

    @Test
    void updateTest() {
        WisItemCategory entity = new WisItemCategory();
        entity.setId("1602662442354245632");
        entity.setPid("root");
        entity.setName("测试");
        entity.setIcon("");

        repository.saveAndFlush(entity);
    }

    @Test
    void selectTest() {
        List<WisItemCategory> list = repository.findAll();
        System.out.println(JSONUtil.toJsonStr(list));
    }

    @Test
    void deleteTest() {
        repository.deleteById("1602662442354245632");
    }

}