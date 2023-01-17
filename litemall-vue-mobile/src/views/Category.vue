<template>
  <div class="app-category">
    <!--导航栏-->
    <van-nav-bar title="分类" fixed placeholder safe-area-inset-top>
      <template #right>
        <van-icon name="https://cdn.cnbj1.fds.api.mi-img.com/mijia-m/production/yrn-buz-shop-center/res/images/icons/icon_search_darkblack2.png" size="30"/>
      </template>
    </van-nav-bar>
    <div class="van-sidebar__wrapper">
      <!--侧边导航-->
      <van-sidebar>
        <van-sidebar-item v-for="item in categoryList" :key="item.id" :title="item.name"/>
      </van-sidebar>
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
import { getCategoryList } from '@/apis/Category'

export default {
  name: 'ItemCategory',
  data() {
    return {
      categoryList: []
    }
  },
  created() {
    this.getCategoryList()
  },
  methods: {
    getCategoryList() {
      getCategoryList([{}, {}]).then(resp => {
        this.categoryList = resp.data
      })
    }
  }
}
</script>

<style lang="scss">
.app-category {

}
</style>