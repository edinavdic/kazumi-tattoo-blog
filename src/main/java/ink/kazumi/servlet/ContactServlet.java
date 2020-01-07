package ink.kazumi.servlet;

import ink.kazumi.service.ContactService;
import ink.kazumi.service.GalleryService;
import ink.kazumi.service.InstagramGalleryService;
import ink.kazumi.service.JavaMailContactService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String CONTACT_PAGE = "/contact.jsp";

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
        // todo 2. Populate the text from .properties files localization
        ContactService service = JavaMailContactService.getInstance();
        forwardToJsp(req, resp);
    }

    private void forwardToJsp(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher(CONTACT_PAGE);
        dispatcher.forward(req, resp); // todo forward to contactSuccess page
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}