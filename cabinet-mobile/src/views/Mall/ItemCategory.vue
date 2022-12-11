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
        <van-sidebar-item title="军事模型"/>
        <van-sidebar-item title="手办玩具"/>
        <van-sidebar-item title="机甲拼装"/>
        <van-sidebar-item title="GK雕像"/>
        <van-sidebar-item title="游戏模型"/>
        <van-sidebar-item title="工具辅料"/>
        <van-sidebar-item title="火影忍者"/>
        <van-sidebar-item title="海贼王"/>
        <van-sidebar-item title="龙珠"/>
        <van-sidebar-item title="五星物语"/>
        <van-sidebar-item title="其他拼装"/>
      </van-sidebar>
      <div role="tablist" class="van-sidebar-content">
        <div class="van-grid-group">
          <div class="van-grid-group__title">手办玩具</div>
          <van-grid :column-num="3" :border="false">
            <van-grid-item text="GSC手办" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psk4tuojai8xm8m15l4hejua7f6a8pmlzt4a7c0196d-5de6-4af2-be04-4b821ae76058" to="/item_list"/>
            <van-grid-item text="Phat!" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psewjhr3rt9bhszdgn70105k802std6brc78586833e-99ba-439b-b18a-e76ab8a470a5"/>
            <van-grid-item text="ANIPLEX+" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/ps14htdpjjq3rcp1hg1af8xehequajk9x8vf4e0953f-c720-4d52-b17d-c2901e64e54f"/>
            <van-grid-item text="万代手办" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psp2jfd481beaa0gcwj1kfqglnvbxnej485c1067b-3cee-43cd-a633-3ab67fa87fd6"/>
            <van-grid-item text="ROBOT魂" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/ps9pm3xpgipk7xx9qimmknznkyrdeif9td9861844-43a0-4a08-89dc-14d729d9ce33"/>
            <van-grid-item text="超像可动" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psqylotkyuydaaqkpw6ef088ysvid7m1gyr371335f1-abce-40ed-8454-defe4747f5eb"/>
            <van-grid-item text="变形金刚" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psr9556hdgur8rc9tj04tnatq6snuzhpamb6841485-77c4-4604-aa30-a4b7cd5dbd4c"/>
            <van-grid-item text="Max Factory" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psbek9xrg9f7oik85uvjh7rsc4j671syizjc22337a9-638c-4dce-8f05-39f2670833d4"/>
          </van-grid>
        </div>
        <div class="van-grid-group">
          <div class="van-grid-group__title">机甲拼装</div>
          <van-grid :column-num="3" :border="false">
            <van-grid-item text="超时空要塞" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psltc5kpna1sgcpgqqcj4ryj1nj0z0xe81g568e9040-0110-4670-9f46-2efc88918bcf"/>
            <van-grid-item text="HG机甲" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psfbhbkahiq6ul7qfc19gg0rvo39mfqho7a4ebee8-ecb8-478b-a58a-3ae0f8e8c931"/>
            <van-grid-item text="全金属狂潮" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/pszq13njl92r05fpxxrmdguimfvzzmejd96a722a61-da3c-4941-b673-388609ba4f3b"/>
            <van-grid-item text="万代手办" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psp0kxn4st6jq0qmks5akykjftkwli65e63c8f06-ef20-4629-aafb-8debd003df5c"/>
            <van-grid-item text="ROBOT魂" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psd2sza6gsxs4hnbilsn59ypmb6re3pokdrcfa7756c-b116-4932-ac78-055512e4312a"/>
            <van-grid-item text="超像可动" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psx8tvnhsnf0stbap321wtehbji5n22qmepd00c719c-ce00-4091-8dee-8a04e054bd43"/>
          </van-grid>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'ItemCategory',
  data() {
    return {
      value: '',
      active: 0,
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