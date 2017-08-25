package ua.nure.pashneva.SummaryTask4.db.dao.mysql;

import ua.nure.pashneva.SummaryTask4.db.dao.BillDAO;
import ua.nure.pashneva.SummaryTask4.db.entity.Bill;
import ua.nure.pashneva.SummaryTask4.db.entity.BillStatus;

import java.util.List;

public class MysqlBillDAO implements BillDAO {
    @Override
    public boolean create(Bill bill) {
        return false;
    }

    @Override
    public Bill read(Integer id) {
        return null;
    }

    @Override
    public Bill read(BillStatus billStatus) {
        return null;
    }

    @Override
    public List<Bill> readAll() {
        return null;
    }

    @Override
    public boolean update(Bill bill) {
        return false;
    }

    @Override
    public boolean delete(Bill bill) {
        return false;
    }
}
