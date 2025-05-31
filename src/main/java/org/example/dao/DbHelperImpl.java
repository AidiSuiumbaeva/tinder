package org.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbHelperImpl implements DbHelper {

    String url = "jdbc:postgresql://localhost:5432/tinder_db";
    String user = "postgres";
    String password = "postgres";


    @Override
    public PreparedStatement getStatement(String sql) {
        try
        {
            Connection conn = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = conn.prepareStatement(sql);

            System.out.println("Соединение с PostgreSQL установлено");
            return ps;

        } catch (SQLException e) {
            throw new Error("Ошибка при подключении к базе данных PostgreSQL", e);
        }
    }

}
