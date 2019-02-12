package severlet;

import bense.Students;
import dao.StudentsDao;
import impl.StudentsImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class disciplineQueryIM extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Students students;
        StudentsDao stu_dao=new StudentsImpl();
        //基础连接
        String  sex=null;
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        HttpSession httpSession=req.getSession();
        String id=req.getParameter("id");
        students=stu_dao.findDiscipline(id);
        if (students.getStudent_name()!=null){
            if(students.isStudent_sex()){
                sex="男";
            }
            else {
                sex="女";
            }
            httpSession.setAttribute("name",students.getStudent_name());
            httpSession.setAttribute("sex",sex);
            httpSession.setAttribute("dnum",students.getStudent_dnum());
            httpSession.setAttribute("phone",students.getStudent_tel());
            httpSession.setAttribute("college",students.getStudent_college());

        }else {
            httpSession.setAttribute("disciplineQueryError","学生信息查询失败");
        }
        resp.sendRedirect("../discipline.jsp");
    }
}
