package ua.nure.pashneva.SummaryTask4.db.dao;

import ua.nure.pashneva.SummaryTask4.db.entity.Car;
import ua.nure.pashneva.SummaryTask4.db.entity.CarStatus;

import java.util.List;

public interface CarDAO {
    boolean create(Car car);
    Car read(String id);
    List<Car> read(CarStatus carStatus);
    List<Car> readAll();
    boolean update(Car car);
    boolean delete(Car car);
}
