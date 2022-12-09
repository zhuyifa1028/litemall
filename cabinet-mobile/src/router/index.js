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
    },
    {
        path: '/start-chatting',
        name: 'startChatting',
        component: () => import('@/views/Message/StartChatting')
    },
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router
