package ua.nure.pashneva.SummaryTask4.db.dao;

import ua.nure.pashneva.SummaryTask4.db.entity.Language;
import ua.nure.pashneva.SummaryTask4.db.entity.User;
import ua.nure.pashneva.SummaryTask4.db.entity.UserStatus;

import java.util.List;

public interface UserDAO {

    boolean create(User user);
    User read(Integer id);
    User read(String login);
    List<User> read(UserStatus userStatus);
    List<User> readAll();
    boolean update(User user);
    boolean updatePassword(User user);
    boolean updateStatus(User user);
    boolean delete(User user);
}
