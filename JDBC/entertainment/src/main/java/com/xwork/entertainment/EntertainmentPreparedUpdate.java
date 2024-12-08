package com.xwork.entertainment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EntertainmentPreparedUpdate {
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
          Connection connection= DriverManager.getConnection(url,userName,password);
            //create statement or platform
            String query="UPDATE MOVIES set name=?,director=? where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,"through");
            preparedStatement.setString(2,"xxx");
            preparedStatement.setInt(3,12);
            preparedStatement.setString(2,"hindi");
            preparedStatement.execute();
            System.out.println("update data into database using prepared ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
