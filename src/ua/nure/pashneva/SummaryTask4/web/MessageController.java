package ua.nure.pashneva.SummaryTask4.web;
import ua.nure.pashneva.SummaryTask4.db.dao.DAOFactory;
import ua.nure.pashneva.SummaryTask4.db.entity.Role;
import ua.nure.pashneva.SummaryTask4.db.entity.User;
import ua.nure.pashneva.SummaryTask4.exception.AppException;
import ua.nure.pashneva.SummaryTask4.util.Path;
import ua.nure.pashneva.SummaryTask4.util.SessionManager;

import java.io.IOException;
import org.apache.log4j.Logger;
import ua.nure.pashneva.SummaryTask4.web.command.Command;
import ua.nure.pashneva.SummaryTask4.web.command.CommandContainer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MessageController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final Logger LOG = Logger.getLogger(MessageController.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        process(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void process(HttpServletRequest request,
                         HttpServletResponse response) throws IOException, ServletException {
        LOG.debug("Controller starts");

        // extract command name from the request
        String commandType = request.getParameter("type");
        LOG.trace("Request parameter: command --> " + commandType);
        String message = request.getParameter("message");
        LOG.trace("Request parameter: message --> " + message);
        request.setAttribute("message", message);

        switch (commandType) {
            case "error": {

                request.getRequestDispatcher(Path.PAGE_ERROR_PAGE).forward(request, response);
                break;
            }
            case "success": {

                break;
            }
        }

        LOG.trace("Obtained commandType --> " + commandType);

    }

}