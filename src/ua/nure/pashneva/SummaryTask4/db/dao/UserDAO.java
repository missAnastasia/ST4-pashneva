package ua.nure.pashneva.SummaryTask4.db.dao;

import ua.nure.pashneva.SummaryTask4.db.entity.Language;
import ua.nure.pashneva.SummaryTask4.db.entity.User;

import java.util.List;

public interface UserDAO {

    boolean create(User user);
    User read(Integer id);
    User read(String login);
    List<User> readAll();
    boolean update(User user);
    boolean delete(User user);
}
