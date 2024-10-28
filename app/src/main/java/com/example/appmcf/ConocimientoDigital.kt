package com.example.appmcf

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.webkit.WebView
import android.webkit.WebViewClient


class ConocimientoDigital : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conocimiento_digital)

        val webView = findViewById<WebView>(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://mcfministery.org/proyectos/curso-de-conocimiento-digital/")
    }
}