package com.example.filmlerretrofit.classes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Kategoriler(@SerializedName("kategori_id") @Expose val kategori_id:Int,
                       @SerializedName("kategori_ad") @Expose val kategori_ad:String):Serializable {
}