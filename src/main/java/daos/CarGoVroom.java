package daos;

import models.Car;
import models.DataTransfer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class CarGoVroom implements Access{
    public Object findById(int id) {
        Connection connection = DataTransfer.getConnected();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM car WHERE id=" + id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List findAll() {
        Connection connection = DataTransfer.getConnected();
        ArrayList<Car> cars = new ArrayList<Car>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM car");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public Object update(Object dto) {
        return null;
    }

    public Object create(Object dto) {
        return null;
    }

    public void delete(int id) {

    }
}
