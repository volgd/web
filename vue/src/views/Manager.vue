<template>
  <div style="height: 60px;background-color: aqua;display: flex;align-items: center">
    <div style="width: 200px;display: flex;align-items: center;font-size: 20px;color: white">后台管理系统</div>
    <div style="flex: 1"></div>
    <div style="width: 150px;display: flex;align-items: center">
      <img src="" alt="" style="width: 50px;height:40px">
      <span style="color: white;margin-left: 5px ">用户</span>
    </div>
  </div>


  <div style="display: flex">
    <div style="width: 200px;border-right: 1px solid #ddd;min-height: calc(100vh - 60px)">
      <el-menu router :default-active="router.currentRoute.value.path" style="border: 0">
        <el-menu-item index="/manager/home">
          <el-icon> <House /></el-icon>
          系统首页
        </el-menu-item>
        <el-menu-item index="/manager/data">
          <el-icon> <DataAnalysis /></el-icon>
          数据统计
        </el-menu-item>
        <el-sub-menu index="1">
          <template #title>
            <el-icon> <User /></el-icon>
            <span>用户管理</span>
          </template>
          <el-menu-item>管理员信息</el-menu-item>
          <el-menu-item>普通用户信息</el-menu-item>
          </el-sub-menu>
        <el-menu-item index="/login">
          <el-icon> <DataAnalysis /></el-icon>
          退出登录
        </el-menu-item>

      </el-menu>
    </div>

    <div style="flex: 1;width: 0;background-color: white; padding:10px">
      <RouterView />
    </div>

  </div>
</template>

<script setup>
import {reactive} from "vue";
import router from "@/router/index.js";

const data =reactive({



})

</script>