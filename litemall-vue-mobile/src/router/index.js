import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/Home.vue'

const routes = [
    {
        path: '/',
        name: 'home',
        component: HomeView
    },
    {
        path: '/mall',
        name: 'mall',
        component: () => import('../views/Mall')
    },
    {
        name: 'category',
        path: '/category',
        component: () => import('../views/Category')
    },
    {
        path: '/item_category',
        name: 'itemCategory',
        component: () => import('../views/Mall/ItemCategory')
    },
    {
        path: '/item_list',
        name: 'itemList',
        component: () => import('../views/Mall/ItemList')
    },
    {
        path: '/item_detail',
        name: 'itemDetail',
        component: () => import('../views/Mall/ItemDetail')
    },
    {
        path: '/message',
        name: 'message',
        component: () => import('../views/Message')
    },
    {
        path: '/chatting',
        name: 'chatting',
        component: () => import('@/views/Message/Chatting')
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
