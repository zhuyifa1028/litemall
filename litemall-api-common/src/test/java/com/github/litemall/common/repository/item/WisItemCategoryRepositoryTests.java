package com.github.litemall.common.repository.item;

import cn.hutool.json.JSONUtil;
import com.github.litemall.common.entity.item.WisItemCategory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class WisItemCategoryRepositoryTests {

    @Autowired
    WisItemCategoryRepository categoryRepository;

    static WisItemCategory category = new WisItemCategory();

    @Test
    @Order(0)
    void batchTest() {
        List<WisItemCategory> categoryList = JSONUtil.toList("[{\"name\":\"有品推荐\",\"sort\":10000,\"type\":2},{\"name\":\"日常元素\",\"sort\":10100,\"type\":0},{\"name\":\"小米自营\",\"sort\":10200,\"type\":0},{\"name\":\"手机数码\",\"sort\":10300,\"type\":0},{\"name\":\"小米电视\",\"sort\":10400,\"type\":0},{\"name\":\"电脑办公\",\"sort\":10500,\"type\":0},{\"name\":\"大家电\",\"sort\":10600,\"type\":0},{\"name\":\"小家电\",\"sort\":10700,\"type\":0},{\"name\":\"美食酒饮\",\"sort\":10800,\"type\":0},{\"name\":\"出行车品\",\"sort\":10900,\"type\":0},{\"name\":\"运动户外\",\"sort\":11000,\"type\":0},{\"name\":\"医疗健康\",\"sort\":11100,\"type\":0},{\"name\":\"家具家装\",\"sort\":11200,\"type\":0},{\"name\":\"家纺厨具\",\"sort\":11300,\"type\":0},{\"name\":\"日用百货\",\"sort\":11400,\"type\":0},{\"name\":\"服装配饰\",\"sort\":11500,\"type\":0},{\"name\":\"鞋靴箱包\",\"sort\":11600,\"type\":0},{\"name\":\"手表首饰\",\"sort\":11700,\"type\":0},{\"name\":\"美妆个护\",\"sort\":11800,\"type\":0},{\"name\":\"母婴亲子\",\"sort\":11900,\"type\":0},{\"name\":\"宠物生活\",\"sort\":12000,\"type\":0},{\"name\":\"有品海购\",\"sort\":12100,\"type\":0},{\"name\":\"品牌墙\",\"sort\":12200,\"type\":1}]", WisItemCategory.class);
        categoryRepository.saveAll(categoryList);
    }

    @Test
    @Order(1)
    void insertTest() {
        category.setPid("root");
        category.setName("");
        category.setIcon("");

        categoryRepository.save(category);
        System.out.println(category);

    }

    @Test
    @Order(2)
    void updateTest() {
        category.setPid("测试");
        category.setName("测试");
        category.setIcon("测试");

        categoryRepository.saveAndFlush(category);
        System.out.println(category);
    }

    @Test
    @Order(3)
    void deleteTest() {
        categoryRepository.delete(category);
    }

}