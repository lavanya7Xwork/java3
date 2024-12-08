package com.xwork.entertainment;

import java.sql.*;

public class EntertainmentPreparedFetch {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded to database");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/entertainment";
        String userName = "root";
        String password = "9353579405";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("connection is established");
            String query = "select * from movies where name=? and id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,"LOVE");
            preparedStatement.setInt(2,6);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));
            }
                System.out.println("Fetched data from the prepared statement");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
