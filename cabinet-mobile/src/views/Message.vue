<template>
  <div class="message">
    <van-nav-bar title="消息" fixed placeholder safe-area-inset-top @click-right="$router.push('/start-chatting')">
      <template #right>
        <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psjm3q50bnhyd0cpp7mvmt9jcos8r045wo2817a3a6-5b9d-4bac-a476-2d3c2d37705c" size="18"/>
      </template>
    </van-nav-bar>

    <van-grid :column-num="3" icon-size="40" :border="false">
      <van-grid-item icon="https://lanhu.oss-cn-beijing.aliyuncs.com/ps7gus6otxup9av8ox6a4xts5bpzx2s6op81f93216e-8375-4a03-b86c-664ffdb31ec7" text="赞和收藏"/>
      <van-grid-item icon="https://lanhu.oss-cn-beijing.aliyuncs.com/ps1ns8h1dioau195g24fzof8h3k6tecp6ct82e5c94d2-0680-4408-9a95-a48bba3e0f65" text="评论与@"/>
      <van-grid-item icon="https://lanhu.oss-cn-beijing.aliyuncs.com/pscto1ow2lnvrkjjidejpypbh8gr8p1ovb5d8c29f1-b109-49ed-a991-db90895b457b" text="新粉丝"/>
    </van-grid>

    <van-cell-group>
      <van-cell title="系统通知" value="10:58" label="您的好友【兜兜里没糖】发布了新商品..." center>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/ps5d18e26edvdbexesu1zvq6cp1rilvcagja536f37e-9736-4dd2-ac41-a6cc3ecfad8f" size="40"/>
        </template>
      </van-cell>
      <van-cell title="兜兜里没糖" value="19-11-26" label="大佬周末的漫展去吗？" center>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/psf136stqhrpmkkva9yhohg859mmmf6cwq3cb5256a-11d9-46c2-89a7-3cd69f18926d" size="40"/>
        </template>
      </van-cell>
      <van-cell title="幻红之月" value="19-11-24" label="你今天发布的贞德模型是什么时候买的？" center>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/pslk3gaw6pbvkiccjk3imxbfgkww9v2w4023c116c-6ca1-4356-9a05-6335d3afaffb" size="40"/>
        </template>
      </van-cell>
      <van-cell title="口蘑" value="19-10-29" label="喷枪借我用用呗？" center>
        <template #icon>
          <van-icon name="https://lanhu.oss-cn-beijing.aliyuncs.com/ps3fz697xerz3u66240lso5pol0dtuplds35661d94-4add-4f74-b56b-791e93f9fb39" size="40"/>
        </template>
      </van-cell>
    </van-cell-group>

    <van-tabbar route>
      <van-tabbar-item replace to="/" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/psejxmkylclgohre0bs45l4hj2fy47tyot509e5d1f-2017-405e-933f-df8688ab148b">社群</van-tabbar-item>
      <van-tabbar-item replace to="/message" icon="https://lanhu.oss-cn-beijing.aliyuncs.com/pster7yj9paocz2igovpfz9cluiyvfmefq2606f0af-5cb5-41d9-9b88-f852e8363cd4">消息</van-tabbar-item>
    </van-tabbar>
  </div>
</template>

<script>

export default {
  name: 'Message',
  components: {}
}
</script>

<style lang="scss">
.message {
  .van-cell__title {
    text-align: left;
    padding-left: 12px;
  }

  .van-cell__value {
    flex: none;
    width: 72px;
  }
}
</style>