<template>
  <div class="cab-message-chat">
    <nut-navbar title="湾仔空悠悠" :fixed="true" :placeholder="true" :safe-area-inset-top="true" @on-click-back="$router.back()">
      <template v-slot:left>
        <nut-image src="https://lanhu.oss-cn-beijing.aliyuncs.com/psxvry78srg2j1qhbno8qkbl1s28swb7wr4dd10284-f608-4a8e-adc0-4054ed5ef35c" height="16"></nut-image>
      </template>
    </nut-navbar>
    <div id="scroll" class="nut-list">
      <!-- Left -->
      <div class="nut-list-item other">
        <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/psafbn4y89uen290hz8b1qj5swb2rk58vp867a5003-062a-4deb-8d1e-53a94fad53f8" width="40"></nut-avatar>
        <div>
          <div class="chat-left_triangle"></div>
          <span> 苹果增加三款配件的颜色选项</span>
        </div>
      </div>
      <!-- Right -->
      <div class="chat-receiver">
        <div>
          <nut-avatar url="https://lanhu.oss-cn-beijing.aliyuncs.com/psafbn4y89uen290hz8b1qj5swb2rk58vp867a5003-062a-4deb-8d1e-53a94fad53f8" width="40"></nut-avatar>
        </div>
        <div v-show="false">好人·马克思</div>
        <div>
          <div class="chat-right_triangle"></div>
          <span> 但是如果你正在再发新的APP跨平台项目，我建议你考虑一下Ionic2/Ionic3。 ionic2/Ionic3的架构使得“单一职责原则”得到了体现，组件、页面之间相互独立，有利于内聚和解耦。</span>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Chat'
}
</script>

<style lang="scss">
.cab-message-chat {
  color: #262626;
  font-size: 14px;

  .nut-navbar {
    &__left, &__right {
      padding: 0;
    }

    &__title .title {
      color: #262626;
      font-size: 16px;
    }
  }

  .nut-list {
    padding: 0 16px;
    background: #F8F8F8;
  }



  .other div:nth-of-type(2) {
    margin: 0 50px 2px 50px;
    padding: 0px;
    color: #848484;
    font-size: 70%;
    text-align: left;
  }

  .other div:nth-of-type(1) {
    background-color: #FFFFFF;
    /*float: left;*/
    margin: 0 50px 10px 50px;
    padding: 10px 10px 10px 10px;
    border-radius: 7px;
    text-indent: -12px;
  }

}


.chat-receiver {
  clear: both;
  font-size: 80%;
}

.chat-receiver div:nth-of-type(1) {
  float: right;
}

.chat-receiver div:nth-of-type(2) {
  margin: 0px 50px 2px 50px;
  padding: 0px;
  color: #848484;
  font-size: 70%;
  text-align: right;
}

.chat-receiver div:nth-of-type(3) {
  /*float:right;*/
  background-color: #66CFFF;
  margin: 0px 50px 10px 50px;
  padding: 10px 10px 10px 10px;
  border-radius: 7px;
}

.chat-receiver div:first-child img,
.other div:first-child img {
  width: 40px;
  height: 40px;
  /*border-radius: 10%;*/
}

.chat-left_triangle {
  height: 0px;
  width: 0px;
  border-width: 6px;
  border-style: solid;
  border-color: transparent white transparent transparent;
  position: relative;
  left: -22px;
  top: 3px;
}

.chat-right_triangle {
  height: 0px;
  width: 0px;
  border-width: 6px;
  border-style: solid;
  border-color: transparent transparent transparent #b2e281;
  position: relative;
  right: -22px;
  top: 3px;
}

.chat-notice {
  clear: both;
  font-size: 70%;
  color: white;
  text-align: center;
  margin-top: 15px;
  margin-bottom: 15px;
}

.chat-notice span {
  background-color: #cecece;
  line-height: 25px;
  border-radius: 5px;
  padding: 5px 10px;
}
</style>