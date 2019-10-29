package Dao;

import Services.Elems;
import Services.IService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        IService iService=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config.xml")).openSession().getMapper(IService.class);
        Elems isHave = iService.findByUsername(request.getParameter("username"));
        if (isHave!=null){
            Elems e1=new Elems();
            e1.setUsername(request.getParameter("username"));
            e1.setPassword(request.getParameter("password"));
            Elems isUser = iService.isUser(e1);
            if (isUser!=null){
                Elems e2 = iService.findByUsername(e1.getUsername());
                request.setAttribute("elem",e2);
                request.getRequestDispatcher("user.jsp").forward(request,response);
            }else {
                System.out.println("1用户名或密码错误");
            }
        }else {
            System.out.println("0用户不存在");
            response.sendRedirect("register.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
