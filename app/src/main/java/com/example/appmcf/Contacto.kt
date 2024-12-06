package com.example.appmcf

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.Button

class Contacto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)

        val logobtn = findViewById<Button>(R.id.logobtn)
        logobtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val mapView: WebView = findViewById(R.id.mapView)
        val webSettings: WebSettings = mapView.settings
        webSettings.javaScriptEnabled = true
        mapView.webViewClient = WebViewClient()
        mapView.loadUrl("https://www.google.com/maps/place/San+Pablo,+California,+EE.+UU./@37.9651707,-122.359081,14z/data=!4m6!3m5!1s0x8085672a61744e71:0x71058b7e9a0af79!8m2!3d37.9621457!4d-122.3455263!16zL20vMHF5eGo?entry=ttu")
    }





    fun openFacebookPage(view: View) {
        val facebookUrl = "https://www.facebook.com/MCFMinistery"
        val facebookIntent = Intent(Intent.ACTION_VIEW)
        facebookIntent.data = Uri.parse(facebookUrl)
        startActivity(facebookIntent)
    }


}
