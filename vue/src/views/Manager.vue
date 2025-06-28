<template>
  <div>
    <div style="height: 60px; background-color: #3c7fff; display: flex; align-items: center">
      <div style="width: 200px; display: flex; align-items: center; padding-left: 15px">
        <img style="width: 40px" src="@/assets/logo.png" alt="">
        <span style="font-size: 22px; color: white; margin-left: 5px">后台管理系统</span>
      </div>
      <div style="flex: 1"></div>
      <div style="width: fit-content; display: flex; align-items: center; padding-right: 10px">
        <img src="https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png" alt="" style="width: 40px; height: 40px">
        <span style="color:white; margin-left: 5px"> =< /span>
      </div>
    </div>


    <div style="display: flex">
     <div style="width: 200px; border-right: 1px solid #ddd; min-height: calc(100vh - 60px)">
     <el-menu router :default-active="router.currentRoute.value.path" :default-openeds="['1']" style="border: 0">
     <el-menu-item index="/manager/home">
     <el-icon><House /></el-icon>


</div>

  </div>
</template>

<script setup>
import {reactive} from "vue";

const data =reactive({



})

</script>