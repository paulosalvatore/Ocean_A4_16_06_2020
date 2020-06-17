package com.oceanbrasil.ocean_a4_16_06_2020

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_nome_sobrenome.*

class NomeSobrenomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nome_sobrenome)

        val informacaoDigitada = intent.getStringExtra("INFORMACAO_DIGITADA")
        Toast.makeText(this, informacaoDigitada, Toast.LENGTH_LONG).show()

        btAtualizar.setOnClickListener {
            val nome = etNome.text.trim()
            val sobrenome = etSobrenome.text.trim()

            if (nome.isBlank()) {
                etNome.error = "Digite um nome."
            } else if (sobrenome.isBlank()) {
                etSobrenome.error = "Digite um sobrenome."
            } else {
                tvNomeSobrenome.text = "$nome $sobrenome"
            }
        }

        btLimpar.setOnClickListener {
            tvNomeSobrenome.text = ""
            etNome.text.clear()
            etSobrenome.text.clear()
        }
    }
}