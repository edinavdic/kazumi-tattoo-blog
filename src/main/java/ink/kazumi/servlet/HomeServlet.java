package ink.kazumi.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String HOME_PAGE = "/home.jsp";

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // todo 2. Populate the text from .properties files localization
        forwardToJsp(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    private void forwardToJsp(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher(HOME_PAGE);
        dispatcher.forward(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}