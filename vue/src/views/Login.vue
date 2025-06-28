<template>
  <div class="login-container">
  <div class="login-box">
    <div style="padding:20px;background-color: white">
      <el-form ref="formRef"  :rules="data.rules" :model="data.form" style="width: 400px">
        <div style="margin-bottom: 30px;font-size: 24px;text-align:center;color: brown;font-weight: bold">欢迎登录eshop</div>
        <el-form-item prop="username">
          <el-input size="large" v-model="data.form.username" placeholder="请输入你的账号"  prefix-icon="User">
          </el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input show-password size="large" v-model="data.form.password" placeholder="请输入你的密码" prefix-icon="Lock">
          </el-input>
        </el-form-item>
        <div>
          <el-button @click ="login" size="large" style="width: 100%" type="primary">登录</el-button>
        </div>
        <div style="text-align: right">还没有账号?请 <a style="color: crimson;text-decoration: crimson" href="/register">注册</a></div>
      </el-form>
    </div>
  </div>
  </div>
</template>

<script setup>
import {reactive,ref} from "vue";
import { User, Lock } from "@element-plus/icons-vue"
import {ElMessage} from "element-plus";
import request from "@/utils/request.js";



const data =reactive({
  form:{},
  rules:{
    username:[{ required:true, message:'请输入账号', trigger:'blur' }],
    password:[{ required:true, message:'请输入密码', trigger:'blur' }]
  }

})
const formRef =ref()

const login =() => {
  formRef.value.validate((valid) => {
    if (valid) {
      request.post('/login', data.form).then(res => {
        if (res.code === '200') {
          ElMessage.success('登录成功')
          location.href ='/home'
        } else {
          ElMessage.error(res.msg)

        }
      })
    }
  })
}

</script>

<style scoped>
.login-box{
  display:flex;
  align-items:center;
  width: 50%;
  height:100%;
  right:0;
  position: absolute;
}
.login-container{
  height: 100vh;
  overflow:hidden;
  background-image: url("@/assets/bg.jpg");
  background-size: cover;
  background-position: 0 -50px;
}
</style>