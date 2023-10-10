package com.santiagobulla.desarollomovil.firtsApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.santiagobulla.desarollomovil.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)//para esta pantalla vas a enganchar este diseño (layout)
    }
}