package severlet;

import bense.User;
import dao.UserDao;
import impl.UserImpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //new 女朋友
        User users =new User();
        UserDao dao = new UserImpl();
        //基础连接设置
        response.setContentType("text/html;charset=utf-8");
//        PrintWriter out = response.getWriter();
        HttpSession httpSession =request.getSession();
        //获取参数
        String user= request.getParameter("user");
        String pwd=request.getParameter("pwd");
//        System.out.println(user+"@@"+pwd);
        users=dao.find(user,pwd);
        if (users.getUser_id()==null){
            response.sendRedirect("../login.jsp");
        }else {
            if (users.getUser_password().equals(pwd)){
                httpSession.setAttribute("users",users);
                request.getRequestDispatcher("Index").forward(request,response);
            }
            else{
                response.sendRedirect("../login.jsp");
            }
        }


    }
}
