package com.github.litemall.common.repository.item;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.github.litemall.common.entity.item.WisItemCategory;
import lombok.Data;
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

    @Test
    @Order(4)
    void initCategory() {
        categoryRepository.deleteAllInBatch();

        List<Cat> catList = getCatList();

        CollUtil.forEach(catList, (value, index) -> {
            CatDetail detail = getCatDetail(value.getId());

            WisItemCategory entity = new WisItemCategory();
            entity.setId(value.getId());
            entity.setName(value.getName());
            entity.setSort(value.getSort());
            entity.setType(value.getType());
            categoryRepository.save(entity);

            if (CollUtil.isEmpty(detail.getChildren())) {
                return;
            }

            /* 二级分类
            CollUtil.forEach(detail.getChildren(), (value2, index2) -> {

                WisItemCategory entity2 = new WisItemCategory();
                entity2.setName(value2.getName());
                entity2.setPid(entity.getId());
                entity2.setSort(entity.getSort() + 1000 * (index2 + 1));
                categoryRepository.save(entity2);

                if (CollUtil.isEmpty(value2.getChildren())) {
                    return;
                }

                // 三级分类
                CollUtil.forEach(value2.getChildren(), (value3, index3) -> {

                    CatCard card = value3.getSmallImgCard();
                    if (ObjectUtil.isNull(card)) {
                        return;
                    }

                    WisItemCategory entity3 = new WisItemCategory();
                    entity3.setImg(card.getImg());
                    entity3.setName(card.getName());
                    entity3.setPid(entity2.getId());
                    entity3.setSort(entity2.getSort() + (index3 + 1));
                    categoryRepository.save(entity3);
                });
            });
             */
        });
    }

    List<Cat> getCatList() {
        String post = HttpUtil.post("https://m.xiaomiyoupin.com/mtop/market/cat/list", "[{},{}]");

        //noinspection VulnerableCodeUsages
        JSONObject parseObj = JSONUtil.parseObj(post);

        return parseObj.getBeanList("data", Cat.class);
    }

    CatDetail getCatDetail(String catId) {
        String post = HttpUtil.post("https://m.xiaomiyoupin.com/mtop/market/cat/detail", "[{},{\"catId\":\"" + catId + "\"}]");

        //noinspection VulnerableCodeUsages
        JSONObject parseObj = JSONUtil.parseObj(post);

        return parseObj.getBean("data", CatDetail.class);
    }

    @Data
    static class Cat {
        private String id;
        private String name;
        private Long sort;
        private Integer type;
    }

    @Data
    static class CatCard {
        private String img;
        private String name;
    }

    @Data
    static class CatDetail {
        private String id;
        private String name;
        private CatCard smallImgCard;
        private List<CatDetail> children;
    }

}