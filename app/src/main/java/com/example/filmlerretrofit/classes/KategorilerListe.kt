package com.example.filmlerretrofit.classes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class KategorilerListe(@SerializedName("kategoriler") @Expose val kategoriler: List<Kategoriler>,
                            @SerializedName("success") @Expose val success:Int):Serializable {
}