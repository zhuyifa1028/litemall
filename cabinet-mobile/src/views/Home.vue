<template>
  <div class="cab-home">
    <nut-navbar :fixed="true" :safe-area-inset-top="true">
      <template v-slot:content>
        <nut-tabs v-model="tabsValue" title-gutter="20">
          <nut-tabpane title="社区"></nut-tabpane>
          <nut-tabpane title="发现"></nut-tabpane>
          <nut-tabpane title="部落"></nut-tabpane>
        </nut-tabs>
      </template>
    </nut-navbar>
    <Community v-show="tabsValue === '0'"></Community>
  </div>
</template>

<script>
// @ is an alias to /src
import Community from '@/views/Home/Community.vue'

export default {
  name: 'Home',
  components: {
    Community
  },
  data() {
    return {
      tabsValue: '0'
    }
  }
}
</script>
