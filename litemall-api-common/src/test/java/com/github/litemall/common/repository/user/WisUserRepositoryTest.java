package com.github.litemall.common.repository.user;

import com.github.litemall.common.entity.user.WisUser;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class WisUserRepositoryTest {

    @Resource
    WisUserRepository wisUserRepository;

    static WisUser user = new WisUser();

    @Test
    @Order(1)
    void insertTest() {
        user.setName("");

        wisUserRepository.save(user);
        System.out.println(user);

    }

    @Test
    @Order(2)
    void updateTest() {
        user.setName("测试");

        wisUserRepository.saveAndFlush(user);
        System.out.println(user);
    }

    @Test
    @Order(3)
    void deleteTest() {
        wisUserRepository.delete(user);
    }

}