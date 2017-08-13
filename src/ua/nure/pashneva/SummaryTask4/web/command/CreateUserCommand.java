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

public class CreateUserCommand extends Command {

    private static final Logger LOG = Logger.getLogger(NoCommand.class);

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

        String role = request.getParameter("role");
        LOG.trace("Request parameter: role --> " + role);

        String status = request.getParameter("status");
        LOG.trace("Request parameter: status --> " + status);

        if (login == null || password == null || login.isEmpty() || password.isEmpty() ||
                firstName == null || secondName == null || firstName.isEmpty() || secondName.isEmpty() ||
                role == null || status == null || role.isEmpty() || status.isEmpty()) {
            throw new AppException("Login/password/first name/second name/role/status cannot be empty");
        }

        User user = new User(login, password, firstName, secondName,
                Role.getRoleOrdinal(role), UserStatus.getUserStatusOrdinal(status));

        try {
            User existingUser = DAOFactory.getInstance().getUserDAO().read(user.getLogin());
            if (existingUser == null) {
                String locale = request.getSession().getAttribute("locale").toString();

                //DAOFactory.getInstance().getUserDAO().create(user);
            } else {
                throw new AppException("User already exists");
            }
        } catch (Exception e) {
            throw new AppException("Cannot create user");
        }

        LOG.trace("Insert into DB: user --> " + user);

        LOG.debug("Command finished");
        response.sendRedirect(Path.PAGE_HOME);
    }
}
