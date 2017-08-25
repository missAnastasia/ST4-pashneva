package ua.nure.pashneva.SummaryTask4.db.dao;

import ua.nure.pashneva.SummaryTask4.db.entity.*;

import java.util.Date;
import java.util.List;

public interface OrderDAO {
    boolean create(Order order);
    Order read(Integer id);
    List<Order> read(User user);
    List<Order> read(Car car);
    List<Order> read(Date date);
    List<Order> read(OrderStatus orderStatus);
    List<Order> read(Option option);
    List<Order> readAll();
    boolean update(Order order);
    boolean delete(Order order);
}
