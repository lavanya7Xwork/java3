package com.xwork.entertainment;

import com.xwork.entertainment.dao.EntertainmentDao;
import com.xwork.entertainment.dao.EntertainmentDaoImpl;
import com.xwork.entertainment.dto.MoviesDto;
import com.xwork.entertainment.service.EntertainmentService;
import com.xwork.entertainment.service.EntertainmentServiceImpl;


public class EntertainmentRunner {
    public static void main(String[] args) {
        MoviesDto moviesDto=new MoviesDto();
        moviesDto.setId(15);
        moviesDto.setName("");
        moviesDto.setDirector("Anusha");
        moviesDto.setLanguage("Telugu");
        EntertainmentDao entertainmentDao=new EntertainmentDaoImpl();
        entertainmentDao.insertMovies(moviesDto);
        boolean result= entertainmentDao.updateMovies("me",4);
        System.out.println(result);

        entertainmentDao.deleteMovies(15);
        boolean result1=entertainmentDao.deleteMovies(15);
        System.out.println(result1);
        //database logic
       // EntertainmentService entertainmentService=new EntertainmentServiceImpl();
       // entertainmentService.insertMovies(moviesDto);
    }
}
