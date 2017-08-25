package ua.nure.pashneva.SummaryTask4.db.dao.mysql;

import ua.nure.pashneva.SummaryTask4.db.DBConnection;
import ua.nure.pashneva.SummaryTask4.db.dao.CarDAO;
import ua.nure.pashneva.SummaryTask4.db.entity.Car;
import ua.nure.pashneva.SummaryTask4.db.entity.CarStatus;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MysqlCarDAO implements CarDAO {

    private static final String GET_ALL_CARS = "SELECT * FROM (((cars c INNER JOIN cars_lang c_l ON c.id=c_l.car_id) INNER JOIN descriptions d ON c.description_id=d.id) INNER JOIN descriptions_lang d_l ON d.id=d_l.description_id)";
    private static final String GET_CAR_BY_ID = "SELECT * FROM (((cars c INNER JOIN cars_lang c_l ON c.id=c_l.car_id) INNER JOIN descriptions d ON c.description_id=d.id) INNER JOIN descriptions_lang d_l ON d.id=d_l.description_id) WHERE c.id=?";
    private static final String GET_CAR_BY_STATUS = "SELECT * FROM (((cars c INNER JOIN cars_lang c_l ON c.id=c_l.car_id) INNER JOIN descriptions d ON c.description_id=d.id) INNER JOIN descriptions_lang d_l ON d.id=d_l.description_id)  WHERE c.car_status_id=?";

    private static final String ADD_CAR = "INSERT INTO cars VALUE(DEFAULT, ?, ?, ?, ?, ?)";
    private static final String ADD_CAR_LANG = "INSERT INTO cars_lang VALUE(DEFAULT, ?, ?, ?, ?, ?)";
    private static final String ADD_DESCRIPTION = "INSERT INTO descriptions VALUE(DEFAULT, ?)";
    private static final String ADD_DESCRIPTION_LANG = "INSERT INTO descriptions_lang VALUE(DEFAULT, ?, ?, ?, ?)";

    private static final String UPDATE_CAR_BY_ID = "UPDATE cars SET image=?, company=?, model=?, description_id=?, car_status_id=? WHERE id=?";
    private static final String UPDATE_CAR_LANG_BY_ID = "UPDATE cars_lang SET car_id=?, lang_id=?, class=?, price=?, color=? WHERE id=?";
    private static final String UPDATE_DESCRIPTION_BY_ID = "UPDATE descriptions SET engine_power=? WHERE id=?";
    private static final String UPDATE_DESCRIPTION_LANG_BY_ID = "UPDATE descriptions_lang SET description_id=?, lang_id=?, body_type=?, max_speed=? WHERE id=?";

    private static final String DELETE_CAR_BY_ID = "DELETE FROM cars WHERE id=?";

    private static final String ENTITY_ID = "c.id";
    private static final String IMAGE = "c.image";
    private static final String COMPANY = "c.company";
    private static final String MODEL = "c.model";
    private static final String C_DESCRIPTION_ID = "c.description_id";
    private static final String D_L_DESCRIPTION_ID = "d_l.description_id";
    private static final String CAR_STATUS_ID = "c.car_status_id";
    private static final String CAR_ID = "c_l.car_id";
    private static final String LANG_ID = "c_l.lang_id";
    private static final String CLASS = "c_l.class";
    private static final String PRICE = "c_l.price";
    private static final String COLOR = "c_l.color";
    private static final String ENGINE_POWER = "d.engine_power";
    private static final String BODY_TYPE = "d_l.body_type";
    private static final String MAX_SPEED  = "d_l.max_speed";

    @Override
    public boolean create(Car car) {
        return false;
    }

    @Override
    public Car read(String id) {
        return null;
    }

    @Override
    public List<Car> read(CarStatus carStatus) {
        return null;
    }

    @Override
    public List<Car> readAll() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<Car> cars = new ArrayList<>();

        try {
            connection = DBConnection.getInstance().getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(GET_ALL_CARS);

            while (resultSet.next()) {
                Car car = extractCar(resultSet);
                cars.add(car);
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            DBConnection.getInstance().close(connection, statement, resultSet);
        }
        return cars;
    }

    @Override
    public boolean update(Car car) {
        return false;
    }

    @Override
    public boolean delete(Car car) {
        return false;
    }

    private Car extractCar(ResultSet resultSet) {
        Car car = new Car();
        try {
            car.setId(resultSet.getString(ENTITY_ID));
            car.setBodyType(resultSet.getString(BODY_TYPE));
            car.setCarStatus(CarStatus.getCarStatus(resultSet.getInt(CAR_STATUS_ID)));
            car.setClassName(resultSet.getString(CLASS));
            car.setColor(resultSet.getString(COLOR));
            car.setCompany(resultSet.getString(COMPANY));
            car.setModel(resultSet.getString(MODEL));
            car.setEnginePower(resultSet.getInt(ENGINE_POWER));
            car.setMaxSpeed(resultSet.getInt(MAX_SPEED));
            car.setPrice(BigDecimal.valueOf(resultSet.getDouble(PRICE)));

        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return car;
    }
}
