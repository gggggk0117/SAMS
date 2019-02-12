<%--
  Created by IntelliJ IDEA.
  User: elis
  Date: 19-2-10
  Time: 下午11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title></title>

    <%--<script src="js/sanitary/adapter.js"></script>--%>
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="stylesheet" type="text/css" href="css/sanitary/base.css"> <!--初始化文件-->
    <link rel="stylesheet" type="text/css" href="css/sanitary/menu.css"> <!--主样式-->
    <link rel="stylesheet" type="text/css" href="css/sanitary/sanitary.css">

</head>
<body>
<script src="js/sanitary/adapter.js"></script>
<div class="top">
    <div class="logo">
        <img src="images/logo.png">
    </div>
    <div class="nav">
        <ul>
            <li>
                <a href="index.html">首页</a>
            </li>
            <li>
                <a href="">卫生管理</a>
            </li>
            <li>
                <a href="">维修管理</a>
            </li>
            <li>
                <a href="">违纪管理</a>
            </li>
        </ul>
    </div>
    <div class="gr">
        <a href="#"><img src="images/1.png" class="grxx"></a>
    </div>
    <div class="util">
        <div>
            <a href="#"><img src="images/sz.png" class="sz" class="tb"></a>
        </div>
        <div>
            <a href="#"><img src="images/咨询.png" class="xx" class="tb"></a>
        </div>
        <div>
            <a href="#"><img src="images/退出.png" class="tc" class="tb"></a>
        </div>
    </div>
</div>

<div id="menu">
    <!--隐藏菜单-->
    <!-- <div id="ensconce">
        <h2>
            国内各地景点
        </h2>
    </div> -->

    <!--显示菜单-->
    <div id="open">
        <div class="navH">
            宿舍列表
            <%--<span><img class="obscure" src="images/obscure.png" alt=""></span>--%>
        </div>
        <div class="navBox">
            <ul>
                <li>
                    <h2 class="obtain">一楼<i></i></h2>
                    <div class="secondary"><a href="#">
                        <h3>1101</h3></a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
<!-- <div class="ss">
    <input type="" name="" class="main">
</div> -->
<script src="js/sanitary/menu.js"></script>


<div class="operating">
    <div class="message">
        <div>
            <span>宿舍号：</span>
            <input type="type" name="bz" class="bz" value="你好">
        </div>
        <div>
            <span>舍长姓名：</span>
            <input type="type" name="bz" class="bz" value="你好">
        </div>
        <div>
            <span>舍长电话：</span>
            <input type="type" name="bz" class="bz" value="你好">
        </div>
        <div>
            <span>宿舍是否违纪：</span>
            <input type="type" name="bz" class="bz" value="你好">
        </div>
        <div>
            <span>宿舍是否评优：</span>
            <input type="type" name="bz" class="bz" value="你好">
        </div>

    </div>
    <div class="operation">
        <div class="d_1">
            <span>评分：</span>
            <select name="num" class="sel_1">
                <option value="1">1分</option>
                <option value="2">2分</option>
                <option value="3">3分</option>
                <option value="4">4分</option>
                <option value="5">5分</option>
                <option value="6">6分</option>
                <option value="7">7分</option>
                <option value="8">8分</option>
                <option value="9">9分</option>
                <option value="10">10分</option>
            </select>
        </div>
        <div class="d_2">
            <span>扣分原因:</span>
            <select name="num" class="sel_2">
                <option value="地面不净">地面不净</option>
                <option value="s2">阳台不净</option>
                <option >厕所未刷</option>
                <option >厕所未刷</option>
                <option >厕所未刷</option>
                <option >厕所未刷</option>
                <option >厕所未刷</option>
                <option >其他</option>
            </select>
        </div>
        <div class="d_3">
            <span>备注：</span>
            <input type="type" name="bz" class="bz">
        </div>
        <div class="d_4">
            <span>寝室平时生活学习中表现优异，特此向领导申请评优评选：</span>
            <input type="checkbox" name="vehicle" value="Bike">勾选评优评选<br>
        </div>
    </div>
    <div>
        <button type="submit" class="button1">提交</button>
    </div>
</div>

</body>
</html>
