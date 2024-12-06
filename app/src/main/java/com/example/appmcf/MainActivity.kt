package com.example.appmcf

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAcercaDe: ImageButton = findViewById(R.id.btnAcercaDe)
        val btnProyectos: ImageButton = findViewById(R.id.btnProyectos)
        val btnEditorial: ImageButton = findViewById(R.id.btnEditorial)
        val btnContacto: ImageButton = findViewById(R.id.btnContacto)

        btnAcercaDe.setOnClickListener {
            val intent = Intent(this, MisionVision::class.java)
            startActivity(intent)
        }

        btnProyectos.setOnClickListener {
            val intent = Intent(this, Proyectos::class.java)
            startActivity(intent)
        }

        btnEditorial.setOnClickListener {
            val intent = Intent(this, Reflexiones::class.java)
            startActivity(intent)
        }

        btnContacto.setOnClickListener {
            val intent = Intent(this, Contacto::class.java)
            startActivity(intent)
        }
    }
}
