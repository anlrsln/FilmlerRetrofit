package com.example.filmlerretrofit.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.filmlerretrofit.databinding.ActivityMainBinding
import com.example.filmlerretrofit.repos.KategorilerDaoRepository



class MainPageViewModel () : ViewModel(){
    var krepo = KategorilerDaoRepository()

    fun tumKategoriler(context: Context,dataBinding: ActivityMainBinding){
        krepo.tumKategoriler(context,dataBinding)
    }



}