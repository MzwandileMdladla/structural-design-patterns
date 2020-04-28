package com.pluralsight.bridge;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;

@Slf4j
public class BridgeEverydayDemo {

    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

            Connection conn = DriverManager.getConnection(dbUrl);

            Statement sta = conn.createStatement();

            sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20)," + " City VARCHAR(20))");

            log.info("Table created");
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
    }
}
