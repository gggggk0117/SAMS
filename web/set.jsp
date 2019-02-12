<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2018/12/29
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/set.css">
</head>
<body>
<div>
        <%
        Object Error=session.getAttribute("disciplineQueryError");
        if(Error!=null){
            out.print("<script type='text/javascript'> alert('"+Error+"'); </script>");
            session.removeAttribute("disciplineQueryError");
        }
    %>

<div class="top">
    <div class="logo">
        <img src="../images/logo.png">
    </div>
    <div class="nav">
        <ul>
            <li>
                <a href="Index.jsp">首页</a>
            </li>
            <li>
                <a href="">卫生管理</a>
            </li>
            <li>
                <a href="">维修管理</a>
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
            <a href="../set.jsp"><img src="../images/sz.png" class="sz" ></a>
        </div>
        <div>
            <a href="#"><img src="../images/咨询.png" class="xx" ></a>
        </div>
        <div>
            <a href="#"><img src="../images/退出.png" class="tc" ></a>
        </div>
    </div>
</div>


<div class="main">
    <form action="/severlet/Set" method="post">
    <div class="input1">
        <span>公寓名：</span>
        <input type="type" name="AName" value="${sessionScope.apartment.getApartment_name()}">
    </div>
    <div class="input1">
        <span>楼层数：</span>
        <input type="type" name="NFloors" value="${sessionScope.apartment.getFloor_num()}">
    </div>
    <div class="input1">
        <span>公寓性别：</span>
        <input type="type" name="gysex" value="${sessionScope.apartment.getApartment_sex()}">
    </div>

    <div class="text_1">
        <span>公寓规章制度：</span>
        <textarea class="ts_1" name="ts_1" >${sessionScope.apartment.getApartment_rule()}</textarea>
    </div>
    <div class="text_1">
        <span>公寓公告：</span>
        <textarea class="ts_2" name="ts_2">${sessionScope.apartment.getApartment_notice()}</textarea>
    </div>

    <div class="btns">
        <button type="submit" class="btn" value="添加" name="add">添加</button>
        <button type="submit" class="btn" value="更新" name="update">更新</button>
    </div>
</form>
</div>
</body>
</html>
