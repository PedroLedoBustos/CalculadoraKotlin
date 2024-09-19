package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var tvCasilla= findViewById<TextView>(R.id.tv_texto)
        var tvCasillaMin= findViewById<TextView>(R.id.tv_textooculto)

        var valor1= 0.0
        var valor2= 0.0
        var operacion = "nula"
        var igualdadEjecutada= false

        val zero= findViewById<Button>(R.id.bt_zero)
        zero.setOnClickListener {
            val num = 0
            if (igualdadEjecutada){
                tvCasilla.text="0"
                igualdadEjecutada=false
            }
            agregarNumero(tvCasilla,num)
        }

        val one= findViewById<Button>(R.id.bt_one)
        one.setOnClickListener {
            val num = 1
            if (igualdadEjecutada){
                tvCasilla.text="0"
                igualdadEjecutada=false
            }
            agregarNumero(tvCasilla,num)
        }
        val two= findViewById<Button>(R.id.bt_two)
        two.setOnClickListener {
            val num = 2
            if (igualdadEjecutada){
                tvCasilla.text="0"
                igualdadEjecutada=false
            }
            agregarNumero(tvCasilla,num)
        }

        val three= findViewById<Button>(R.id.bt_three)
        three.setOnClickListener {
            val num = 3
            if (igualdadEjecutada){
                tvCasilla.text="0"
                igualdadEjecutada=false
            }
            agregarNumero(tvCasilla,num)
        }

       val four= findViewById<Button>(R.id.bt_four)
        four.setOnClickListener {
            val num = 4
            if (igualdadEjecutada){
                tvCasilla.text="0"
                igualdadEjecutada=false
            }
            agregarNumero(tvCasilla,num)
        }

        val five= findViewById<Button>(R.id.bt_five)
        five.setOnClickListener {
            val num = 5
            if (igualdadEjecutada){
                tvCasilla.text="0"
                igualdadEjecutada=false
            }
            agregarNumero(tvCasilla,num)
        }

        val six= findViewById<Button>(R.id.bt_six)
        six.setOnClickListener {
            val num = 6
            if (igualdadEjecutada){
                tvCasilla.text="0"
                igualdadEjecutada=false
            }
            agregarNumero(tvCasilla,num)
        }

        val seven= findViewById<Button>(R.id.bt_seven)
        seven.setOnClickListener {
            val num = 7
            if (igualdadEjecutada){
                tvCasilla.text="0"
                igualdadEjecutada=false
            }
            agregarNumero(tvCasilla,num)
        }

        val eight= findViewById<Button>(R.id.bt_eight)
        eight.setOnClickListener {
            val num = 8
            if (igualdadEjecutada){
                tvCasilla.text="0"
                igualdadEjecutada=false
            }
            agregarNumero(tvCasilla,num)
        }

        val nine= findViewById<Button>(R.id.bt_nine)
        nine.setOnClickListener {
            val num= 9
            if (igualdadEjecutada){
                tvCasilla.text="0"
                igualdadEjecutada=false
            }
            agregarNumero(tvCasilla, num)
        }

        val reset= findViewById<Button>(R.id.bt_reset)
        reset.setOnClickListener {
            val texto= "0"
            tvCasilla.text = texto
            valor1= 0.0
            valor2= 0.0
            tvCasillaMin.text= texto
            operacion= "nula"
        }

        val sumar= findViewById<Button>(R.id.bt_suma)
        sumar.setOnClickListener {
            operacion= "+"
            valor1= tvCasilla.text.toString().toDouble()
            tvCasilla.text = "0"
            val textoMin= "$valor1 +"
            tvCasillaMin.text = textoMin

        }

        val restar= findViewById<Button>(R.id.bt_restar)
        restar.setOnClickListener {
            operacion= "-"
            valor1= tvCasilla.text.toString().toDouble()
            tvCasilla.text = "0"
            val textoMin= "$valor1 -"
            tvCasillaMin.text = textoMin


        }
        val multiplicar= findViewById<Button>(R.id.bt_multi)
        multiplicar.setOnClickListener {
            operacion= "*"
            valor1= tvCasilla.text.toString().toDouble()
            tvCasilla.text = "0"
            val textoMin= "$valor1 *"
            tvCasillaMin.text = textoMin

        }
        val dividir= findViewById<Button>(R.id.bt_dividir)
        dividir.setOnClickListener {
            operacion= "/"
            valor1= tvCasilla.text.toString().toDouble()
            tvCasilla.text = "0"
            val textoMin= "$valor1 /"
            tvCasillaMin.text = textoMin

        }

        val punto= findViewById<Button>(R.id.bt_punto)
        punto.setOnClickListener {
            val texto= tvCasilla.text.toString()
            if(!texto.contains(".")){
            val resultado= tvCasilla.text.toString()+"."
                tvCasilla.text = resultado
            }
        }

        val igual= findViewById<Button>(R.id.bt_igual)
        igual.setOnClickListener {
            if(operacion != "nula"){
                valor2= tvCasilla.text.toString().toDouble()

                if(operacion == "+"){
                    val resultado= valor1 + valor2
                    val resultadoTexto= resultado.toString()
                    tvCasilla.text = resultadoTexto
                    operacion= "nula"
                    val textoMin= "${tvCasillaMin.text.toString()}  $valor2 = $resultadoTexto"
                    tvCasillaMin.text = textoMin
                }
                if(operacion == "-"){
                    val resultado= valor1 - valor2
                    val resultadoTexto= resultado.toString()
                    tvCasilla.text = resultadoTexto
                    operacion= "nula"
                    val textoMin= "${tvCasillaMin.text.toString()}  $valor2 = $resultadoTexto"
                    tvCasillaMin.text = textoMin
                }
                if(operacion == "*"){
                    val resultado= valor1 * valor2
                    val resultadoTexto= resultado.toString()
                    tvCasilla.text = resultadoTexto
                    operacion= "nula"
                    val textoMin= "${tvCasillaMin.text.toString()}  $valor2 = $resultadoTexto"
                    tvCasillaMin.text = textoMin
                }
                if(operacion == "/"){
                    if(valor1 != 0.0){
                        val resultado= valor1 / valor2
                        val resultadoTexto= resultado.toString()
                        tvCasilla.text = resultadoTexto
                        operacion= "nula"
                        val textoMin= "${tvCasillaMin.text.toString()}  $valor2 = $resultadoTexto"
                        tvCasillaMin.text = textoMin
                    }else{
                        Toast.makeText(this,"Error al dividir por 0", Toast.LENGTH_SHORT).show()
                        valor1= 0.0
                        valor2= 0.0
                    }
                }
                igualdadEjecutada= true
            }
        }


    }
    private fun agregarNumero(texto:TextView, numero:Int){
        if(texto.length()<10) {
            val resultado = texto.text.toString()
            if (resultado == "0" && texto.length()==1) {
                texto.text = numero.toString()
            } else {
                val nuevoTexto = texto.text.toString() + numero.toString()
                texto.text = nuevoTexto
            }
        }

    }

}