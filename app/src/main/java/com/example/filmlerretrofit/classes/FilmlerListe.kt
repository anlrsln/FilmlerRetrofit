package com.example.filmlerretrofit.classes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class FilmlerListe(@SerializedName("filmler") @Expose var filmler:List<Filmler>,
                        @SerializedName("success") @Expose var success: Int ) {
}