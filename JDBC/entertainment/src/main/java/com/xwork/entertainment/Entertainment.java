package com.xwork.entertainment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Entertainment {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Load the Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/entertainment","root","9353579405");
            System.out.println("connection to database is established");
            Statement statement=connection.createStatement();
            String query="INSERT INTO MOVIES VALUES(1,'KGF','lavanya','Kannada')";
            statement.execute(query);
            String query1="INSERT INTO MOVIES VALUES(2,'madakari','you','Kannada')";
            statement.execute(query1);
            String query2="INSERT INTO MOVIES VALUES(3,'Key','lavanya','Kannada')";
            statement.execute(query2);
            String query3="INSERT INTO MOVIES VALUES(4,'hunter','manasa','Kannada')";
            statement.execute(query3);
            String query4="INSERT INTO MOVIES VALUES(5,'RRR','Sanju','Kannada')";
            statement.execute(query4);
            String query6="INSERT INTO MOVIES VALUES(6,'LOVE','sri','English')";
            statement.execute(query6);
            String query7="INSERT INTO MOVIES VALUES(7,'Mine','lavanya','Kannada')";
            statement.execute(query7);
            String query8="INSERT INTO MOVIES VALUES(8,'y','leka','Hindi')";
            statement.execute(query8);
            System.out.println("INSERT data into database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




    }
}
