package com.example.nfbeauty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * Activity for MainPage in NFBeauTy.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonBookNow)

        button.setOnClickListener {
            val intent = Intent( this, HomeActivity::class.java)
            startActivity(intent)
        }

        val button1 = findViewById<Button>(R.id.buttonExit)

        button1.setOnClickListener {
            val intent = Intent( this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}