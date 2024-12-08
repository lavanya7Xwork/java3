package com.xwork.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateSchool {

        public static void main(String[] args) {

            //update operation;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("load to database");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            //static  it contain url ps un
            String url="jdbc:mysql://localhost:3306/school";
            String userName="root";
            String password="9353579405";
            try {
                Connection connection= DriverManager.getConnection(url,userName,password);
                System.out.println("connection to database is established");
                //statement is use for to write a multiple query

                Statement statement=connection.createStatement();
                String query4="INSERT INTO TEACHERS VALUES(10,'Lavanya','Kannada','Kannada')";
                //set is a keyword,when we want to specify the table names use the set keyword
                String query="update teachers set name='you' where id='3'";
                int result=statement.executeUpdate(query4);
                System.out.println(result);
                System.out.println("Update data into database");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
