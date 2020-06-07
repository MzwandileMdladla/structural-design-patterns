package com.pluralsight.facade;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class JdbcFacade {

    DbSingleton instance;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
            statement.close();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("INSERT INTO Address (ID, Streetname, City) values (1, '1234 Some Street', 'Layton')");
            statement.close();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return count;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");

            while (resultSet.next()) {
                log.info(resultSet.getString(1) + resultSet.getString(2) + resultSet.getString(3));

                Address address = new Address();
                address.setId(resultSet.getString(1));
                address.setStreetName(resultSet.getString(2));
                address.setCity(resultSet.getString(3));

                addresses.add(address);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return addresses;
    }
}
