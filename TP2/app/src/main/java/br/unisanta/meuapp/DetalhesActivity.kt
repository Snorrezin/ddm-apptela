package br.unisanta.meuapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        val txvTitulo = findViewById<TextView>(R.id.txv_titulo)
        val txvAutor = findViewById<TextView>(R.id.txv_autor)

        val titulo = intent.getStringExtra("titulo")
        val autor = intent.getStringExtra("autor")

        txvTitulo.text = "Título: $titulo"
        txvAutor.text = "Autor: $autor"
    }
}