package com.byteops.timer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tempButton = findViewById<Button>(R.id.TempButton)
        tempButton.setOnClickListener {
            val intent = Intent(this, PasswordManager::class.java)
            startActivity(intent)
        }
    }
}