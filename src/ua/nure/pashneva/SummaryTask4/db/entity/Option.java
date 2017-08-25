package ua.nure.pashneva.SummaryTask4.db.entity;

import java.math.BigDecimal;

public class Option {
    private int id;
    private String name;
    private BigDecimal price;

    public Option(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Option() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
