import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {path: '/manager',component: () => import('../views/Manager.vue'),children:[
        {path: 'home',meta: {title:'主页'},component: () => import('../views/HomeView.vue')},
        {path: 'data',meta: {title:'数据展示页面'},component: () => import('../views/Data.vue')},


        ]},
    {path: '/login',meta: {title:'登录界面'},component: () => import('../views/Login.vue')},
    {path: '/register',meta: {title:'注册界面'},component: () => import('../views/Register.vue')},
  ],
})

router.beforeEach((to,from,next) =>{
  document.title = to.meta.title
  next()
})

export default router
