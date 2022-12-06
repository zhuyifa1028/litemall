<template>
  <div class="cab-app">
    <Home v-show="tabbarVisible === 0"></Home>

    <nut-tabbar v-model:visible="tabbarVisible" active-color="#FFD339" unactive-color="#595959"
                :bottom="true" :safeAreaInsetBottom="true">
      <nut-tabbar-item tab-title="首页" icon="home">
        <router-link to="/"></router-link>
      </nut-tabbar-item>
      <nut-tabbar-item tab-title="商城" icon="category"></nut-tabbar-item>
      <nut-tabbar-item tab-title="发布" icon="find"></nut-tabbar-item>
      <nut-tabbar-item tab-title="消息" icon="cart"></nut-tabbar-item>
      <nut-tabbar-item tab-title="我的" icon="my"></nut-tabbar-item>
    </nut-tabbar>
  </div>
</template>

<script>
import Home from '@/views/Home';

export default {
  components: {
    Home
  },
  data() {
    return {
      tabbarVisible: 0
    }
  }
}
</script>

<style lang="scss">
html, body {
  margin: 0;
  height: 100%;
  background: #F8F8F8;
}
</style>
