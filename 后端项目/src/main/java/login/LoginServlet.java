package login;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 * <p>
 * Description:
 *
 * @Author lps
 * @Create 2024/6/9 0:27
 * @Version 1.0
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            //        处理POST请求中文乱码问题
            request.setCharacterEncoding("utf-8");
            response.setHeader("Access-Control-Allow-Origin","*");
            String method = request.getMethod();
//        Map<String, String[]> map = request.getParameterMap();
//        map.forEach((key,val) -> System.out.println(key + ":" + Arrays.toString(val))) ;
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
//        System.out.println(method + "  " + userName + "  " + password);

//           假设用户名是admin,密码是admin666
            if("admin".equals(userName) && "admin666".equals(password)){
                response.getWriter().print(true);
            }else{
                response.getWriter().print(false);
            }
//           出现错误,直接返回false
        }catch (Exception e){
            response.getWriter().print(false);
        }
    }
}