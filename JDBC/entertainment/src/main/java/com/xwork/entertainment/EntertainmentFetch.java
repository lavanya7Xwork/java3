package com.xwork.entertainment;

import java.sql.*;

public class EntertainmentFetch {
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
        try {
            Connection connection=DriverManager.getConnection(url,userName,password);
            System.out.println("connection database Established ");
            Statement statement=connection.createStatement();
            String query="select *from movies";
            ResultSet result=statement.executeQuery(query);
            System.out.println(result);
            //if can use only one records
            //while can use for multiple records
            while (result.next()) {

                System.out.println("****************movies details***********");
                System.out.println(result.getString("name"));
                System.out.println(result.getString("director"));
                System.out.println(result.getString("id"));
                System.out.println(result.getString("language"));
            }
            String query1="select *from movies order by id desc";
            ResultSet result1=statement.executeQuery(query1);
            System.out.println(result1);
            while (result1.next()){
                System.out.println("****************movies info***********");
                System.out.println(result1.getString("name"));
                System.out.println(result1.getString("director"));
                System.out.println(result1.getString("id"));
                System.out.println(result1.getString("language"));
            }
            System.out.println("fetching a data from the database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
