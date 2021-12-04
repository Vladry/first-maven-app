package vlad.firstMavenApp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      super.doGet(req, resp); !!! -автогенератор выдаст эту строку, ее нужно удалить!
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>hi from servlet HomeServlet</h1>");
    }
}
