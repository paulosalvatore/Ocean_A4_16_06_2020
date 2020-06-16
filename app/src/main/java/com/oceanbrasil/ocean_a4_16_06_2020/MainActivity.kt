package com.oceanbrasil.ocean_a4_16_06_2020

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preparacaoTela()
    }

    private fun preparacaoTela() {
        btAtualizar.setOnClickListener {
//            val informacaoDigitada = etInfo.text
//            tvInfo.text = informacaoDigitada

            tvInfo.text = etInfo.text.toString()
        }
    }
}
