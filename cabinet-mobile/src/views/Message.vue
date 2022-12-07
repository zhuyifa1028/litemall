<template>
  <div class="cab-message">
    <nut-navbar title="消息" :fixed="true" :safe-area-inset-top="true">
      <template v-slot:right>
        <nut-image src="https://lanhu.oss-cn-beijing.aliyuncs.com/psjm3q50bnhyd0cpp7mvmt9jcos8r045wo2817a3a6-5b9d-4bac-a476-2d3c2d37705c" width="18"></nut-image>
      </template>
    </nut-navbar>
    <nut-grid :column-num="3" :border="false">
      <nut-grid-item text="赞和收藏" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/ps7gus6otxup9av8ox6a4xts5bpzx2s6op81f93216e-8375-4a03-b86c-664ffdb31ec7" icon-size="40"></nut-grid-item>
      <nut-grid-item text="评论与@" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/ps1ns8h1dioau195g24fzof8h3k6tecp6ct82e5c94d2-0680-4408-9a95-a48bba3e0f65" icon-size="40"></nut-grid-item>
      <nut-grid-item text="新粉丝" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/pscto1ow2lnvrkjjidejpypbh8gr8p1ovb5d8c29f1-b109-49ed-a991-db90895b457b" icon-size="40"></nut-grid-item>
    </nut-grid>
    <nut-cell-group>
      <nut-cell class="cab-message-system" title="系统通知" sub-title="您的好友【兜兜里没糖】发布了新商品..." desc="10:58">
        <template v-slot:icon>
          <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/ps5d18e26edvdbexesu1zvq6cp1rilvcagja536f37e-9736-4dd2-ac41-a6cc3ecfad8f" width="40"></nut-avatar>
        </template>
      </nut-cell>
      <nut-cell title="兜兜里没糖" sub-title="大佬周末的漫展去吗？" desc="19-11-26">
        <template v-slot:icon>
          <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/psf136stqhrpmkkva9yhohg859mmmf6cwq3cb5256a-11d9-46c2-89a7-3cd69f18926d" width="40"></nut-avatar>
        </template>
      </nut-cell>
      <nut-cell title="幻红之月" sub-title="你今天发布的贞德模型是什么时候买的？" desc="19-11-24">
        <template v-slot:icon>
          <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/ps2qznfvd42l1p3powir50h9qv5qy4w66t9b60a7c5-7c40-4fe6-b1f4-0b6fe2b6f536" width="40"></nut-avatar>
        </template>
      </nut-cell>
      <nut-cell title="口蘑" sub-title="喷枪借我用用呗？" desc="19-10-29">
        <template v-slot:icon>
          <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/pslez1a2p2y4psg1sxsw6td56s3146y0c7bf8385c8-debc-4864-9d21-831e05806c58" width="40"></nut-avatar>
        </template>
      </nut-cell>
    </nut-cell-group>
  </div>
</template>

<script>

export default {
  name: 'Message',
  components: {},
  data() {
    return {
      tabsValue: '0'
    }
  }
}
</script>

<style lang="scss">
.cab-message {
  padding-bottom: 52px;

  .nut-cell {

    &__title {
      margin-left: 10px;
      color: #262626;

      &-desc {
        color: #bfbfbf;
      }
    }

    &__value {
      font-size: 12px;
    }
  }

  &-system .nut-cell__title {
    color: #994c00;
  }
}
</style>