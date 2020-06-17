package com.oceanbrasil.ocean_a4_16_06_2020

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botão Atualizar
        btAtualizar.setOnClickListener {
            val informacaoDigitada = etInfo.text.trim()

            if (informacaoDigitada.isNotBlank()) {
                tvInfo.text = informacaoDigitada.toString()

                Toast.makeText(this, "Informação atualizada com sucesso.", Toast.LENGTH_LONG).show()
            } else {
                etInfo.error = "Digite uma informação."
            }
        }

        // Botão Limpar
        btLimpar.setOnClickListener {
            tvInfo.text = ""
            etInfo.setText("")
//            etInfo.text.clear()
        }

        // Botão Abrir Activity
        btAbrirActivity.setOnClickListener {
            val informacaoDigitada = etInfo.text.trim().toString()

            if (informacaoDigitada.isNotBlank()) {
                val abrirActivityIntent = Intent(this, NomeSobrenomeActivity::class.java)
                abrirActivityIntent.putExtra("INFORMACAO_DIGITADA", informacaoDigitada)
                startActivity(abrirActivityIntent)
            } else {
                etInfo.error = "Digite uma informação."
            }
        }
    }
}
