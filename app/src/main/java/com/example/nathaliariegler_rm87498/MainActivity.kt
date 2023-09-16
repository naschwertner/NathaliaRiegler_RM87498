package com.example.nathaliariegler_rm87498

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: FilmeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filmes = mutableListOf(
            FilmeModel("Matrix", "Ficção Científica", true),
            FilmeModel("Titanic", "Drama", false),
            FilmeModel("Forrest Gump", "Drama", true),
            FilmeModel("Efeito Borboleta", "Drama", false),
            FilmeModel("Gladiator", "Gênero 5", false),
            FilmeModel("A Lista de Schindler", "Drama", true),
            FilmeModel("Interestelar", "Ficção Científica", true),
        )

        adapter = FilmeAdapter(filmes)
        val recyclerView: RecyclerView = findViewById(R.id.filmesRecycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}