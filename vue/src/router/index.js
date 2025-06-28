import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {path: '/manager',component: () => import('../views/Manager.vue'),children:[




        ]},
    {path: '/home',meta: {title:'主页'},component: () => import('../views/HomeView.vue')},
    {path: '/login',meta: {title:'登录界面'},component: () => import('../views/Login.vue')},
    {path: '/register',meta: {title:'注册界面'},component: () => import('../views/Register.vue')},
  ],
})

export default router
