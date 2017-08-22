package ua.nure.pashneva.SummaryTask4.web.command;

import org.apache.log4j.Logger;
import ua.nure.pashneva.SummaryTask4.db.dao.DAOFactory;
import ua.nure.pashneva.SummaryTask4.db.entity.Language;
import ua.nure.pashneva.SummaryTask4.db.entity.Role;
import ua.nure.pashneva.SummaryTask4.db.entity.User;
import ua.nure.pashneva.SummaryTask4.db.entity.UserStatus;
import ua.nure.pashneva.SummaryTask4.exception.AppException;
import ua.nure.pashneva.SummaryTask4.util.Path;
import ua.nure.pashneva.SummaryTask4.util.SessionManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class RegisterClientCommand extends Command {

    private static final Logger LOG = Logger.getLogger(RegisterClientCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, AppException {
        LOG.debug("Command starts");

        // obtain login and password from a request

        String login = request.getParameter("login");
        LOG.trace("Request parameter: login --> " + login);

        String password = request.getParameter("password");
        LOG.trace("Request parameter: password --> " + password);

        String firstName = request.getParameter("firstName");
        LOG.trace("Request parameter: firstName --> " + firstName);

        String secondName = request.getParameter("secondName");
        LOG.trace("Request parameter: secondName --> " + secondName);

        /*String role = request.getParameter("role");
        LOG.trace("Request parameter: role --> " + role);

        String status = request.getParameter("status");
        LOG.trace("Request parameter: status --> " + status);*/

        if (login == null || password == null || login.isEmpty() || password.isEmpty() ||
                firstName == null || secondName == null || firstName.isEmpty() || secondName.isEmpty()
                /*role == null || status == null || role.isEmpty() || status.isEmpty()*/) {
            String message = ResourceBundle.getBundle("resources", request.getLocale())
                    .getString("message.error.empty_fields");
            throw new AppException(message);
        }

        User user = new User(login, password, firstName, secondName,
                Role.getRoleOrdinal(Role.CLIENT), UserStatus.getUserStatusOrdinal(UserStatus.UNBLOCKED));

        try {
            User existingUser = DAOFactory.getInstance().getUserDAO().read(user.getLogin());
            LOG.trace("Request parameter: existingUser --> " + existingUser);
            if (existingUser != null) {
                LOG.debug("existingUser != null --> true");
                String message = ResourceBundle.getBundle("resources", request.getLocale())
                        .getString("message.error.user_already_exists");
                throw new AppException(message);
            } else {
                LOG.debug("existingUser != null --> false");
                DAOFactory.getInstance().getUserDAO().create(user);
            }
        } catch (Exception e) {
            LOG.debug("catch section");
            throw new AppException(e.getMessage());
        }

        LOG.trace("Insert into DB: user --> " + user);

        LOG.debug("Command finished");
        request.getRequestDispatcher(Path.COMMAND_LOGIN).forward(request, response);
        /*response.sendRedirect(Path.PAGE_LOGIN);*/
    }
}
