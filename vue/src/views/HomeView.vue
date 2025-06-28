
<template>
  <div class="customer-container">
    <h2>客户信息管理</h2>

    <!-- 查询条件 -->
    <el-form :model="searchForm" inline>
      <el-form-item label="客户名称">
        <el-input v-model="searchForm.name" placeholder="请输入客户名称"/>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="handleSearch">查询</el-button>
        <el-button @click="handleAdd">新增</el-button>
      </el-form-item>
    </el-form>

    <!-- 客户列表 -->
    <el-table :data="customerList" border style="width: 100%">
      <el-table-column prop="id" label="ID" width="80"/>
      <el-table-column prop="name" label="客户名称" width="180"/>
      <el-table-column prop="phone" label="联系电话"/>
      <el-table-column prop="address" label="联系地址"/>
      <el-table-column label="操作" width="180">
        <template #default="scope">
          <el-button size="small" @click="handleEdit(scope.row)">编辑</el-button>
          <el-button size="small" type="danger" @click="handleDelete(scope.row.id)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <!-- 分页 -->
    <el-pagination
        v-model:current-page="pagination.currentPage"
        v-model:page-size="pagination.pageSize"
        :total="pagination.total"
        @current-change="fetchData"
        layout="total, prev, pager, next"
    />

    <!-- 新增/编辑弹窗 -->
    <el-dialog v-model="dialogVisible" :title="dialogTitle">
      <el-form :model="formData" label-width="100px">
        <el-form-item label="客户名称" required>
          <el-input v-model="formData.name"/>
        </el-form-item>
        <el-form-item label="联系电话">
          <el-input v-model="formData.phone"/>
        </el-form-item>
        <el-form-item label="联系地址">
          <el-input v-model="formData.address" type="textarea"/>
        </el-form-item>
      </el-form>
      <template #footer>
        <el-button @click="dialogVisible = false">取消</el-button>
        <el-button type="primary" @click="handleSubmit">确定</el-button>
      </template>
    </el-dialog>
  </div>
</template>

<script setup>
import { ref, reactive, onMounted } from 'vue'
import { ElMessage, ElMessageBox } from 'element-plus'

// 客户数据
const customerList = ref([])
const formData = reactive({
  id: '',
  name: '',
  phone: '',
  address: ''
})

// 分页
const pagination = reactive({
  currentPage: 1,
  pageSize: 10,
  total: 0
})

// 查询条件
const searchForm = reactive({
  name: ''
})

// 弹窗控制
const dialogVisible = ref(false)
const dialogTitle = ref('新增客户')
const isEdit = ref(false)

// 获取客户列表
const fetchData = async () => {
  // 这里替换为实际API调用
  const params = {
    currentPage: pagination.currentPage,
    pageSize: pagination.pageSize,
    ...searchForm
  }
  // const res = await getCustomerList(params)
  // customerList.value = res.data.records
  // pagination.total = res.data.total

  // 模拟数据
  customerList.value = [
    { id: 1, name: '客户A', phone: '13800138000', address: '北京市朝阳区' },
    { id: 2, name: '客户B', phone: '13900139000', address: '上海市浦东新区' }
  ]
  pagination.total = 2
}

// 查询
const handleSearch = () => {
  pagination.currentPage = 1
  fetchData()
}

// 新增
const handleAdd = () => {
  dialogTitle.value = '新增客户'
  isEdit.value = false
  Object.keys(formData).forEach(key => formData[key] = '')
  dialogVisible.value = true
}

// 编辑
const handleEdit = (row) => {
  dialogTitle.value = '编辑客户'
  isEdit.value = true
  Object.assign(formData, row)
  dialogVisible.value = true
}

// 删除
const handleDelete = (id) => {
  ElMessageBox.confirm('确定删除该客户吗?', '提示', {
    confirmButtonText: '确定',
    cancelButtonText: '取消',
    type: 'warning'
  }).then(async () => {
    // await deleteCustomer(id)
    ElMessage.success('删除成功')
    fetchData()
  }).catch(() => {})
}

// 提交表单
const handleSubmit = async () => {
  // if (isEdit.value) {
  //   await updateCustomer(formData)
  // } else {
  //   await addCustomer(formData)
  // }
  ElMessage.success(isEdit.value ? '修改成功' : '新增成功')
  dialogVisible.value = false
  fetchData()
}

onMounted(() => {
  fetchData()
})
</script>

<style scoped>
.customer-container {
  padding: 20px;
}
</style>
