package com.xwork.entertainment;

import java.sql.*;

public class EntertainmentPreparedInsert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded to database");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/entertainment";
        String userName="root";
        String password="9353579405";
        String query="INSERT INTO MOVIES(id,name,director,language) VALUES(?,?,?,?)";
        try {
            Connection connection= DriverManager.getConnection(url,userName,password);
            System.out.println("@@@@@@@@@@@@@@@@@connection database Established@@@@@@@@@@@@@@@@");
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,20);
            preparedStatement.setString(2,"Milana");
            preparedStatement.setString(3,"Appu");
            preparedStatement.setString(4,"kannada");
            preparedStatement.execute();
            preparedStatement.setInt(1,10);
            preparedStatement.setString(2,"Shadow");
            preparedStatement.setString(3,"wertyui");
            preparedStatement.setString(4,"English");
            preparedStatement.execute();
            System.out.println("INSERT data into database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            
        }
    }
}
