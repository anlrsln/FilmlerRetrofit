package com.example.filmlerretrofit.classes

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitParser {
    // Bu classta url'den json dosyasını alıp pars işlemi gerçekleştirilir

    companion object{
        fun getClient(baseUrl:String): Retrofit {
            return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}