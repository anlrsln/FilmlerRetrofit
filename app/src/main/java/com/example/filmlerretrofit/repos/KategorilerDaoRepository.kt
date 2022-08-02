package com.example.filmlerretrofit.repos

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.example.filmlerretrofit.classes.ApiUtills
import com.example.filmlerretrofit.classes.KategoriAdapter
import com.example.filmlerretrofit.classes.Kategoriler
import com.example.filmlerretrofit.classes.KategorilerListe
import com.example.filmlerretrofit.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class KategorilerDaoRepository {

    fun tumKategoriler(context: Context,dataBinding: ActivityMainBinding){
        val kategoriDao = ApiUtills.getKategorilerDaoInterface()


        kategoriDao.tumKategoriler().enqueue(object : Callback<KategorilerListe> {
            override fun onResponse(
                call: Call<KategorilerListe>?,
                response: Response<KategorilerListe>?
            ) {
                if(response!=null){
                    val liste = response.body().kategoriler
                    val adapter = KategoriAdapter(context,liste)
                    dataBinding.kategoriAdapter=adapter
                }
            }

            override fun onFailure(call: Call<KategorilerListe>?, t: Throwable?) {
                TODO("Not yet implemented")
            }
        })

    }


}