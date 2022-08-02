package com.example.filmlerretrofit.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.filmlerretrofit.R
import com.example.filmlerretrofit.classes.Filmler
import com.example.filmlerretrofit.databinding.ActivityDetailBinding
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityDetailBinding
    private lateinit var film: Filmler


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_detail)


        dataBinding.detailActivityNesne=this

        //MoviesActivity'den tıklanılan film nesnesine eriştik
        film = intent.getSerializableExtra("film") as Filmler
        dataBinding.toolbar.title=film.film_ad

        // film nesnemizin image'ını url'e ekledik ve Picasso kullanarak resmimizi View'a bağladık
        val url = "http://kasimadalan.pe.hu/filmler/resimler/${film.film_resim}"
        Picasso.get().load(url).into(dataBinding.filmResimView)

    }


    fun getFilm():Filmler{
        return film
    }


}