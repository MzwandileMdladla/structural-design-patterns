package com.pluralsight.facade;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Slf4j
public class JdbcDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        try {
            Connection connection = instance.getConnection();

            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");

            log.info("Table created.");
            statement.close();

            statement = connection.createStatement();
            int count = statement.executeUpdate("INSERT INTO Address (ID, Streetname, City)" + "values (1, '1234 Some Street', 'Layton')");
            log.info(count + " record(s) created.");

            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");

            while (resultSet.next()) {
                log.info(resultSet.getString(1) + resultSet.getString(2) + resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
