package login;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: ${NAME}
 * <p>
 * Description:
 *
 * @Author lps
 * @Create 2024/6/9 11:16
 * @Version 1.0
 */
@WebServlet("/PasswordValidServlet")
public class PasswordValidServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//    设置异域请求
        response.setHeader("Access-Control-Allow-Origin", "*");
//        解决POST乱码问题
        request.setCharacterEncoding("utf-8");
        String password = request.getParameter("password");
        System.out.println(password);
//        TODO:解决响应乱码问题
        response.setContentType("text/html;charset=utf-8");
        Message message = null;
        if ("".equals(password) || "".equals(password.trim())) {
            message = new Message(false, "请输入密码");
//            TODO: [0-9] => \\d
        } else if (!"admin666".equals(password)) {
            message = new Message(false, "输入的密码错误");
        } else {
            message = new Message(true, "输入的密码正确");
        }
        response.getWriter().print("{" + "\"flag\":" + message.isFlag()  + "," + "\"mess\":" + "\""
                + message.getMess() + "\"" + "}");
    }
}