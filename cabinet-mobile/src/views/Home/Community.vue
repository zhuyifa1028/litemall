<template>
  <div class="cab-home-community">
    <nut-searchbar v-model="searchValue" placeholder="搜索内容或关键字">
      <template v-slot:leftin>
        <nut-icon size="14" name="search2"></nut-icon>
      </template>
      <template v-slot:rightin>
        <nut-icon size="20" name="photograph"></nut-icon>
      </template>
    </nut-searchbar>
    <nut-grid :border="false">
      <nut-grid-item text="社群" :icon="require('@/assets/Home/Community/community.png')"></nut-grid-item>
      <nut-grid-item text="直播" :icon="require('@/assets/Home/Community/broadcast.png')"></nut-grid-item>
      <nut-grid-item text="拍卖" :icon="require('@/assets/Home/Community/auction.png')"></nut-grid-item>
      <nut-grid-item text="藏品柜" :icon="require('@/assets/Home/Community/collection.png')"></nut-grid-item>
    </nut-grid>
    <nut-grid :column-num="2" :center="false">
      <nut-grid-item>
        <nut-cell-group>
          <nut-cell>
            <nut-image src="https://lanhu.oss-cn-beijing.aliyuncs.com/psicetzznyoyms1o11uoukcsvuiqtz6z0783de658dd-6674-4200-9bc6-f1c15a579c0b" height="170"></nut-image>
          </nut-cell>
          <nut-cell>
            <span>鬼灭之刃 动漫手办 炭治 郎 伊之助 祢豆子</span>
          </nut-cell>
          <nut-cell title="Arthur" desc="1203浏览">
            <template v-slot:icon>
              <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/psetx3mifeulah7lug38hqgbotu79zrevcse90522b5-fa55-4366-838f-308f04a781e4" size="24"></nut-avatar>
            </template>
          </nut-cell>
        </nut-cell-group>
      </nut-grid-item>
      <nut-grid-item>
        <nut-cell-group>
          <nut-cell>
            <nut-image src="https://lanhu.oss-cn-beijing.aliyuncs.com/psd5lbyiwo8cdrsa2gqqrqp1kvkqu82z5a5dfdb8-9bd9-427f-9046-056fd1dab269" height="170"></nut-image>
          </nut-cell>
          <nut-cell>
            <span>万代1/144 HG 高达模型</span>
          </nut-cell>
          <nut-cell title="游城十代" desc="1.2w浏览">
            <template v-slot:icon>
              <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/psetx3mifeulah7lug38hqgbotu79zrevcse90522b5-fa55-4366-838f-308f04a781e4" size="24"></nut-avatar>
            </template>
          </nut-cell>
        </nut-cell-group>
      </nut-grid-item>
      <nut-grid-item>
        <nut-cell-group>
          <nut-cell>
            <nut-image src="https://lanhu.oss-cn-beijing.aliyuncs.com/ps7vfo8s4y6qrx2pk1lnog1a7ijiub8g2bx9bf0131e-e133-4d3c-81b4-c96866137b17" height="170"></nut-image>
          </nut-cell>
          <nut-cell>
            <span>SE Play Arts改漫威宇宙 雷神托尔可动手办模型</span>
          </nut-cell>
          <nut-cell title="Arthur" desc="157浏览">
            <template v-slot:icon>
              <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/psetx3mifeulah7lug38hqgbotu79zrevcse90522b5-fa55-4366-838f-308f04a781e4" size="24"></nut-avatar>
            </template>
          </nut-cell>
        </nut-cell-group>
      </nut-grid-item>
      <nut-grid-item>
        <nut-cell-group>
          <nut-cell>
            <nut-image src="https://lanhu.oss-cn-beijing.aliyuncs.com/psqxw78r1iu0nwebzt4aj2c6migc0a6653917d076f-817d-486e-be80-f0ea30cd271d" height="170"></nut-image>
          </nut-cell>
          <nut-cell>
            <span>万代模型 PG 1/60 零式</span>
          </nut-cell>
          <nut-cell title="Arthur" desc="1203浏览">
            <template v-slot:icon>
              <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/psetx3mifeulah7lug38hqgbotu79zrevcse90522b5-fa55-4366-838f-308f04a781e4" size="24"></nut-avatar>
            </template>
          </nut-cell>
        </nut-cell-group>
      </nut-grid-item>
    </nut-grid>

    <nut-sticky bottom="72" position="bottom">
      <nut-image src="https://lanhu.oss-cn-beijing.aliyuncs.com/psm3asrdzcnn5ry6pyuij8nabthwag48te20e61086-5c07-4991-a52b-95bf4d5863e3" width="48"></nut-image>
    </nut-sticky>
  </div>
</template>

<script>

export default {
  name: 'Community',
  data() {
    return {
      searchValue: ''
    }
  }
}
</script>

<style lang="scss">
.cab-home-community {

  .nut-grid-item {
    &__content {
      background: #F8F8F8;
    }
  }

  .nut-cell {
    padding: 5px;

    &__title {
      margin-left: 5px;
    }

    &__value {
      font-size: 12px;
    }
  }
}
</style>