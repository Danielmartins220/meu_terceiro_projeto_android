package com.example.meuterceiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonG6: Button = findViewById<Button>(R.id.buttonG6)

        val buttonG12: Button = findViewById<Button>(R.id.buttonG12)

        val buttonG20: Button = findViewById<Button>(R.id.buttonG20)

        buttonG6.setOnClickListener {
            //Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
            rolarDados(6)

        }
         buttonG12.setOnClickListener {
             rolarDados(12)
         }
        buttonG20.setOnClickListener {
            rolarDados(20)
        }

    }
    private fun rolarDados(lados: Int){
        val rolagem = (1..lados).random()
        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem.toString()
    }
}

