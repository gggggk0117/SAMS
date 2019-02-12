<%@ page import="java.util.List" %>
<%@ page import="bense.discipline" %><%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2018/12/27
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>公寓管理系统--违纪界面</title>
   <link rel="stylesheet" type="text/css" href="../css/discipline.css">
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
</div>

<div class="bg">

    <div class="top">
        <div class="logo">
            <img src="../images/logo.png">
        </div>
        <div class="nav">
            <ul>
                <li>
                    <a href="../Index.jsp">首页</a>
                </li>
                <li>
                    <a href="">卫生管理</a>
                </li>
                <li>
                    <a href="">维修管理</a>
                </li>
                <li>
                    <a href="../discipline.jsp">违纪管理</a>
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
                <a href="../set.jsp"><img src="../images/sz.png" class="sz" class="tb"></a>
            </div>
            <div>
                <a href="#"><img src="../images/咨询.png" class="xx" class="tb"></a>
            </div>
            <div>
                <a href="#"><img src="../images/退出.png" class="tc" class="tb"></a>
            </div>
        </div>
    </div>
    <div class="left">


        <div class="left_im">
            <form action="../severlet/disciplineQueryIM" method="post">
                <h5 class="id_h5">学号/宿舍号:</h5>
                <input type="text" name="id" placeholder="请填写学号或宿舍号:" id="IN"/>
                <input type="submit" value="查找" id="sub"/><br>

                <h5 class="name_h5">姓名:</h5>
                <input type="text" name="name" id="name" value="${name}"
                       placeholder="姓名：" readonly="readonly"/>

                <h5 class="sex_h5">性别:</h5>
                <input type="text" name="sex" id="sex" value="${sex}" readonly="readonly"/>

                <h5 class="num_h5">宿舍号:</h5>
                <input type="text" name="num" id="num" value="${dnum}" readonly="readonly"/>

                <h5 class="phone_h5">联系方式:</h5>
                <input type="text" name="phone" id="phone" value="${phone}" readonly="readonly"/>

                <h5 class="col_h5">学院:</h5>
                <input type="text" name="college" id="college" value="${college}" readonly="readonly"/>

                <h5 class="members_h5">成员:</h5>
                <input type="text" name="college" id="members" value="" readonly="readonly"/>

            </form>
        </div>
    </div>
    <div class="right">
        <div class="ri_top">
            <form action="../severlet/disciplinaryProcess" method="post">
                <h5 class="Id_h5">宿舍号/学号:</h5>
                <input type="text" name="Id" id="Id" placeholder="宿舍号/学号"/>

                <h5 class="write_h5">违纪填写:</h5>
                <select id="write" name="write">
                    <option>个人违纪</option>
                    <option>宿舍违纪</option>
                </select>

                <h5 class="reason_h5">违纪理由:</h5>
                <select id="reason" name="reason">
                    <option>晚归</option>
                    <option>彻夜未归</option>
                    <option>打架斗殴</option>
                    <option>卫生脏乱差</option>
                    <option>违章电器</option>
                    <option>其他</option>
                </select>

                <h5 class="note_h5">备注:</h5>
                <textarea id="note" rows="3" cols="20" name="note"></textarea>

                <h5 class="date_h5">时间:</h5>
                <input type="date" value="2019/01/01" name="date" id="date" />

                <h5 class="YN_h5">是否评优:</h5>
                <select class="YN" name="YN">
                    <option>是</option>
                    <option>否</option>
                </select>

                <input type="submit" value="提交" id="submit"/>
                <input type="reset"  value="重置" id="reset"/>


            </form>
        </div>

        <div class="ri_bottom">
            <form action="../severlet/disciplineQueryAll" method="post">
            <ul>
                <li>序号</li>
                <li>宿舍号/学号</li>
                <li>姓名/班级</li>
                <li class="widening">时间</li>
                <li class="widening">学院</li>
                <li class="widening">理由</li>
                <li class="widening1">备注</li>
            </ul>
                   <%
                request.setCharacterEncoding("utf-8");
                List<discipline> list = null;
                discipline dis=new discipline();
                list= (List<discipline>) session.getAttribute("diss");
                if (list==null){%>
                    <%{%>
                <ul>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li class="widening"></li>
                    <li class="widening"></li>
                    <li class="widening"></li>
                    <li class="widening1"><textarea readonly></textarea></li>
                </ul>

                <ul>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li class="widening"></li>
                    <li class="widening"></li>
                    <li class="widening"></li>
                    <li class="widening1"><textarea readonly></textarea></li>
                </ul>

                <ul>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li class="widening"></li>
                    <li class="widening"></li>
                    <li class="widening"></li>
                    <li class="widening1"><textarea readonly></textarea></li>
                </ul>

                <ul>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li class="widening"></li>
                    <li class="widening"></li>
                    <li class="widening"></li>
                    <li class="widening1"><textarea readonly></textarea></li>
                </ul>

                <ul>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li class="widening"></li>
                    <li class="widening"></li>
                    <li class="widening"></li>
                    <li class="widening1"><textarea readonly></textarea></li>
                </ul>

                <ul>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li class="widening"></li>
                    <li class="widening"></li>
                    <li class="widening"></li>
                    <li class="widening1"><textarea readonly></textarea></li>
                </ul>
                    <%}
                }
                else
                       for (int i=0;i<list.size();i++)
                       {dis=list.get(i);
                       request.setAttribute("disci",dis);
                       dis.setDiscipline_id(i+1);

                   %>
                        <ul>
                <li>${disci.getDiscipline_id()}</li>
                <%--判断 是寝室违纪 还是 个人违纪--%>
                            <c:choose>
                            <c:when test="${disci.student_id==null}">
                                <li>${disci.student_dnum}</li>
                            </c:when>
                            <c:otherwise>
                                <li>${disci.student_id}</li>
                            </c:otherwise>
                            </c:choose>
                <li>${disci.getStudent_name()}</li>
                <li class="widening">${disci.getDiscipline_time()}</li>
                <li class="widening">${disci.getStudent_collegee()}</li>
                <li class="widening">${disci.getDiscipline_reason()}</li>
                <li class="widening1"><textarea readonly>${disci.getDiscipline_note()}</textarea></li>
            </ul>
                <%} %>

                <input type="submit" value="查询" id="all"/>
                <%--<a href="/severlet/disciplineQueryAll?name_up=up" class="previousPage">上一页</a>--%>
                <%--<a href="/severlet/disciplineQueryAll?name_next=next1" class="nextPage">下一页</a>--%>
                <input type="submit" value="下一页" name="name_next" class="nextPage"/>
                <input type="submit" value="上一页" name="name_up" class="previousPage"/>
                <h5 class="current_h5">当前页</h5>
                <input type="text" size="1" readonly="readonly"
                       value="${sum}" name="current" id="current" />

                <h5 class="Sumcurrent_h5">总页数</h5>
                <input type="text" size="1" readonly="readonly"
                       value="${sum1}" name="current" id="Sumcurrent" />
            </form>

        </div>
    </div>
</div>
</body>
</html>
