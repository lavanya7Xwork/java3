package com.xwork.entertainment.dao;

import com.xwork.entertainment.dto.MoviesDto;

public interface EntertainmentDao {

    public  void insertMovies(MoviesDto moviesDto);

    boolean updateMovies(String name, int id);

    boolean deleteMovies(int id);

    void read(String name,int id);

    void getMoviesBetweenId(String id1,String id2);

    void getNumberOfMovies();






}
