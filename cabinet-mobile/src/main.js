import {createApp} from 'vue'
import App from '@/App.vue'

// 官方状态管理库
import store from '@/store'
// 官方 SPA 路由库
import router from '@/router'

// 注意：这种方式将会导入所有组件
import NutUI from '@nutui/nutui'
// 采用按需加载时  此全局css样式，需要删除
import '@nutui/nutui/dist/style.css'

createApp(App)
    .use(store)
    .use(router)
    .use(NutUI)
    .mount('#app')
