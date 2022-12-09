import { createApp } from 'vue'
import App from './App.vue'

// 有赞 Vue 组件库
import vant from 'vant'

// 官方状态管理库
import store from './store'
// 官方 SPA 路由库
import router from './router'

const app = createApp(App)
app.use(vant)
app.use(store)
app.use(router)
// 指定挂载的 DOM 元素
app.mount('body')
