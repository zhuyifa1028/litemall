package com.github.litemall.common.repository.item;

import com.github.litemall.common.entity.item.WisItemCategory;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class WisItemCategoryRepositoryTests {

    @Resource
    WisItemCategoryRepository categoryRepository;

    static WisItemCategory category = new WisItemCategory();

    @Test
    @Order(1)
    void insertTest() {
        category.setPid("root");
        category.setName("");

        categoryRepository.save(category);
        System.out.println(category);

    }

    @Test
    @Order(2)
    void updateTest() {
        category.setPid("测试");
        category.setName("测试");

        categoryRepository.saveAndFlush(category);
        System.out.println(category);
    }

    @Test
    @Order(3)
    void deleteTest() {
        categoryRepository.delete(category);
    }

}