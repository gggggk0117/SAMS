package severlet;

import bense.discipline;
import dao.DisciplineDao;
import impl.DisciplineImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class disciplineQueryAll extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       int sum=0;    //总条数；

       int sum1=1;   //当前；

        int current;
        discipline dis=new discipline();
        DisciplineDao dis_Dao=new DisciplineImpl();
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        PrintWriter out=resp.getWriter();
        sum=dis_Dao.QuerySum();
        if (sum%6==0){
            sum=sum/6;
        }else {
            sum=sum/6+1;
        }
        if (req.getParameter("name_next")!=null){        //下一页
            if (req.getParameter("name_next").equals("下一页")){
                if (req.getParameter("current")!=null)
            {
                    current = Integer.valueOf(req.getParameter("current"));
                    sum1 = current;
                    sum1++;
                }}

        }

        /*
        上一页
         */

        if (req.getParameter("name_up")!=null){        //下一页
            if (req.getParameter("name_up").equals("上一页")){
                if (req.getParameter("current")!=null)
                {
                    current = Integer.valueOf(req.getParameter("current"));
                    sum1 = current;
                    sum1--;
                }}

        }


        if (req.getParameter("next_up")!=null){
            if (req.getParameter("name_up").equals("up"))//上一页
                if (req.getParameter("current")!=null) {
                    current = Integer.valueOf(req.getParameter("current"));
                    sum1 = current;
                    sum1--;
                }

        }
        if (sum1>=sum){
            sum1=sum;
        }
        if (sum1<=1){
            sum1=1;
        }
        HttpSession httpSession=req.getSession();
        List<discipline> list=new ArrayList<discipline>();
        list=dis_Dao.getAllDisQuery(sum1);


        httpSession.setAttribute("sum",sum1);    //当前页
        httpSession.setAttribute("sum1",sum);
        httpSession.setAttribute("diss",list);
        resp.sendRedirect("../discipline.jsp");
    }

}
