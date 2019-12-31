package ink.kazumi.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({ "/home", "/about", "/contact" })
public class BasicInfoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String HOME_PAGE = "/home.jsp";
    private static final String ABOUT_PAGE = "/about.jsp";
    private static final String CONTACT_PAGE = "/contact.jsp";

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = getForwardPage(req);
        // todo 2. Populate the text from .properties files localization
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher(page);
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    private String getForwardPage(HttpServletRequest req) {
        String path = req.getServletPath();
        if("/about".equals(path)) return ABOUT_PAGE;
        else if("/contact".equals(path)) return CONTACT_PAGE;
        else return HOME_PAGE;
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
