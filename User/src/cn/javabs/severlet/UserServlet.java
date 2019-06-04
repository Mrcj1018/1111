package cn.javabs.severlet;

import cn.javabs.service.UserService;
import cn.javabs.entity.User;
import cn.javabs.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/userServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        System.out.println(username+":"+password+":"+sex);
        System.out.println(username+":"+password+":"+sex);
        User u=new User();
        u.setUsername(username);
        u.setPassword(password);
        u.setSex(sex);
        System.out.println("u:"+u);
        UserService userService= new UserServiceImpl();
        System.out.println("hahha");
        int rows=userService.addUser(u);
        System.out.println("rows:" + rows);
        if (rows>0){
            response.getWriter().write("添加用户成功");
        }else {
            response.getWriter().write("添加用户失败");
        }
        System.out.println(rows);
    }
}
