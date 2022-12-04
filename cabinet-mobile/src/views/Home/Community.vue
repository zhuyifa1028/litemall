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

<style scoped>

</style>