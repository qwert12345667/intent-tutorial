package com.implude.tutorial.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpen = findViewById<Button>(R.id.btn_open)

        btnOpen.setOnClickListener {
            val anotherActivityIntent = Intent(this, AnotherActivity::class.java)
            startActivity(anotherActivityIntent)
        }
    }
}