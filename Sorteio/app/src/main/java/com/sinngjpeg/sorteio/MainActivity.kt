package com.sinngjpeg.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view: View) {
        Log.i("BOTAO", "Botao pressionado")

        var texto = findViewById(R.id.text_sorteio) as TextView

        var numeroDaSorte = Random.nextInt(11)
        texto.setText("Numero da sorte é  $numeroDaSorte")

    }
}