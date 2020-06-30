package com.califeri.androidxbiometric

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.califeri.androidxbiometric.PasswordManager
import com.califeri.androidxbiometric.R

class Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        val tempButton = findViewById<Button>(R.id.TempButton)
        tempButton.setOnClickListener {
            val intent = Intent(this, PasswordManager::class.java)
            startActivity(intent)
        }
    }
}