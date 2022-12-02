package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private final String URL = "";
    private final String USERNAME = "";
    private final String PASSWORD = "";

    private Connection connection;
    Driver driver;

    public Util() {
        try {
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            System.out.println("Соединение не установлено");
        }
    }

    public Connection getConnection()
    {
        return connection;
    }
}