package com.example.cabinet.database.repository.user;

import com.example.cabinet.database.entity.user.WisUserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WisUserInfoRepositoryTest {

    @Autowired
    private WisUserInfoRepository wisUserInfoRepository;

    @Test
    void testInsert() {
        WisUserInfo entity = new WisUserInfo(true);
        entity.setName("张三");

        wisUserInfoRepository.save(entity);
    }

}