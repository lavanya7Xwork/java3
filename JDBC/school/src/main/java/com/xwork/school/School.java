package com.xwork.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class School {
        public static void main(String[] args) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Load the Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            try {
                Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","9353579405");
                System.out.println("connection to database is established");
                Statement statement=connection.createStatement();
                String query="INSERT INTO TEACHERS VALUES(1,'Lavanya','Kannada','Kannada')";
                statement.execute(query);
                String query1="INSERT INTO TEACHERS VALUES(2,'sanju','English','English')";
                statement.execute(query1);
                String query2="INSERT INTO TEACHERS VALUES(3,'kushi','Hindi','Hindi')";
                statement.execute(query2);
                String query3="INSERT INTO TEACHERS VALUES(4,'jannu','Science','English')";
                statement.execute(query3);
                String query4="INSERT INTO TEACHERS VALUES(5,'Manasa','Social','English')";
                statement.execute(query4);
                String query6="INSERT INTO TEACHERS VALUES(6,'Prithi','History','English')";
                statement.execute(query6);
                String query7="INSERT INTO TEACHERS VALUES(7,'pallavi','Economic','Kannada')";
                statement.execute(query7);
                String query8="INSERT INTO TEACHERS VALUES(8,'Appu','spcial KANNADA','Halekannada')";
                statement.execute(query8);
                System.out.println("INSERT data into database");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }



