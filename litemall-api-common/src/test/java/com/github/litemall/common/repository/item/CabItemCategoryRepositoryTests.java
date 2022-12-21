package com.github.litemall.common.repository.item;

import cn.hutool.json.JSONUtil;
import com.github.litemall.common.entity.item.CabItemCategory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CabItemCategoryRepositoryTests {

    @Autowired
    CabItemCategoryRepository categoryRepository;

    @Test
    @Order(1)
    void insertTest() {
        CabItemCategory category = new CabItemCategory();
        category.setPid("root");
        category.setName("");
        category.setIcon("");

        categoryRepository.save(category);
        System.out.println(JSONUtil.toJsonStr(category));
    }

    @Test
    @Order(2)
    void updateTest() {
        CabItemCategory category = new CabItemCategory();
        category.setId("1602671220176912384");
        category.setPid("测试");
        category.setName("测试");
        category.setIcon("测试");

        categoryRepository.saveAndFlush(category);
        System.out.println(JSONUtil.toJsonStr(category));
    }

    @Test
    @Order(3)
    void deleteTest() {
        categoryRepository.deleteById("1602667263220154368");
    }

}