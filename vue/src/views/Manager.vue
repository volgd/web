<template>
  <div style="height: 60px;background-color: aqua">

  </div>


  <div style="display: flex">
    <div style="width: 200px;border-right: 1px solid #ddd;min-height: calc(100vh - 60px)">
      <el-menu style="border: 0">
        <el-menu-item>系统首页</el-menu-item>
        <el-menu-item>数据统计</el-menu-item>
      </el-menu>
    </div>

    <div style="flex: 1;width: 0;background-color: white; padding:10px">
      <RouterView />
    </div>

  </div>
</template>

<script setup>
import {reactive} from "vue";

const data =reactive({



})

</script>