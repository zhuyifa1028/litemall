<template>
  <div class="item-list">
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
            placeholder="搜索需要的商品"
            left-icon="https://lanhu.oss-cn-beijing.aliyuncs.com/pskl15e0jay4qktmxvk2ptkgl3gvsaoqob7251bc1-04e7-4b07-bfeb-03b0b72991b7"
        />
      </template>
      <template #right>
        <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psbjazq8tutoeuxiiphj0v1pr9pv68hc8119c6feb-a808-409a-8268-ce5303faf5ee" size="18"/>
      </template>
    </van-nav-bar>

    <!--标签栏-->
    <van-tabs v-model:active="active">
      <van-tab title="热卖"></van-tab>
      <van-tab title="拍卖"></van-tab>
    </van-tabs>

    <!--标签栏-->
    <van-tabs v-model:active="sortActive">
      <van-tab title="综合"></van-tab>
      <van-tab>
        <template #title>
          价格
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/ps5dqqi8pfqj7lgl9klaobg1ic3yrwj6qw36760b1c-a7ad-4116-bc15-351f06bda491" size="8"/>
        </template>
      </van-tab>
      <van-tab>
        <template #title>
          销量
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/ps5dqqi8pfqj7lgl9klaobg1ic3yrwj6qw36760b1c-a7ad-4116-bc15-351f06bda491" size="8"/>
        </template>
      </van-tab>
      <van-tab>
        <template #title>
          信用
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/ps5dqqi8pfqj7lgl9klaobg1ic3yrwj6qw36760b1c-a7ad-4116-bc15-351f06bda491" size="8"/>
        </template>
      </van-tab>
      <van-tab>
        <template #title>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/ps6ss72di61t8td2izmbwftd2jdqkbrbpw6172db63a-f71d-4994-b01b-8e7a85f94640" size="16"/>
        </template>
      </van-tab>
    </van-tabs>
    <!--下拉刷新-->
    <van-pull-refresh v-model="refreshing" @refresh="onRefresh">
      <!--列表-->
      <van-list v-model:loading="loading" :finished="finished" finished-text="没有更多了" @load="onLoad">
        <!--商品-->
        <van-card v-for="item in list" :key="item" :thumb="item.thumb" :title="item.title" :desc="item.desc" :price="item.price" @click="$router.push('/item_detail')" :origin-price="100">
          <template #num>
            <van-icon name="https://lanhu-dds-backend.oss-cn-beijing.aliyuncs.com/merge_image/imgs/9ad9cbc2c0d449cf95674823a28d528f_mergeImage.png" size="26"/>
          </template>
        </van-card>
      </van-list>
    </van-pull-refresh>
  </div>
</template>

<script>
export default {
  name: 'ItemList',
  data() {
    return {
      value: '',
      active: 0,
      sortActive: 0,
      refreshing: false,
      loading: false,
      finished: false,
      list: []
    }
  },
  methods: {
    onRefresh() {
      // 清空列表数据
      this.finished = false;

      // 重新加载数据
      // 将 loading 设置为 true，表示处于加载状态
      this.loading = true;
      this.onLoad();
    },
    onLoad() {
      this.loading = true;

      setTimeout(() => {
        if (this.refreshing) {
          this.list = [];
          this.refreshing = false;
        }

        this.list.push({
          thumb: "https://lanhu.oss-cn-beijing.aliyuncs.com/psaobe4zmd5vcowqvwmd6xiqv2m6qr2hnv9f90f353c-255c-4f7c-a4dd-d28e5289fa96",
          title: "鬼灭之刃 动漫手办 炭治郎 伊之助  祢豆子",
          desc: "52人已购买",
          price: "146.00",
        });

        this.list.push({
          thumb: "https://lanhu.oss-cn-beijing.aliyuncs.com/pszfu9azcchvmo6nd2jqpd4zoqjm3azlmcbb84aa7-281f-4dce-85f2-22bb81daeb53",
          title: "万代1/144 HG 高达模型Zeta高达 Plus",
          desc: "122已购买",
          price: "128.00",
        });

        this.list.push({
          thumb: "https://lanhu.oss-cn-beijing.aliyuncs.com/psdave5bx5fhkhnwh46zwb7gd4nm5fhrnc26225cfa-4baf-427e-a21f-7d10ee6bb9bc",
          title: "SE Play Arts改漫威宇宙 雷神托尔 可动手办模型",
          desc: "14人已购买",
          price: "799.00",
        });

        this.list.push({
          thumb: "https://lanhu.oss-cn-beijing.aliyuncs.com/ps87t7594udoota834i4ixhh1x83q3yv9541aafca-5255-438f-bc9f-9001d237e0a3",
          title: "万代模型 PG 1/60 零式飞翼高达 Gundam/高达",
          desc: "11人已购买",
          price: "1500.00",
        });

        this.loading = false;

        if (this.list.length >= 10) {
          this.finished = true;
        }
      }, 1000);
    }
  }
}
</script>

<style lang="scss">
.item-list {
  height: 100%;
  background: #F8F8F8;

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

  .van-tabs__line {
    background: linear-gradient(135deg, #FFAC1C, #FFD339);
  }

  //下拉刷新
  .van-pull-refresh {
    background: #F8F8F8;

    //列表
    .van-list {
      padding: 0 16px;

      //商品
      .van-card {
        padding: 0;
        margin-top: 10px;
        background: #FFFFFF;
        border-radius: 8px;

        &__thumb {
          margin: 0;
          width: 110px;
          height: 110px;
        }

        &__content {
          padding: 12px;
        }

        &__price {
          color: #FF5040;
        }

        &__num {
          line-height: 0;
        }
      }
    }
  }

}
</style>