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

        var tvCasilla= findViewById<TextView>(R.id.ed_texto)

        var valor1= 0.0
        var valor2= 0.0
        var operacion = "nula"

        var zero= findViewById<Button>(R.id.bt_zero)
        zero.setOnClickListener {
            if(tvCasilla.length()<10) {
                var num = 0
                var resultado = tvCasilla.text.toString().toDouble()
                if (resultado != 0.0) {
                    var nuevoTexto = tvCasilla.text.toString() + num.toString()
                    tvCasilla.setText(nuevoTexto)
                }
            }

        }

        var one= findViewById<Button>(R.id.bt_one)
        one.setOnClickListener {
            if(tvCasilla.length()<10) {
                var num = 1
                var resultado = tvCasilla.text.toString().toDouble()
                if (resultado == 0.0) {
                    tvCasilla.setText(num.toString())
                } else {
                    var nuevoTexto = tvCasilla.text.toString() + num.toString()
                    tvCasilla.setText(nuevoTexto)
                }
            }
        }
        var two= findViewById<Button>(R.id.bt_two)
        two.setOnClickListener {
            if(tvCasilla.length()<10) {
                var num = 2
                var resultado = tvCasilla.text.toString().toDouble()
                if (resultado == 0.0) {
                    tvCasilla.setText(num.toString())
                } else {
                    var nuevoTexto = tvCasilla.text.toString() + num.toString()
                    tvCasilla.setText(nuevoTexto)
                }
            }
        }

        var three= findViewById<Button>(R.id.bt_three)
        three.setOnClickListener {
            if(tvCasilla.length()<10) {
                var num = 3
                var resultado = tvCasilla.text.toString().toDouble()
                if (resultado == 0.0) {
                    tvCasilla.setText(num.toString())
                } else {
                    var nuevoTexto = tvCasilla.text.toString() + num.toString()
                    tvCasilla.setText(nuevoTexto)
                }
            }
        }

        var four= findViewById<Button>(R.id.bt_four)
        four.setOnClickListener {
            if(tvCasilla.length()<10) {
                var num = 4
                var resultado = tvCasilla.text.toString().toDouble()
                if (resultado == 0.0) {
                    tvCasilla.setText(num.toString())
                } else {
                    var nuevoTexto = tvCasilla.text.toString() + num.toString()
                    tvCasilla.setText(nuevoTexto)
                }
            }
        }

        var five= findViewById<Button>(R.id.bt_five)
        five.setOnClickListener {
            if(tvCasilla.length()<10) {
                var num = 5
                var resultado = tvCasilla.text.toString().toDouble()
                if (resultado == 0.0) {
                    tvCasilla.setText(num.toString())
                } else {
                    var nuevoTexto = tvCasilla.text.toString() + num.toString()
                    tvCasilla.setText(nuevoTexto)
                }
            }
        }

        var six= findViewById<Button>(R.id.bt_six)
        six.setOnClickListener {
            if(tvCasilla.length()<10) {
                var num = 6
                var resultado = tvCasilla.text.toString().toDouble()
                if (resultado == 0.0) {
                    tvCasilla.setText(num.toString())
                } else {
                    var nuevoTexto = tvCasilla.text.toString() + num.toString()
                    tvCasilla.setText(nuevoTexto)
                }
            }
        }

        var seven= findViewById<Button>(R.id.bt_seven)
        seven.setOnClickListener {
            if(tvCasilla.length()<10) {
                var num = 7
                var resultado = tvCasilla.text.toString().toDouble()
                if (resultado == 0.0) {
                    tvCasilla.setText(num.toString())
                } else {
                    var nuevoTexto = tvCasilla.text.toString() + num.toString()
                    tvCasilla.setText(nuevoTexto)
                }
            }
        }

        var eight= findViewById<Button>(R.id.bt_eight)
        eight.setOnClickListener {
            if(tvCasilla.length()<10) {
                var num = 8
                var resultado = tvCasilla.text.toString().toDouble()
                if (resultado == 0.0) {
                    tvCasilla.setText(num.toString())
                } else {
                    var nuevoTexto = tvCasilla.text.toString() + num.toString()
                    tvCasilla.setText(nuevoTexto)
                }
            }
        }

        var nine= findViewById<Button>(R.id.bt_nine)
        nine.setOnClickListener {
            if(tvCasilla.length()<10) {
                var num = 9
                var resultado = tvCasilla.text.toString().toDouble()
                if (resultado == 0.0) {
                    tvCasilla.setText(num.toString())
                } else {
                    var nuevoTexto = tvCasilla.text.toString() + num.toString()
                    tvCasilla.setText(nuevoTexto)
                }
            }
        }

        var reset= findViewById<Button>(R.id.bt_reset)
        reset.setOnClickListener {
            var texto= "0"
            tvCasilla.setText(texto)
            valor1= 0.0
            valor2= 0.0
            operacion= "nula"
        }

        var sumar= findViewById<Button>(R.id.bt_suma)
        sumar.setOnClickListener {
            operacion= "+"
            valor1= tvCasilla.text.toString().toDouble()
            tvCasilla.setText("0")

        }

        var restar= findViewById<Button>(R.id.bt_restar)
        restar.setOnClickListener {
            operacion= "-"
            valor1= tvCasilla.text.toString().toDouble()
            tvCasilla.setText("0")

        }
        var multiplicar= findViewById<Button>(R.id.bt_multi)
        multiplicar.setOnClickListener {
            operacion= "*"
            valor1= tvCasilla.text.toString().toDouble()
            tvCasilla.setText("0")

        }
        var dividir= findViewById<Button>(R.id.bt_dividir)
        dividir.setOnClickListener {
            operacion= "/"
            valor1= tvCasilla.text.toString().toDouble()
            tvCasilla.setText("0")

        }

        var punto= findViewById<Button>(R.id.bt_punto)
        punto.setOnClickListener {
           var resultado= tvCasilla.text.toString()+"."
            tvCasilla.setText(resultado)
        }

        var igual= findViewById<Button>(R.id.bt_igual)
        igual.setOnClickListener {
            if(operacion != "nula"){
                valor2= tvCasilla.text.toString().toDouble()

                if(operacion == "+"){
                    var resultado= valor1 + valor2
                    var resultadoTexto= resultado.toString()
                    tvCasilla.setText(resultadoTexto)
                    operacion= "nula"
                }
                if(operacion == "-"){
                    var resultado= valor1 - valor2
                    var resultadoTexto= resultado.toString()
                    tvCasilla.setText(resultadoTexto)
                    operacion= "nula"
                }
                if(operacion == "*"){
                    var resultado= valor1 * valor2
                    var resultadoTexto= resultado.toString()
                    tvCasilla.setText(resultadoTexto)
                    operacion= "nula"
                }
                if(operacion == "/"){
                    if(valor1 != 0.0){
                        var resultado= valor1 / valor2
                        var resultadoTexto= resultado.toString()
                        tvCasilla.setText(resultadoTexto)
                        operacion= "nula"
                    }else{
                        Toast.makeText(this,"Error al dividir por 0", Toast.LENGTH_SHORT).show()
                        valor1= 0.0
                        valor2= 0.0
                    }
                }
            }
        }


    }
}