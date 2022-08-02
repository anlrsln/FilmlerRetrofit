package com.example.filmlerretrofit.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.filmlerretrofit.R
import com.example.filmlerretrofit.databinding.ActivityMainBinding
import com.example.filmlerretrofit.viewmodel.MainPageViewModel



class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding
    private lateinit var viewModel: MainPageViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        // ViewModel Activity bağladık
        val tempViewModel : MainPageViewModel by viewModels()
        viewModel = tempViewModel

        // acivity_main.xml'den MainActivity'e erişim için MainActivity parçası gönderdik
        dataBinding.mainActivityNesne=this


        // Toolbar'a erişip title' ı gönderdik
        dataBinding.mainToolbarTitle = "Filmler"


        // tumKategoriler fonksiyonumuzu viewModel kullanarak MainPAgeViewModel'a, ordan da KategorilerDaoRepository'e taşıdık
        viewModel.tumKategoriler(this,dataBinding)


    }

}