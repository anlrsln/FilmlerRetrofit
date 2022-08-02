package com.example.filmlerretrofit.classes

import com.example.filmlerretrofit.Interfaces.FilmlerDaoInterface
import com.example.filmlerretrofit.Interfaces.KategorilerDaoInterface

class ApiUtills {

    companion object{
        val BASE_URL = "http://kasimadalan.pe.hu/"
        fun getFilmlerDaoInterface():FilmlerDaoInterface{
        return RetrofitParser.getClient(BASE_URL).create(FilmlerDaoInterface::class.java)
        }
        fun getKategorilerDaoInterface():KategorilerDaoInterface{
            return RetrofitParser.getClient(BASE_URL).create(KategorilerDaoInterface::class.java)
        }
    }



}