<template>
  <div class="lite-category">
    <!--导航栏-->
    <van-nav-bar title="分类" fixed placeholder safe-area-inset-top>
      <template #right>
        <van-icon name="https://cdn.cnbj1.fds.api.mi-img.com/mijia-m/production/yrn-buz-shop-center/res/images/icons/icon_search_darkblack2.png" size="30"/>
      </template>
    </van-nav-bar>
    <div class="van-sidebar__wrapper">
      <!--侧边导航-->
      <van-sidebar v-model="sidebarActive" @change="onSidebarChange">
        <van-sidebar-item v-for="item in categoryList" :key="item.id" :title="item.name"/>
      </van-sidebar>
      <div class="van-sidebar__content" role="tablist">
        <van-swipe :autoplay="3000" lazy-render>
          <van-swipe-item v-for="item in categoryDetail.bannerList" :key="item.banner">
            <img :src="item.banner" alt="" style="width: 100%"/>
          </van-swipe-item>
        </van-swipe>
        <div v-for="item in categoryDetail.children" :key="item.id" style="border-radius: 8px">
          <van-grid :border="false" :column-num="3">
            <van-grid-item v-for="item2 in item.children" :key="item2.id" :icon="item2.smallImgCard.img" :text="item2.smallImgCard.name">
              <template #icon>
                <van-image :src="item2.smallImgCard.img" height="66" width="66"/>
              </template>
            </van-grid-item>
          </van-grid>
        </div>
      </div>
    </div>
    <!--标签栏-->
    <van-tabbar active-color="#E1B659" route placeholder safe-area-inset-bottom>
      <van-tabbar-item icon="wap-home" to="/main">首页</van-tabbar-item>
      <van-tabbar-item icon="cluster" to="/category">分类</van-tabbar-item>
      <van-tabbar-item icon="shopping-cart" to="/cart">购物车</van-tabbar-item>
      <van-tabbar-item icon="manager" to="/user">我的</van-tabbar-item>
    </van-tabbar>
  </div>
</template>

<script>
import { getCategoryDetail, getCategoryList } from '@/apis/Category'

export default {
  name: 'ItemCategory',
  data() {
    return {
      sidebarActive: 0,
      categoryList: [],
      categoryDetail: {}
    }
  },
  created() {
    this.doGetCategoryList()
  },
  methods: {
    doGetCategoryList() {
      getCategoryList([{}, {}]).then(resp => {
        this.categoryList = resp.data
        this.onSidebarChange(this.sidebarActive)
      })
    },
    onSidebarChange(index) {
      let data = []
      data.push({})
      data.push({
        catId: this.categoryList[index].id
      })
      getCategoryDetail(data).then(resp => {
        this.categoryDetail = resp.data
      })
    }
  }
}
</script>

<style lang="scss">
.lite-category {

  .van-sidebar {
    width: 94px;

    &__wrapper {
      display: flex;
    }

    &__content {
      flex: 1;
      padding: 10px;
      background-color: #f6f6f6;

      .van-swipe {
        width: 262px;
        height: 76px;
        border-radius: 8px;
      }
    }

    &-item {
      padding: 13px 10px;
      background-color: #ffffff;

      &__text {
        width: 100%;
        line-height: 24px;
        text-align: center;
        color: #777777;
        font-size: 14px;
        font-weight: normal;
      }

      &--select {

        &::before {
          display: none;
        }

        .van-sidebar-item__text {
          color: #ffffff;
          background: linear-gradient(to right, #e6aa5c, #d08b30);
          border-radius: 12px;
        }
      }

    }
  }

}
</style>