<template>
  <div class="item-detail">
    <!--导航栏-->
    <van-nav-bar :border="false" fixed safe-area-inset-top @click-left="$router.back()">
      <template #left>
        <div class="van-icon-wrapper">
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psxfc4bkd95aqma7cfvluxigsd3rojs14fe6517f-815c-4813-a03c-0930d565e8e9" size="16"/>
        </div>
      </template>
      <template #right>
        <div class="van-icon-wrapper">
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psucipjsi28yshmx4iwtsodlic5rxm4wld6d7eb0b-0295-4d13-978f-8beee7e4fb91" size="18"/>
        </div>
      </template>
    </van-nav-bar>
    <!--轮播图-->
    <van-swipe :autoplay="3000" lazy-render indicator-color="#FFAC1C">
      <van-swipe-item>
        <van-image fit="cover" src="https://lanhu.oss-cn-beijing.aliyuncs.com/psz8o4nhazawub1570n9rtsg939bf7662a2534f68-446c-4fa5-a96d-5c1835a8138d" width="375" height="375"/>
      </van-swipe-item>
      <van-swipe-item>
        <van-image fit="cover" src="https://fastly.jsdelivr.net/npm/@vant/assets/apple-1.jpeg" width="375" height="375"/>
      </van-swipe-item>
      <van-swipe-item>
        <van-image fit="cover" src="https://fastly.jsdelivr.net/npm/@vant/assets/apple-2.jpeg" width="375" height="375"/>
      </van-swipe-item>
      <van-swipe-item>
        <van-image fit="cover" src="https://fastly.jsdelivr.net/npm/@vant/assets/apple-3.jpeg" width="375" height="375"/>
      </van-swipe-item>
      <van-swipe-item>
        <van-image fit="cover" src="https://fastly.jsdelivr.net/npm/@vant/assets/apple-4.jpeg" width="375" height="375"/>
      </van-swipe-item>
      <template #indicator="{ active, total }">
        <div class="van-swipe-indicator">{{ active + 1 }}/{{ total }}</div>
      </template>
    </van-swipe>
    <!--商品标题-->
    <div class="item-title-wrapper">
      <van-cell-group :border="false">
        <van-cell title="单元格" :border="false">
          <template #title>
            <div class="item-price">
              <span class="item-price__currency">¥</span>
              <span class="item-price__integer">800</span>.<span class="item-price__decimal">00</span>
            </div>
            <div class="item-origin-price">
              <span class="item-origin-price__currency">¥</span>
              <span class="item-origin-price__integer">999</span>.<span class="item-origin-price__decimal">00</span>
            </div>
          </template>
          <template #label>
            <span class="item-purchaser">14人已购买</span>
            <span class="item-inventory">还剩999+件</span>
          </template>
          <template #value>
            <span class="van-text">追溯</span>
            <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psxli9im5ej9je5o57embfm97wwqlkmgop5b9d4321e-8804-4e96-8321-99942823930c" size="12"></van-icon>
          </template>
        </van-cell>
        <van-cell title="崩坏三正品 八重樱旗袍 1/8手办 米哈游官方授权 中 国风樱手办" :border="false">
          <template #label>
            <van-tag color="#FFAC1C">包邮</van-tag>
            <van-tag color="#FFAC1C">可追溯</van-tag>
          </template>
        </van-cell>
      </van-cell-group>
    </div>

  </div>
</template>

<script>
export default {
  name: 'ItemDetail'
}
</script>

<style lang="scss">
.item-detail {
  //导航栏
  .van-nav-bar {
    background: transparent;

    .van-icon-wrapper {
      background-color: rgba(0, 0, 0, 0.500000);
      border-radius: 50%;
      width: 30px;
      height: 30px;

      .van-icon {
        top: 6px;
      }
    }
  }

  //轮播图
  .van-swipe {
    .van-swipe-indicator {
      position: absolute;
      right: 0;
      bottom: 16px;
      padding: 2px 10px;
      font-size: 12px;
      font-weight: 500;
      color: #FFFFFF;
      background: #000000;
      opacity: 0.5;
      border-radius: 8px 0 0 8px;
    }
  }

  //商品标题
  .item-title-wrapper {
    .van-cell__value {
      .van-text {
        position: absolute;
        right: 20px;
        font-size: 13px;
        color: #66B3FF;
      }

      .van-icon {
        position: absolute;
        right: 0;
        top: 6px;
      }
    }

    .item-price {
      display: inline-block;
      color: #FF5040;
      font-weight: 500;

      &__currency, &__decimal {
        font-size: 15px;
      }

      &__integer {
        font-size: 25px;
      }
    }

    .item-origin-price {
      position: relative;
      display: inline-block;
      font-style: italic;
      color: #BFBFBF;

      &__currency, &__decimal {
        font-size: 11px;
      }

      &__integer {
        font-size: 16px;
      }

      &::before {
        position: absolute;
        right: 0;
        top: 50%;
        width: 100%;
        content: '';
        border-bottom: 1px solid #BFBFBF;
      }
    }

    .item-purchaser, .item-inventory {
      font-size: 12px;
      color: #BFBFBF;
    }

    .item-inventory {
      margin-left: 27px;
    }

    .van-tag:nth-child(n+2) {
      margin-left: 8px;
    }
  }
}
</style>