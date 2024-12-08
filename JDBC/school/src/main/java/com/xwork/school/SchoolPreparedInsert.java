package com.xwork.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SchoolPreparedInsert {
        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Loaded to database");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            String url="jdbc:mysql://localhost:3306/school";
            String userName="root";
            String password="9353579405";
            String query="INSERT INTO TEACHERS(id,name,subject,language) VALUES(?,?,?,?)";
            try {
                Connection connection= DriverManager.getConnection(url,userName,password);
                System.out.println("connection  Established to database");
                //PreparedStatement is also a database.
                PreparedStatement preparedStatement=connection.prepareStatement(query);
                preparedStatement.setInt(1,31);
                preparedStatement.setString(2,"Manu");
                preparedStatement.setString(3,"hindi");
                preparedStatement.setString(4,"kannada");
                preparedStatement.execute();


                preparedStatement.setInt(1,23);
                preparedStatement.setString(2,"Jan");
                preparedStatement.setString(3,"english");
                preparedStatement.setString(4,"English");
                preparedStatement.execute();
                System.out.println("INSERT data into database");
            } catch (SQLException e) {
                throw new RuntimeException(e);

            }
        }
    }
