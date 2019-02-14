<%--
  Created by IntelliJ IDEA.
  User: huyix
  Date: 2018/12/25
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="utf-8">
    <title>登录页面</title>
    <link rel="stylesheet" href="css/login.css" />
  </head>
  <body>
    <div class="w">
  <!-- 头部开始 -->
  <div class="header">
    <h1>学生公寓管理系统</h1>
  </div>
  <!-- 头部结束 -->

  <!-- 主体开始 -->
  <form class="bd" action="severlet/Login" method="post">
    <div class="username">
      <input type="text"  name="user" placeholder="请输入学号/工号">
    </div>
    <div class="password">
      <input type="password" name="pwd" placeholder="请输入密码">
    </div>
    <div class="login-options">
      <div class="options1">
        <input type="checkbox" value="true"><span>记住密码</span>
      </div>
      <div class="options2">
        <a href="#">忘记密码?</a>
      </div>
    </div>
    <div class="bdButton">
      <button type="submit" class="Button">登录</button>
    </div>
    <div class="bottom">
      <span>没有账号? </span><a href="Singleup.jsp"> 注册</a>
    </div>
  </form>
  <!-- 主体结束 -->
</div>
</body>
<html>
