<%--
  Created by IntelliJ IDEA.
  User: elis
  Date: 19-2-14
  Time: 下午4:17
  To change this template use File | Settings | File Templates.
--%>

<%--这里进行基础注册，自定义账号，密码，剩余信息在个人页内修改 --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>注册页</title>
        <link rel="stylesheet" href="css/singleup.css">
    </head>
    <body>
        <div class="body">
            <div class="head">
                <h1>学生公寓管理系统</h1>
            </div>
            <form class="bd">
                <div class="uname">
                    <input type="text" placeholder="请输入用户名">
                </div>
                <div class="pwd">
                    <input type="password" placeholder="请输入密码">
                </div>
                <div class="pwds">
                    <input type="password" placeholder="确定密码">
                </div>

                <div class="bgbutton">
                    <button type="button" class="button" >注册</button>
                </div>
            </form>
            <div></div>
        </div>
    </body>
</html>
