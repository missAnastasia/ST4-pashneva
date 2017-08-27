package ua.nure.pashneva.SummaryTask4.mail;

import com.sun.deploy.net.HttpRequest;
import ua.nure.pashneva.SummaryTask4.exception.AppException;
import ua.nure.pashneva.SummaryTask4.web.listener.ContextListener;
import ua.nure.pashneva.SummaryTask4.web.util.Path;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class MailManager {

    private static Properties serverProperties = new Properties();
    private static Properties sendersProperties = new Properties();

    private MailManager() {
    }

    public static void setProperties(Properties serverProperties, Properties sendersProperties) {
        MailManager.serverProperties = serverProperties;
        MailManager.sendersProperties = sendersProperties;
    }

    public static boolean sendRegistrationConfirmationMail(String recipient, HttpServletRequest request) throws AppException {
        String senderMail = sendersProperties.getProperty("registration_confirmation_username");
        String senderPassword = sendersProperties.getProperty("registration_confirmation_password");

        Sender sender = new Sender(senderMail, senderPassword, serverProperties);

        String messageSubject = ResourceBundle.getBundle("resources", request.getLocale())
                .getString("mail.registration.confirmation.subject");
        String messageText = ResourceBundle.getBundle("resources", request.getLocale())
                .getString("mail.registration.confirmation.text") + System.lineSeparator() +
                Path.HOST + Path.COMMAND_CONFIRM_REGISTRATION + recipient;

        try {
            sender.send(messageSubject, messageText, recipient);
            return true;
        } catch (MessagingException e) {
           throw new AppException(e.getMessage());
        }
    }
}
