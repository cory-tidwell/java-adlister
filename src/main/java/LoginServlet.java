import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // redirect if the user is not an admin
        // cast to a boolean data type to properly compare
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");

        } else {
            request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        boolean validAttempt = user.equals("admin") && pass.equals("password");
        boolean validAttempt2 = user.equals("cory") && pass.equals("testtest");
//        String name = user;
//        if (name == null) {
//            name = "World!";
//        }
//        response.getWriter().println("<h1> Hello " + name + "</h1>");



        if (user.equals("admin") && pass.equals("password")) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
        } else if (user.equals("tito") && pass.equals("jackson")) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
//        if (validAttempt) {
//            response.sendRedirect("/profile");
//        } else if (validAttempt2) {
//            response.sendRedirect("/profile");
//        } else {
//            response.sendRedirect("/login");
//        }
    }
}
