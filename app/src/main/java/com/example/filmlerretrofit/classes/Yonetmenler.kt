package com.example.filmlerretrofit.classes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Yonetmenler(@SerializedName("yonetmen_id") @Expose val yonetmen_id:Int,
                       @SerializedName("yonetmen_ad") @Expose val yonetmen_ad:String): Serializable {
}