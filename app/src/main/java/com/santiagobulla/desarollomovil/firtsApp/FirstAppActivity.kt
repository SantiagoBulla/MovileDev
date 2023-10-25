package com.santiagobulla.desarollomovil.firtsApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.i
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.santiagobulla.desarollomovil.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)//para esta pantalla vas a enganchar este diseño (layout)
        val btnClick =
            findViewById<AppCompatButton>(R.id.btn_Click) //capturar el elemento (document.getElementById -> js)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        //etName.text.toString() //devuelve lo que tenga el editText
        btnClick.setOnClickListener {
//            Long.run { i("santiago","Boton pulsado") } //es una manera de hacer prints en el Logcat
            val valueText = etName.text.toString()
            if (valueText.isNotEmpty()) {

                Log.i(
                    "santiago",
                    "Boton pulsado y trae la informacion: $valueText"
                ) //es una manera de hacer prints en el Logcat
            }
        }
    }
}
//3:54 min