package ua.nure.pashneva.SummaryTask4.web.command;

import org.apache.log4j.Logger;
import ua.nure.pashneva.SummaryTask4.util.Path;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * View settings command.
 * 
 * @author D.Kolesnikov
 * 
 */
public class UserInfoCommand extends Command {
	
	private static final long serialVersionUID = -3071536593627692473L;
	
	private static final Logger LOG = Logger.getLogger(UserInfoCommand.class);
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.debug("Command starts");
		//response.sendRedirect(Path.PAGE_USER_INFO);
		request.getRequestDispatcher(Path.PAGE_USER_INFO).forward(request, response);
		LOG.debug("Command finished");
	}

}