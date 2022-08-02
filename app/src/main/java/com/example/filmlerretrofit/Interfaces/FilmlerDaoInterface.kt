package com.example.filmlerretrofit.Interfaces

import com.example.filmlerretrofit.classes.FilmlerListe
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface FilmlerDaoInterface {
    // Web Servis Metodları


    @GET("filmler/tum_filmler.php")
    fun tumFilmler():Call<FilmlerListe>


    @POST("filmler/filmler_by_kategori_id.php")
    @FormUrlEncoded
    fun tumFilmlerbyKategori(@Field("kategori_id") kategori_id:Int):Call<FilmlerListe>


}