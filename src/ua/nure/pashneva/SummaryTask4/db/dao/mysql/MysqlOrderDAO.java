package ua.nure.pashneva.SummaryTask4.db.dao.mysql;

import ua.nure.pashneva.SummaryTask4.db.dao.OrderDAO;
import ua.nure.pashneva.SummaryTask4.db.entity.*;

import java.util.Date;
import java.util.List;

public class MysqlOrderDAO implements OrderDAO {

    private static final String GET_ALL_ORDERS = "SELECT * FROM orders";
    private static final String GET_ORDER_BY_ID = "SELECT * FROM orders WHERE id=?";
    private static final String GET_ORDER_BY_USER = "SELECT * FROM orders  WHERE user_id=?";
    private static final String GET_ORDER_BY_STATUS = "SELECT * FROM orders  WHERE status_id=?";
    private static final String GET_ORDER_BY_DATE = "SELECT * FROM orders  WHERE date=?";
    private static final String GET_ORDER_BY_CAR = "SELECT * FROM orders o INNER JOIN orders_cars o_c ON o.id=o_c.order_id WHERE o_c.car_id=?";
    private static final String GET_ORDER_BY_OPTION = "SELECT * FROM orders o INNER JOIN orders_options o_p ON o.id=o_p.order_id WHERE o_p.option_id=?";
    private static final String ADD_ORDER = "INSERT INTO orders VALUE(DEFAULT, ?, ?, ?, ?)";
    private static final String ADD_ORDER_CAR = "INSERT INTO orders_cars VALUE(DEFAULT, ?, ?)";
    private static final String ADD_ORDER_OPTION = "INSERT INTO orders_options VALUE(DEFAULT, ?, ?)";
    private static final String UPDATE_ORDER_BY_ID = "UPDATE orders SET user_id=?, status_id=?, date=?, bill_id=? WHERE id=?";
    private static final String DELETE_ORDER_BY_ID = "DELETE FROM orders WHERE id=?";

    private static final String ENTITY_ID = "id";
    private static final String USER_ID = "user_id";
    private static final String CAR_ID = "car_id";
    private static final String DATE = "date";
    private static final String ORDER_STATUS_ID = "order_status_id";
    private static final String BILL_ID = "bill_id";
    private static final String OPTION_ID = "option_id";

    @Override
    public boolean create(Order order) {
        return false;
    }

    @Override
    public Order read(Integer id) {
        return null;
    }

    @Override
    public List<Order> read(User user) {
        return null;
    }

    @Override
    public List<Order> read(Car car) {
        return null;
    }

    @Override
    public List<Order> read(Date date) {
        return null;
    }

    @Override
    public List<Order> read(Option option) {
        return null;
    }

    @Override
    public List<Order> read(OrderStatus orderStatus) {
        return null;
    }

    @Override
    public List<Order> readAll() {
        return null;
    }

    @Override
    public boolean update(Order order) {
        return false;
    }

    @Override
    public boolean delete(Order order) {
        return false;
    }
}
