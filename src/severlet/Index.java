package severlet;

import bense.Apartment;
import bense.Students;
import bense.Teacher;
import bense.User;
import dao.ApartmentDao;
import dao.StudentsDao;
import dao.TeacherDao;
import impl.ApartmentImpl;
import impl.StudentsImpl;
import impl.TeacherImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class Index extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user= (User) request.getSession().getAttribute("users");//获取部署的session
        Students students = new Students();
        Teacher teacher = new Teacher();
        Apartment apartment =new Apartment();

        StudentsDao stuentsDao = new StudentsImpl();
        students = stuentsDao.find(user.getUser_id());
        TeacherDao teacherDao = new TeacherImpl();
        //应对多个用户操作
        if (user.getUser_s()==1){
            teacher = teacherDao.find(students.getApartment_id());
        }else if (user.getUser_s()==2){
            teacher = teacherDao.find(user.getUser_id());
        }
//        teacher = teacherDao.find(user.getUser_id());
        HttpSession session_t = request.getSession();//教师session
        HttpSession session_s = request.getSession();//学生session
        HttpSession session_a = request.getSession();//公寓session
//        int i =user.getUser_s();
//        System.out.println(i);
        session_s.setAttribute("students",students);
        session_t.setAttribute("teacher",teacher);

//        System.out.println(teacher.getTeacher_name());
        ApartmentDao apartmentDao = new ApartmentImpl();
        apartment=apartmentDao.find(teacher.getApartment_id());
        session_a.setAttribute("apartment",apartment);
        response.sendRedirect("../Index.jsp");
    }
}
