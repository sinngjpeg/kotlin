package com.sinngjpeg.frasedodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView

    val frases = arrayListOf<String>(
            "Se você é uma dessas pessoas que não tem sorte, quando vir a luz no fim do túnel...corra, pois é um trem.",
            "Pra alguém me amar só se for por amor mesmo, porque rico e bonito eu nem sou.",
            "Se até um pé-na-bunda te dá aquele empurrão na vida, porque desanimar com as tragédias que acontecem conosco?",
            "Eu nunca, jamais desisto de algo! Na verdade, eu nem tento.",
            "Que vontade de voar... voar o meu pé na sua cara."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById<TextView>(R.id.txt_frase) as TextView
    }

    fun gerarFrase(view: View) {

        val totalItensArray = frases.size
        val numeroAleatorio = Random.nextInt(totalItensArray)

        texto.setText(frases[numeroAleatorio])
    }


}