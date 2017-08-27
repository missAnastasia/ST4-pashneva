package ua.nure.pashneva.SummaryTask4.mail;

import org.apache.log4j.Logger;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


class Sender {

    private String userName;
    private String password;
    private Properties serverProperties = new Properties();

    private static final Logger LOG = Logger.getLogger(Sender.class);

    public Sender(String userName, String password, Properties serverProperties) {
        this.userName = userName;
        LOG.trace("UserName -->" + userName);
        this.password = password;
        LOG.trace("Password -->" + password);
        this.serverProperties = serverProperties;

        /*serverProperties = new Properties();
        serverProperties.put("mail.smtp.host", "smtp.properties.com");
        serverProperties.put("mail.smtp.socketFactory.port", "465");
        serverProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        serverProperties.put("mail.smtp.auth", "true");
        serverProperties.put("mail.smtp.port", "465");*/


    }

    public void send(String subject, String text, String toEmail) throws MessagingException {
        Session session = Session.getDefaultInstance(serverProperties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        });
        LOG.debug("Creating message");
            Message message = new MimeMessage(session);
            //от кого
            message.setFrom(new InternetAddress(userName));
            LOG.trace("Sending from -->" + userName);
            //кому
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
        LOG.trace("Sending to -->" + toEmail);
            //тема сообщения
            message.setSubject(subject);
        LOG.trace("Message subject -->" + subject);
            //текст
            message.setText(text);
        LOG.trace("Message text -->" + text);

            //отправляем сообщение
            Transport.send(message);
        LOG.debug("Message sent");
    }
}