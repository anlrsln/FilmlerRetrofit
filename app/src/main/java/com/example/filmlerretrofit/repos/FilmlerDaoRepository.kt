package com.example.filmlerretrofit.repos

import android.content.Context
import com.example.filmlerretrofit.classes.ApiUtills
import com.example.filmlerretrofit.classes.FilmlerAdapter
import com.example.filmlerretrofit.classes.FilmlerListe
import com.example.filmlerretrofit.databinding.ActivityMoviesBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FilmlerDaoRepository {

    fun tumFilmlerByKategori(context: Context,kategori_id:Int,dataMoviesBinding:ActivityMoviesBinding) {
        val filmlerDao = ApiUtills.getFilmlerDaoInterface()
        filmlerDao.tumFilmlerbyKategori(kategori_id).enqueue(object : Callback<FilmlerListe> {
            override fun onResponse(call: Call<FilmlerListe>?, response: Response<FilmlerListe>?) {
                if (response != null) {
                    val liste = response.body().filmler
                    val adapter = FilmlerAdapter(context, liste)
                    dataMoviesBinding.adapter = adapter
                }
            }
            override fun onFailure(call: Call<FilmlerListe>?, t: Throwable?) {
                TODO("Not yet implemented")
            }

        })
    }

}