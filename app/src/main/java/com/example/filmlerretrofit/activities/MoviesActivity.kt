package com.example.filmlerretrofit.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.filmlerretrofit.R
import com.example.filmlerretrofit.classes.*
import com.example.filmlerretrofit.databinding.ActivityMoviesBinding
import com.example.filmlerretrofit.viewmodel.MoviesPageViewModel




class MoviesActivity : AppCompatActivity() {
    private lateinit var dataMoviesBinding:ActivityMoviesBinding
    private lateinit var viewModel: MoviesPageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataMoviesBinding = DataBindingUtil.setContentView(this,R.layout.activity_movies)


        // ViewModel nesnesini oluşturduk
        val tempViewModel : MoviesPageViewModel by viewModels()
        viewModel=tempViewModel

        // Kategori nesnesine eriştik
        val kategori = intent.getSerializableExtra("kategori") as Kategoriler


        dataMoviesBinding.movieToolbar= kategori.kategori_ad
        setSupportActionBar(dataMoviesBinding.toolbarFilm)
        dataMoviesBinding.recyclerViewFilmler.setHasFixedSize(true)



        // tumFilmlerByKategori fonksiyonumuzu viewModel kullanarak MoviesPAgeViewModel'a, ordan da FilmlerDaoRepository'e taşıdık
        // daha düzenli bir yapıda oluşturduk
        viewModel.frepo.tumFilmlerByKategori(this,kategori.kategori_id,dataMoviesBinding)


    }

}