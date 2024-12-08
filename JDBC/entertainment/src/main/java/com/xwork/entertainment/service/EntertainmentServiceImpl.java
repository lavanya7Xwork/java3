package com.xwork.entertainment.service;

import com.xwork.entertainment.dao.EntertainmentDao;
import com.xwork.entertainment.dao.EntertainmentDaoImpl;
import com.xwork.entertainment.dto.MoviesDto;

public class EntertainmentServiceImpl implements EntertainmentService{

    @Override
    public void insertMovies(MoviesDto moviesDto) {
        if(moviesDto!=null && moviesDto.getName()!=null &&!moviesDto.getName().isEmpty()){
            EntertainmentDao entertainmentDao=new EntertainmentDaoImpl();
            entertainmentDao.insertMovies(moviesDto);
        }else{
            System.out.println("movie name not found");
        }
    }
}
