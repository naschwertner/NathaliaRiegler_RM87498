package com.example.nathaliariegler_rm87498

import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmeViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val nomeTextView: TextView = view.findViewById(R.id.nameTextView)
    val generoTextView: TextView = view.findViewById(R.id.genreTextView)
    val xButton: Button = view.findViewById(R.id.XButton)
    val iconImageButton: ImageButton = view.findViewById(R.id.iconBotao)
}
