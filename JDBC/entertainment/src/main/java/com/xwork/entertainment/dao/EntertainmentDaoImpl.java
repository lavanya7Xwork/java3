package com.xwork.entertainment.dao;

import com.xwork.entertainment.dto.MoviesDto;

import java.sql.*;

public class EntertainmentDaoImpl  implements EntertainmentDao {

    @Override
    public void insertMovies(MoviesDto moviesDto) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded ");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/entertainment";
        String userName = "root";
        String password = "9353579405";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            String query = "INSERT INTO MOVIES(id,name,director,language) VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, moviesDto.getId());
            preparedStatement.setString(2, moviesDto.getName());
            preparedStatement.setString(3, moviesDto.getDirector());
            preparedStatement.setString(4, moviesDto.getLanguage());
            preparedStatement.execute();
            System.out.println("Inserted ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public boolean updateMovies(String name, int id) {
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
            System.out.println("connection to database is established");
            //statement is use for to write a multiple query

            Statement statement = connection.createStatement();
            //set is a keyword,when we want to specify the table names use the set keyword
            String query = "update movies set name='you' where id='4'";
            int result = statement.executeUpdate(query);
            System.out.println(result);

            if (result > 0) {
                return true;
            }
            System.out.println("Update data into database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }


    @Override
    public boolean deleteMovies(int id) {

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
        return true;
    }

    @Override
    public void read(String name, int id) {
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
            System.out.println("fetching a data from the database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getMoviesBetweenId(String id1, String id2) {


    }

    @Override
    public void getNumberOfMovies() {

    }
}