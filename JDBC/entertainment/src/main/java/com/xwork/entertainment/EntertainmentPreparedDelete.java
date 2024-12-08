package com.xwork.entertainment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EntertainmentPreparedDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Load to database");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/entertainment";
        String userName="root";
        String password="9353579405";

        try {
            Connection connection=DriverManager.getConnection(url,userName,password);
            String query="delete from movies where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,5);
            preparedStatement.execute();
            System.out.println("delete the data using prepared statement");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
