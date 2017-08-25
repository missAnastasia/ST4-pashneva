package ua.nure.pashneva.SummaryTask4.db.dao;

import ua.nure.pashneva.SummaryTask4.db.entity.Bill;
import ua.nure.pashneva.SummaryTask4.db.entity.BillStatus;

import java.util.List;

public interface BillDAO {
    boolean create(Bill bill);
    Bill read(Integer id);
    Bill read(BillStatus billStatus);
    List<Bill> readAll();
    boolean update(Bill bill);
    boolean delete(Bill bill);
}
