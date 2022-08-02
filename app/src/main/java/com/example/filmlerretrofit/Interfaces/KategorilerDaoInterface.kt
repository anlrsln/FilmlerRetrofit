package com.example.filmlerretrofit.Interfaces

import com.example.filmlerretrofit.classes.FilmlerListe
import com.example.filmlerretrofit.classes.KategorilerListe
import retrofit2.Call
import retrofit2.http.GET

interface KategorilerDaoInterface {

    @GET("filmler/tum_kategoriler.php")
    fun tumKategoriler(): Call<KategorilerListe>

}