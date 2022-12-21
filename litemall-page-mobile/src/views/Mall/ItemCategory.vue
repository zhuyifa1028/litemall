<template>
  <div class="item-category">
    <!--导航栏-->
    <van-nav-bar fixed placeholder safe-area-inset-top @click-left="$router.back()">
      <template #left>
        <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psh7ml5qkzo7tsidk36t07jmsjznqmo52agb7effbcd-fd03-441e-b886-b0b1c391664a" size="16"/>
      </template>
      <template #title>
        <!--搜索框-->
        <van-search
            v-model="value"
            shape="round"
            placeholder="输入搜索关键词"
            left-icon="https://lanhu.oss-cn-beijing.aliyuncs.com/pskl15e0jay4qktmxvk2ptkgl3gvsaoqob7251bc1-04e7-4b07-bfeb-03b0b72991b7"
        />
      </template>
      <template #right>
        <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psbjazq8tutoeuxiiphj0v1pr9pv68hc8119c6feb-a808-409a-8268-ce5303faf5ee" size="18"/>
      </template>
    </van-nav-bar>
    <div class="item-category__wrapper">
      <!--侧边导航-->
      <van-sidebar v-model="active">
        <van-sidebar-item v-for="item in categoryList" :key="item.id" :title="item.name"/>
      </van-sidebar>
      <div role="tablist" class="van-sidebar-content">
        <div class="van-grid-group" v-for="item in categoryList" :key="item.id">
          <div class="van-grid-group__title" v-if="item.list">{{ item.name }}</div>
          <van-grid :column-num="3" :border="false" v-if="item.list">
            <van-grid-item v-for="item2 in item.list" :key="item2.id" :text="item2.name" :icon="item2.icon" :to="'/item_list?cid=' + item2.id"/>
          </van-grid>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { getCategoryList } from "@/api/ItemCategory"

export default {
  name: 'ItemCategory',
  data() {
    return {
      value: '',
      active: 0,
      categoryList: []
    }
  },
  created() {
    this.getCategoryList()
  },
  methods: {
    getCategoryList() {
      getCategoryList().then(resp => {
        this.categoryList = resp.data
      })
    }
  }
}
</script>

<style lang="scss">
.item-category {
  //导航栏
  .van-nav-bar {

    &__title {
      width: 100%;
      max-width: 100%;
      margin: 0;
      padding-left: 45px;
      padding-right: 50px;
      font-weight: 400;
    }

    .van-icon {
      color: #c8c9cc;
    }

    //搜索框
    .van-search {
      padding: 0;

      &__field {
        height: 29px;

        .van-field__left-icon {
          margin-right: 6px;
        }
      }
    }
  }

  &__wrapper {
    display: flex;

    //侧边导航
    .van-sidebar-item--select {
      color: #FFAC1C;

      &:before {
        display: none;
      }
    }

    .van-sidebar-content {
      flex: 1;
      padding-top: 16px;
    }

    .van-grid-group__title {
      padding-left: 24px;
      color: #262626;
      font-size: 14px;
      font-weight: 500;
    }

    .van-grid-item__icon {
      font-size: 60px;
    }
  }

}
</style>