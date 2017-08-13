package ua.nure.pashneva.SummaryTask4.db.dao;

import ua.nure.pashneva.SummaryTask4.db.entity.Language;

import java.util.List;

public interface LanguageDAO {

    boolean create(Language language);
    Language read(Integer id);
    Language read(String name);
    List<Language> readAll();
    boolean update(Language language);
    boolean delete(Language language);
}
