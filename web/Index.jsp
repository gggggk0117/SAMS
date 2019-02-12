<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: huyix
  Date: 2018/12/27
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <title>学生公寓管理系统——主页</title>
</head>
<body>
<div class="top">
    <div class="logo">
        <img src="images/logo.png">
    </div>
    <div class="nav">
        <ul>
            <li>
                <a href="Index.jsp">首页</a>
            </li>
            <li>
                <a href="#">卫生管理</a>
            </li>
            <li>
                <a href="#">维修管理</a>
            </li>
            <li>
                <a href="discipline.jsp">违纪管理</a>
            </li>
        </ul>
    </div>
    <div class="gr">
        <c:choose>
            <c:when test="${sessionScope.users.getUser_s()==1}">
                <a href="#"><img src="images/${sessionScope.students.getStudent_pri()}" class="grxx"></a>
            </c:when>
            <c:when test="${sessionScope.users.getUser_s()==2}">
                <a href="#"><img src="images/${sessionScope.teacher.getTeacher_pri()}" class="grxx"></a>
            </c:when>
        </c:choose>

    </div>
    <div class="util">
        <div>
            <a href="set.jsp"><img src="images/sz.png" class="sz" class="tb"></a>
        </div>
        <div>
            <a href="#"><img src="images/咨询.png" class="xx" class="tb"></a>
        </div>
        <div>
            <a href="#"><img src="images/退出.png" class="tc" class="tb"></a>
        </div>
    </div>
</div>

<div class="button">
    <div class="but1">
        <img src="images/${sessionScope.teacher.getTeacher_pri()}">
        <h3>教师姓名：<span>${sessionScope.teacher.getTeacher_name()}</span> </h3>
        <h4>教师电话：<span>${sessionScope.teacher.getTeacher_tel()}</span></h4>
        <textarea cols="50" rows="5" id="textarea" onfocus="if(value=='个人简介'){value=''}"onblur="if (value ==''){value='个人简介'}">${sessionScope.teacher.getTeacher_introduce()}</textarea>
    </div>
    <div class="but2">
        <h1>公寓管理制度</h1>
        <textarea readonly>${sessionScope.apartment.getApartment_rule()}</textarea>
    </div>
    <div class="but3">
        <h1>公寓公告</h1>
        <textarea readonly>${sessionScope.apartment.getApartment_notice()}</textarea>
    </div>
</div>
</body>
</html>
