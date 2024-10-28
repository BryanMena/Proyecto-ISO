package com.example.appmcf

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Proyectos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_proyectos)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val logobtn = findViewById<Button>(R.id.logobtn)
        logobtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Botón "Curso de conocimiento digital"
        val cursoButton: Button = findViewById(R.id.cursoButton)
        cursoButton.setOnClickListener {
            val intent = Intent(this, ConocimientoDigital::class.java)
            startActivity(intent)
        }

        // Botón "MCF Teens El Salvador"
        val mcfTeensButton: Button = findViewById(R.id.mcfTeensButton)
        mcfTeensButton.setOnClickListener {
            val intent = Intent(this, MCFTeens::class.java)
            startActivity(intent)
        }

        // Botón "Red de oración"
        val redOracionButton: Button = findViewById(R.id.redOracionButton)
        redOracionButton.setOnClickListener {
            val intent = Intent(this, RedOracion::class.java)
            startActivity(intent)
        }
    }
}
