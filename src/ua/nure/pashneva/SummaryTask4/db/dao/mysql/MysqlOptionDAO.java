package ua.nure.pashneva.SummaryTask4.db.dao.mysql;

import ua.nure.pashneva.SummaryTask4.db.dao.OptionDAO;
import ua.nure.pashneva.SummaryTask4.db.entity.Option;

import java.util.List;

public class MysqlOptionDAO implements OptionDAO {
    @Override
    public boolean create(Option option) {
        return false;
    }

    @Override
    public Option read(Integer id) {
        return null;
    }

    @Override
    public Option read(String name) {
        return null;
    }

    @Override
    public List<Option> readAll() {
        return null;
    }

    @Override
    public boolean update(Option option) {
        return false;
    }

    @Override
    public boolean delete(Option option) {
        return false;
    }
}
