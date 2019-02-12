package frlter;

import bense.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class Filter_Login implements Filter {
    String[] page;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;
        for (String str:page){
            if (request.getRequestURI().indexOf(str)!=-1){
                chain.doFilter(request,response);
                return;
            }
        }
        HttpSession box =request.getSession();
        User accon = (User) box.getAttribute("users");
        if (accon==null){
            response.sendRedirect("../Login.jsp");
        }else {
            chain.doFilter(request,response);
        }

    }

    public void init(FilterConfig config) throws ServletException {
        String canpass = config.getInitParameter("namespace");
        page = canpass.split(";");
    }

}
