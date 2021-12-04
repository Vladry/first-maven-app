package vlad.firstMavenApp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(urlPatterns = "/postform")
public class PostFormServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset = UTF-8");
        Map<String, String[]> postemail = request.getParameterMap();
//        String email = postemail.get("postemail")[0];
        String email = postemail.getOrDefault("postemail", new String[]{"no email address", "other"})[0];
        response.getWriter().println("<p>thanks for submitting your email!</p>");
        response.getWriter().println("<p>Please, check your email box " + email + " to find more information on how to make your playing with Straddle become a reliable and long-term income source!</p>");
    }
}