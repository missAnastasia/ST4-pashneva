package ua.nure.pashneva.SummaryTask4.db.entity;

import java.math.BigDecimal;

public class Car {
    private String id;
    private String company;
    private String model;
    private String bodyType;
    private int enginePower;
    private int maxSpeed;
    private String color;
    private String className;
    private BigDecimal price;
    private CarStatus carStatus;
    private String image;

    public Car(String id, String company, String model, String bodyType,
               int enginePower, int maxSpeed, String color,
               String className, BigDecimal price,
               CarStatus carStatus, String image) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.bodyType = bodyType;
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.className = className;
        this.price = price;
        this.carStatus = carStatus;
        this.image = image;
    }

    public Car() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", enginePower=" + enginePower +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", className='" + className + '\'' +
                ", price=" + price +
                ", carStatus=" + carStatus +
                ", image='" + image + '\'' +
                '}';
    }
}
