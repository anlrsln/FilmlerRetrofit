package com.example.filmlerretrofit.classes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Filmler(@SerializedName("film_id") @Expose val film_id:Int,
                   @SerializedName("film_ad") @Expose val film_ad:String,
                   @SerializedName("film_yil") @Expose val film_yil:String,
                   @SerializedName("film_resim") @Expose val film_resim:String,
                   @SerializedName("kategori") @Expose val kategori:Kategoriler,
                   @SerializedName("yonetmen") @Expose val yonetmen : Yonetmenler,
                   @SerializedName("success") @Expose val success : Int):Serializable {
}