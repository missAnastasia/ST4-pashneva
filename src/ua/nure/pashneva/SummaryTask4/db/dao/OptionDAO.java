package ua.nure.pashneva.SummaryTask4.db.dao;

import ua.nure.pashneva.SummaryTask4.db.entity.Option;

import java.util.List;

public interface OptionDAO {
    boolean create(Option option);
    Option read(Integer id);
    Option read(String name);
    List<Option> readAll();
    boolean update(Option option);
    boolean delete(Option option);
}
