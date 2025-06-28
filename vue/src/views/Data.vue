<template>
  <div>
    <div class="card" style="margin-bottom: 5px">
        <el-input style="width: 240px;margin-right: 10px" v-model="data.name" placeholder="请输入名称查询"  :prefix-icon="Search"><Search /></el-input>
        <el-button type="primary">查询</el-button>
        <el-button type="warning">重置</el-button>
    </div>
    <div class="card" style="margin-bottom: 5px">
      <el-button type="primary">新增</el-button>
      <el-button type="warning">批量删除</el-button>
    </div>
    <div class="card" style="margin-bottom: 5px">
       <el-table :data="data.tableData" stripe>
          <el-table-column lable="名称" prop="name"/>
       </el-table>
      <div style="margin-top: 10px">
        <el-pagination
          v-model:current-page="data.pageNum"
          v-model:page-size="data.pageSize"
          :page-sizes="[5,10,15,20]"
          background
          layout="total,sizes,prev,pager,next,jumper"
          :total="data.total"
        />
      </div>
    </div>
  </div>

</template>



<script setup>
import {reactive} from "vue";
import { Search } from "@element-plus/icons-vue"

const data =reactive({
  name: null,
  tableData:[
    { id:1,name: '熊大',},
  ],
  pageNum:1,
  pageSize: 10,
  total: 47
})



</script>

<style scoped>

</style>