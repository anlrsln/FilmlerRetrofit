package com.example.filmlerretrofit.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.filmlerretrofit.databinding.ActivityMoviesBinding
import com.example.filmlerretrofit.repos.FilmlerDaoRepository




class MoviesPageViewModel  ():ViewModel() {

    var frepo = FilmlerDaoRepository()


    fun tumFilmlerbyKategori(context: Context,kategori_id:Int,dataMoviesBinding: ActivityMoviesBinding){
        frepo.tumFilmlerByKategori(context,kategori_id,dataMoviesBinding)
    }


}