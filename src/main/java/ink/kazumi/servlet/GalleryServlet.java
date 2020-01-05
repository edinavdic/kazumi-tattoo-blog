package ink.kazumi.servlet;

import ink.kazumi.service.GalleryService;
import ink.kazumi.service.InstagramGalleryService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/gallery")
public class GalleryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String GALLERY_PAGE = "/gallery.jsp";

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // todo 2. Populate the text from .properties files localization
        GalleryService service = InstagramGalleryService.getInstance();
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher(GALLERY_PAGE);
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}