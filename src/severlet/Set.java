package severlet;

import bense.Apartment;
import bense.Teacher;
import dao.ApartmentDao;
import impl.ApartmentImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Set extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApartmentDao apar_Dao = new ApartmentImpl();
        ApartmentDao apar_D = new ApartmentImpl();
        Apartment apartments;
        int rows = 0;
        Boolean sex = false;
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        HttpSession httpSession = req.getSession();
        apartments=(Apartment)httpSession.getAttribute("apartment");
        apartments.getApartment_id();

        /*
        添加
         */

        if (req.getParameter("add") != null) {
            if (req.getParameter("add").equals("添加")) {
                String AName = req.getParameter("AName");   //公寓姓名
                int NFloors = Integer.valueOf(req.getParameter("NFloors"));   //楼层数
                String gysex = req.getParameter("gysex");   //公寓性别
                String ts_1 = req.getParameter("ts_1");     //公寓规章制度
                String ts_2 = req.getParameter("ts_2");    //公寓公告
                Apartment apartment = new Apartment(apartments.getApartment_id(),AName, NFloors, gysex, ts_2, ts_1);
                rows = apar_Dao.insertApartment(apartment);
            }
        }
        if (req.getParameter("update") != null) {
            if (req.getParameter("update").equals("更新")) {
                String AName = req.getParameter("AName");   //公寓姓名
                int NFloors = Integer.valueOf(req.getParameter("NFloors"));   //楼层数
                String gysex = req.getParameter("gysex");   //公寓性别
                String ts_1 = req.getParameter("ts_1");     //公寓规章制度
                String ts_2 = req.getParameter("ts_2");    //公寓公告
                Apartment apartment = new Apartment(apartments.getApartment_id(),AName, NFloors, gysex, ts_2, ts_1);
                rows = apar_Dao.updateApartment(apartment);
            }
        }
        if (rows<1){
            httpSession.setAttribute("disciplineQueryError","添加/查找 信息失败");
        }
        HttpSession session = req.getSession();
        Teacher teacher = new Teacher();
        teacher= (Teacher) session.getAttribute("teacher");
        System.out.println(teacher.getApartment_id());
        apartments=null;
        apartments =apar_D.find(teacher.getApartment_id());
        System.out.println(apartments.getApartment_name());
        HttpSession session_a = req.getSession();
        session_a.setAttribute("apartment",apartments);
        resp.sendRedirect("../set.jsp");
    }
}
