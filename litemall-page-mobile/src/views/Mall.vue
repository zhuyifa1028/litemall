<template>
  <div class="mall">
    <van-nav-bar fixed placeholder safe-area-inset-top>
      <template #left>
        <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psvnwp3h5gbb77l8kj2hah8dzvslhiy9yh6e55c6b5-6e9d-44df-827d-ffdf8cf86ae5" size="45"/>
      </template>
      <template #title>
        <van-search
            v-model="value"
            shape="round"
            placeholder="输入搜索关键词"
            left-icon="https://lanhu.oss-cn-beijing.aliyuncs.com/pskl15e0jay4qktmxvk2ptkgl3gvsaoqob7251bc1-04e7-4b07-bfeb-03b0b72991b7"
        />
      </template>
    </van-nav-bar>

    <!--轮播图-->
    <van-swipe :autoplay="3000" lazy-render indicator-color="#FFAC1C">
      <van-swipe-item>
        <van-image fit="cover" src="https://lanhu.oss-cn-beijing.aliyuncs.com/ps773lx3x0jeort2x4vnlgz34guruef6sbb1ad1c5a-08d5-413e-ae24-dc165e6b2767" width="343" height="162"/>
      </van-swipe-item>
      <van-swipe-item>
        <van-image fit="cover" src="https://fastly.jsdelivr.net/npm/@vant/assets/apple-1.jpeg" width="343" height="162"/>
      </van-swipe-item>
      <van-swipe-item>
        <van-image fit="cover" src="https://fastly.jsdelivr.net/npm/@vant/assets/apple-2.jpeg" width="343" height="162"/>
      </van-swipe-item>
      <van-swipe-item>
        <van-image fit="cover" src="https://fastly.jsdelivr.net/npm/@vant/assets/apple-3.jpeg" width="343" height="162"/>
      </van-swipe-item>
      <van-swipe-item>
        <van-image fit="cover" src="https://fastly.jsdelivr.net/npm/@vant/assets/apple-4.jpeg" width="343" height="162"/>
      </van-swipe-item>
    </van-swipe>

    <!--菜单栏-->
    <van-grid :column-num="5" icon-size="36" :border="false">
      <van-grid-item text="全部分类" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/pspibmsg7wzsdubq9eytnqs9u8vsskomnxd4e4114e5-deff-4145-a196-f88f60075f1b" to="/item_category"/>
      <van-grid-item icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psjmjgktgvulmzjn2lwhxh3r86rgx9j6cbd040bf7f-65ce-4b08-9b45-ec0c3472b21d" text="拍卖"/>
      <van-grid-item icon="https://lanhu.oss-cn-beijing.aliyuncs.com/ps0gb9ssm3kshut92gvrfxaritqj281s26pm64c1e2f7-c1d7-471a-9acb-15a1e5341d36" text="官方优选"/>
      <van-grid-item icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psjup6099lg6d3xq0eww7e7t05cxiw478f1c994c2-fc02-4e51-86d7-fcc158475443" text="拼购"/>
      <van-grid-item icon="https://lanhu.oss-cn-beijing.aliyuncs.com/pso4adp7nxwzkn93trrak5ecpq65gispecd356cf-e764-475c-95dd-24efede7a619" text="预购"/>
    </van-grid>

    <div class="flash-sale">
      <div class="flash-sale__title">
        <span>限时</span>
        <span class="desc">抢购</span>
        <van-count-down :time="time" format="HH:mm:ss">
          <template #default="timeData">
            <span class="block">{{ timeData.hours + timeData.days * 24 }}</span>
            <span class="colon">:</span>
            <span class="block">{{ timeData.minutes }}</span>
            <span class="colon">:</span>
            <span class="block">{{ timeData.seconds }}</span>
          </template>
        </van-count-down>
      </div>
      <van-grid :gutter="10">
        <van-grid-item icon="photo-o" text="文字"/>
        <van-grid-item icon="photo-o" text="文字"/>
        <van-grid-item icon="photo-o" text="文字"/>
        <van-grid-item icon="photo-o" text="文字"/>
        <van-grid-item icon="photo-o" text="文字"/>
      </van-grid>
    </div>

    <van-tabbar active-color="#FFAC1C" route placeholder>
      <van-tabbar-item replace to="/">
        <span>社群</span>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psnv9rt3hmkct6v13d4ppg73z2e8ydksok6412ac42-e850-4c4a-b254-9a3c91b8dd6b" size="29"/>
        </template>
      </van-tabbar-item>
      <van-tabbar-item replace to="/mall">
        <span>商城</span>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/pstto37kbinabmsi8nu2gstc309h4n9vu2b61ffb1e0-8441-42bb-94b5-bc5df8cd2d50" size="31"/>
        </template>
      </van-tabbar-item>
      <van-tabbar-item replace to="/publish">
        <span>发布</span>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/ps9b360kiu8tfuxlmtdcnuly7srfsnwrn7a137eaf-186d-4d1a-b21f-8931d982c0be" size="22"/>
        </template>
      </van-tabbar-item>
      <van-tabbar-item replace to="/message">
        <span>消息</span>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/ps7lu373hs9xhe6wnt0qvm162ykb0uzvk7gd90b38b4-ec2c-42bc-b047-5eb4a88cd247" size="22"/>
        </template>
      </van-tabbar-item>
      <van-tabbar-item replace to="/myself">
        <span>我的</span>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psbuxqe0frzlmz6xgdhn4j3lp62316yue5fd260e101-889e-430e-9020-03919160d739" size="22"/>
        </template>
      </van-tabbar-item>
    </van-tabbar>
  </div>
</template>

<script>
export default {
  name: 'Mall',
  data() {
    return {
      value: '',
      time: (36 * 60 * 60 + 21 * 60 + 40) * 1000
    }
  }
}
</script>

<style lang="scss">
.mall {
  background: #F8F8F8;
  height: 100%;

  .van-nav-bar {
    background: #F8F8F8;

    &__title {
      max-width: 100%;
      flex: 1;
      margin-left: 77px;
      margin-right: 16px;
      font-weight: 400;
    }

    .van-icon {
      color: #c8c9cc;
    }

  }

  .van-search {
    background: #F8F8F8;
    padding: 0;

    &__content {
      background: #FFFFFF;
    }

    &__field {
      height: 29px;
    }
  }

  //轮播图
  .van-swipe {
    padding: 10px 16px;
  }

  //菜单栏
  .van-grid-item {
    &__content {
      background: #F8F8F8;
    }
  }
}

.flash-sale {

  &__title {
    padding-left: 20px;
    margin-bottom: 20px;
    display: flex;
    align-items: center;
    color: #262626;
    font-size: 20px;
    font-weight: normal;

    .desc {
      background: linear-gradient(0deg, #FF5050 0%, #FF4963 0%, #FF8D8D 100%);
      -webkit-background-clip: text;
      -webkit-text-fill-color: transparent;
    }
  }

  .van-count-down {
    display: inline-block;
    margin-left: 12px;

    .colon {
      display: inline-block;
      margin: 0 4px;
      color: #262626;
    }

    .block {
      display: inline-block;
      width: 18px;
      color: #fff;
      font-size: 12px;
      text-align: center;
      line-height: 18px;
      background-color: #262626;
    }
  }
}
</style>