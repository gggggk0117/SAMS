package severlet;

import bense.Students;
import bense.discipline;
import dao.DisciplineDao;
import dao.SanitaryDao;
import dao.StudentsDao;
import impl.DisciplineImpl;
import impl.SanitaryImpl;
import impl.StudentsImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

public class disciplinaryProcess extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int rows=0;
        DisciplineDao dis_Dao=new DisciplineImpl();
        /*
        查询学生表
         */
        Students stu=null;
        StudentsDao stu_Dao=new StudentsImpl();

        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        PrintWriter out=resp.getWriter();
        HttpSession httpSession=req.getSession();
        String id=req.getParameter("Id");          //学号
        /*
        查询Students
         */
        stu=stu_Dao.findDiscipline(id);
        /*
        判断宿舍违纪 还是个人
         */
        String name=null;
        if ((id.length())>=6) {
             name = stu.getStudent_name();            //姓名*
        }
        else {
            name=stu.getStudent_class();
        }
        String collegee=stu.getStudent_college();          //学院*


        String write=req.getParameter("write");          //判断个人还是宿舍
        String red=req.getParameter("YN");        //是否评优
        /*
        给时间转换
         */

        String time=req.getParameter("date");          //违纪时间
        SimpleDateFormat dateFormat=new SimpleDateFormat(time);

        String reason=req.getParameter("reason");          //理由
        String note=req.getParameter("note");          //备注

        discipline dis=new discipline(id,name,write,red,time,collegee,reason,note);
        rows=dis_Dao.insertDiscipline(dis);

        if (rows<1){
            httpSession.setAttribute("disciplineQueryError","学生信息查询失败");
        }
        resp.sendRedirect("../discipline.jsp");
    }


}
