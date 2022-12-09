<template>
  <div class="chatting">
    <van-nav-bar title="湾仔空悠悠" fixed placeholder safe-area-inset-top @click-left="$router.back()">
      <template #left>
        <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psxvry78srg2j1qhbno8qkbl1s28swb7wr4dd10284-f608-4a8e-adc0-4054ed5ef35c" size="16"/>
      </template>
    </van-nav-bar>

    <van-cell-group :border="false">
      <van-cell class="other" title="兜兜里没糖兜兜里没糖兜兜里没糖兜兜里没糖兜兜里没糖兜兜里没糖" :border="false">
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psf136stqhrpmkkva9yhohg859mmmf6cwq3cb5256a-11d9-46c2-89a7-3cd69f18926d" size="40"/>
        </template>
      </van-cell>
      <van-cell class="self" value="兜兜里没糖兜兜里没糖兜兜里没糖兜兜,里没糖兜兜里没糖兜兜里没糖" :border="false">
        <template #right-icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/pslk3gaw6pbvkiccjk3imxbfgkww9v2w4023c116c-6ca1-4356-9a05-6335d3afaffb" size="40"/>
        </template>
      </van-cell>
      <van-cell class="other" title="口蘑" :border="false">
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/ps3fz697xerz3u66240lso5pol0dtuplds35661d94-4add-4f74-b56b-791e93f9fb39" size="40"/>
        </template>
      </van-cell>
      <van-cell class="self" value="口蘑" :border="false">
        <template #right-icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psndpnq9ql4ymn0t0pnjty2qty0zcgwc3dm6bfe8581-693d-4630-8a4d-86dedeb78b8d" size="40"/>
        </template>
      </van-cell>
    </van-cell-group>

    <van-action-bar>
      <van-field
          v-model="message"
          rows="1"
          autosize
          type="textarea"
          placeholder="请输入留言"
      />
      <van-action-bar-icon icon="shop-o" text="店铺"/>
      <van-action-bar-button text="发送" color="linear-gradient(135deg, #FFAC1C, #FFD339)"/>
    </van-action-bar>
  </div>
</template>

<script>
export default {
  name: 'Chatting',
  data() {
    return {
      value: '',
      message: ''
    }
  }
}
</script>

<style lang="scss">
.chatting {
  background: #F8F8F8;
  height: 100%;

  .van-cell {
    background: #F8F8F8;

    &__title, &__value {
      span {
        display: inline-block;
        padding: 8px;
        text-align: left;
        border-radius: 5px;
      }
    }
  }

  .other {
    padding-right: 66px;

    .van-cell__title {
      padding-left: 10px;

      span {
        color: #262626;
        background: #FFFFFF;
      }
    }
  }

  .self {
    padding-left: 66px;

    .van-cell__value {
      padding-right: 10px;

      span {
        color: #FEFEFE;
        background: #66CFFF;
      }
    }
  }
}
</style>