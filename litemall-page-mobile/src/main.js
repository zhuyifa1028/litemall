import { createApp } from 'vue'
import App from './App.vue'

// 有赞 Vue 组件库
import Vant from 'vant'
// 引入组件样式
import 'vant/lib/index.css'

// 官方状态管理库
import store from './store'
// 官方 SPA 路由库
import router from './router'

const app = createApp(App)
app.use(Vant)
app.use(store)
app.use(router)
// 指定挂载的 DOM 元素
app.mount('body')
