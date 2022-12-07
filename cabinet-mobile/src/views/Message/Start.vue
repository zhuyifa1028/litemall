<template>
  <div class="cab-message-start">
    <nut-navbar title="开始聊天" :fixed="true" :safe-area-inset-top="true" @on-click-back="$router.back()">
      <template v-slot:left>
        <nut-image src="https://lanhu.oss-cn-beijing.aliyuncs.com/psxvry78srg2j1qhbno8qkbl1s28swb7wr4dd10284-f608-4a8e-adc0-4054ed5ef35c" height="16"></nut-image>
      </template>
    </nut-navbar>
    <nut-searchbar v-model="searchValue" placeholder="搜索内容或关键字">
      <template v-slot:leftin>
        <nut-icon size="16" name="https://lanhu.oss-cn-beijing.aliyuncs.com/pskl15e0jay4qktmxvk2ptkgl3gvsaoqob7251bc1-04e7-4b07-bfeb-03b0b72991b7"></nut-icon>
      </template>
    </nut-searchbar>
    <nut-cell-group>
      <nut-cell title="兜兜里没糖" sub-title="12件藏品">
        <template v-slot:icon>
          <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/psee8ek537blve12dkoa8dgwyz9pg4csub76ac418-8a85-40bb-a9ea-167f972d47f0" width="40"></nut-avatar>
        </template>
      </nut-cell>
      <nut-cell title="幻红之月" sub-title="36件藏品">
        <template v-slot:icon>
          <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/pslk3gaw6pbvkiccjk3imxbfgkww9v2w4023c116c-6ca1-4356-9a05-6335d3afaffb" width="40"></nut-avatar>
        </template>
      </nut-cell>
      <nut-cell title="口蘑" sub-title="61件藏品">
        <template v-slot:icon>
          <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/ps3fz697xerz3u66240lso5pol0dtuplds35661d94-4add-4f74-b56b-791e93f9fb39" width="40"></nut-avatar>
        </template>
      </nut-cell>
      <nut-cell title="拉姆和蕾姆" sub-title="3件藏品">
        <template v-slot:icon>
          <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/psndpnq9ql4ymn0t0pnjty2qty0zcgwc3dm6bfe8581-693d-4630-8a4d-86dedeb78b8d" width="40"></nut-avatar>
        </template>
      </nut-cell>
    </nut-cell-group>
  </div>
</template>

<script>
export default {
  name: 'Start',
  data() {
    return {
      searchValue: ''
    }
  }
}
</script>

<style lang="scss">
.cab-message-start {

  .nut-navbar {

    &__title .title {
      color: #262626;
      font-size: 16px;
    }
  }

  .nut-cell {

    &__title {
      margin-left: 10px;
      color: #262626;

      &-desc {
        color: #bfbfbf;
      }
    }

  }
}
</style>