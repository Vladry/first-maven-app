package vlad.firstMavenApp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getform")
public class GetFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("getemail");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<p>thanks for submitting your email!</p>");
        response.getWriter().println("<p>Please, check your email box " + email + " to find more information on how to make your playing with Straddle become a reliable and long-term income source!</p>");
    }
}
