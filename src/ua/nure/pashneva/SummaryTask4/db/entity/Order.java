package ua.nure.pashneva.SummaryTask4.db.entity;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private User user;
    private Date date;
    private OrderStatus orderStatus;
    private List<Car> items;
    private List<Option> options;
    private Bill bill;

    public Order(User user, Date date, OrderStatus orderStatus, List<Car> items, List<Option> options, Bill bill) {
        this.user = user;
        this.date = date;
        this.orderStatus = orderStatus;
        this.items = items;
        this.options = options;
        this.bill = bill;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Car> getItems() {
        return items;
    }

    public void setItems(List<Car> items) {
        this.items = items;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
