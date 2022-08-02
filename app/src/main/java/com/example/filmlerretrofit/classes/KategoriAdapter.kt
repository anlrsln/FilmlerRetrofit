package com.example.filmlerretrofit.classes

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.filmlerretrofit.activities.MoviesActivity
import com.example.filmlerretrofit.databinding.KategoriCardViewBinding


class KategoriAdapter(val mContext: Context, val kategoriList: List<Kategoriler>):RecyclerView.Adapter<KategoriAdapter.KategoriCardTasarimTutucu>() {


    inner class KategoriCardTasarimTutucu(val binding:KategoriCardViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategoriCardTasarimTutucu {
        val binding = KategoriCardViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return KategoriCardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: KategoriCardTasarimTutucu, position: Int) {
        val kategori = kategoriList.get(position)
        holder.binding.kategoriNesnesi=kategori
        holder.binding.kategoriCardView.setOnClickListener {
            val intent = Intent(mContext,MoviesActivity::class.java)
            intent.putExtra("kategori",kategori)
            mContext.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return kategoriList.size
    }


}