import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/Home.vue'

const routes = [
    {
        path: '/',
        name: 'home',
        component: HomeView
    },
    {
        path: '/message',
        name: 'message',
        component: () => import('../views/Message')
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router
