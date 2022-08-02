package com.example.filmlerretrofit.classes

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.filmlerretrofit.activities.DetailActivity
import com.example.filmlerretrofit.databinding.FilmCardViewBinding

import com.squareup.picasso.Picasso

class FilmlerAdapter(val mContext: Context,val filmlerListe:List<Filmler>):RecyclerView.Adapter<FilmlerAdapter.FilmCardTasarimTutucu>(){

    inner class FilmCardTasarimTutucu(val binding :FilmCardViewBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmCardTasarimTutucu {
        val binding = FilmCardViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FilmCardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: FilmCardTasarimTutucu, position: Int) {
        val film = filmlerListe[position]

        val url = "http://kasimadalan.pe.hu/filmler/resimler/${film.film_resim}"
        Picasso.get().load(url).into(holder.binding.imageView2)

        holder.binding.filmNesnesi = film

        holder.binding.filmCardView.setOnClickListener {
            val intent = Intent(mContext,DetailActivity::class.java)
            intent.putExtra("film",film)
            mContext.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return filmlerListe.size
    }


}