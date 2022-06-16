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
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");
        boolean validAttempt2 = username.equals("cory") && password.equals("testtest");



        if (username.equals("admin") && password.equals("password")) {
            request.getSession().setAttribute("user", username);
            response.sendRedirect("/profile");
        } else if (username.equals("tito") && password.equals("jackson")) {
            request.getSession().setAttribute("user", username);
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
