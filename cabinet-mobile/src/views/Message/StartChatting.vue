<template>
  <div class="start-chatting">
    <van-nav-bar title="开始聊天" fixed placeholder safe-area-inset-top @click-left="$router.back()">
      <template #left>
        <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psxvry78srg2j1qhbno8qkbl1s28swb7wr4dd10284-f608-4a8e-adc0-4054ed5ef35c" size="16"/>
      </template>
    </van-nav-bar>

    <van-search
        v-model="value"
        shape="round"
        placeholder="搜索内容或关键字"
        left-icon="https://lanhu.oss-cn-beijing.aliyuncs.com/pskl15e0jay4qktmxvk2ptkgl3gvsaoqob7251bc1-04e7-4b07-bfeb-03b0b72991b7"
    />

    <van-cell-group>
      <van-cell title="兜兜里没糖" label="12件藏品" center>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psf136stqhrpmkkva9yhohg859mmmf6cwq3cb5256a-11d9-46c2-89a7-3cd69f18926d" size="40"/>
        </template>
      </van-cell>
      <van-cell title="幻红之月" label="36件藏品" center>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/pslk3gaw6pbvkiccjk3imxbfgkww9v2w4023c116c-6ca1-4356-9a05-6335d3afaffb" size="40"/>
        </template>
      </van-cell>
      <van-cell title="口蘑" label="61件藏品" center>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/ps3fz697xerz3u66240lso5pol0dtuplds35661d94-4add-4f74-b56b-791e93f9fb39" size="40"/>
        </template>
      </van-cell>
      <van-cell title="拉姆和蕾姆" label="3件藏品" center>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psndpnq9ql4ymn0t0pnjty2qty0zcgwc3dm6bfe8581-693d-4630-8a4d-86dedeb78b8d" size="40"/>
        </template>
      </van-cell>
    </van-cell-group>

  </div>
</template>

<script>
export default {
  name: 'StartChatting',
  data() {
    return {
      value: ''
    }
  }
}
</script>

<style lang="scss">
.start-chatting {
  .van-cell__title {
    text-align: left;
    font-size: 15px;
    padding-left: 12px;
  }

}
</style>