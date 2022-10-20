package com.example.pokedex.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.squareup.picasso.Picasso

class PokeAdapter : RecyclerView.Adapter<PokeAdapter.PokeViewHolder>() {

    inner class PokeViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val layout = layoutInflater.inflate(R.layout.poke_item_view, parent, false);
        return PokeViewHolder(layout);
    }

    override fun onBindViewHolder(holder: PokeViewHolder, position: Int) {

        val url = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/39.png";

        val imageView : ImageView = holder.itemView.findViewById(R.id.poke_image);

        Picasso.get().load(url).into(imageView);
    }

    override fun getItemCount(): Int {
        return 11;
    }
}