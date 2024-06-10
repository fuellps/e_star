package login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Console;
import java.io.IOException;

/**
 * ClassName: ${NAME}
 * <p>
 * Description:
 *
 * @Author lps
 * @Create 2024/6/9 10:19
 * @Version 1.0
 */
@WebServlet("/UserValidServlet")
public class UserValidServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setHeader("Access-Control-Allow-Origin","*");
/*
    TODO:
     Cannot invoke "String.trim()"
     because the return value of "javax.servlet.http.HttpServletRequest.getParameter(String)" is null
        String userName = request.getParameter("userName").trim();
       上面的错误导致了:HTTP Status 500 – Internal Server Error
 */
//
        String userName = request.getParameter("userName");
        System.out.println(userName);
//        System.out.println(userName);
        Message message = null;
//        TODO:修改前
//        if ("".equals(userName)) {
//        TODO:注意:这里响应的时候返回中文出现乱码,因为Tomcat默认的编码和解码不是UTF-8,所以要设置响应内容和响应的字符集
        response.setHeader("content-type","text/html;charset=utf-8");
        if("".equals(userName) || userName.trim().length() == 0){
            message = new Message(false, "请输入用户名");
        } else if (!"admin".equals(userName)) {
            message = new Message(false, "输入的用户名不正确");
        }else{
            message = new Message(true,"输入的用户名正确");
        }
        response.getWriter().print("{\"flag\":" + message.isFlag() + ",\"mess\":" +"\"" +message.getMess()+"\""+"}");

    }
}