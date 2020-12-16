package com.sinngjpeg.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btCalcular(view: View) {
        val precoAlcool = edt_alcool.text.toString()
        val precoGasolina = edt_gasolina.text.toString()
        val validaCampos = validarCampos(precoAlcool, precoGasolina)
        if (validaCampos) {
            calcularMelhorPreco(precoAlcool, precoGasolina)
        } else {
            text_opcao.setText("Prencha os campos primeiro!")
        }


        Log.i("RESULTADO", "texto recuperado : $precoAlcool , $precoGasolina")
    }

    fun validarCampos(precoAlcool: String, precoGasolina: String): Boolean {
        var camposValidados: Boolean = true
        if (precoAlcool == null || precoAlcool.equals("")) {
            camposValidados = false
        } else if (precoGasolina == null || precoGasolina.equals("")) {
            camposValidados = false

        }
        return camposValidados
    }

    fun calcularMelhorPreco(precoAlcool: String, precoGasolina: String) {
        val valorAlcool = precoAlcool.toDouble()
        val valorGasolina = precoGasolina.toDouble()

        val resultadoPreco = valorAlcool / valorGasolina

        if (resultadoPreco >= 0.7) {
            text_opcao.setText("Melhor usar Gasolina")
        } else
            text_opcao.setText("Melhor utilizar Alcool")
    }
}