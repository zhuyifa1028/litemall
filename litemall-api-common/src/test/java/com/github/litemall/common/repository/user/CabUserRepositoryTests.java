package com.github.litemall.common.repository.user;

import com.github.litemall.common.entity.user.CabUser;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CabUserRepositoryTests {

    @Autowired
    CabUserRepository repository;

    @Test
    @Order(1)
    void insertTest() {
        CabUser entity = new CabUser();
        entity.setName("张三");

        repository.save(entity);
    }

    @Test
    @Order(2)
    void updateTest() {
        CabUser entity = new CabUser();
        entity.setId("1603389406924931072");
        entity.setName("李四");

        repository.save(entity);
    }

    @Test
    @Order(3)
    void deleteTest() {
        repository.deleteById("1603389268986892288");
    }

}