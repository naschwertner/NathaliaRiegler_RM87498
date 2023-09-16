package com.example.nathaliariegler_rm87498

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmeAdapter(private val filmes: MutableList<FilmeModel>) : RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder>() {

    class FilmeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val iconImageButton: ImageButton = itemView.findViewById(R.id.iconBotao)
        val nomeTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val generoTextView: TextView = itemView.findViewById(R.id.genreTextView)
        val xButton: Button = itemView.findViewById(R.id.XButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.filme_item_list, parent, false)
        return FilmeViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        val filme = filmes[position]
        holder.nomeTextView.text = filme.nome
        holder.generoTextView.text = filme.genero
        holder.iconImageButton.setImageResource(
            if (filme.recomendaria) R.drawable.like
            else R.drawable.dislike
        )

        holder.xButton.setOnClickListener {
            filmes.removeAt(position)
            notifyItemRemoved(position)
        }
    }

    override fun getItemCount(): Int {
        return filmes.size
    }
}
