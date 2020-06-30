package com.byteops.timer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val HUP = findViewById<Button>(R.id.HUpButton)
        val HDOWN = findViewById<Button>(R.id.HDownButton)
        val MUP = findViewById<Button>(R.id.MUpButton)
        val MDOWN = findViewById<Button>(R.id.MDownButton)
        val SUP = findViewById<Button>(R.id.SUpButton)
        val SDOWN = findViewById<Button>(R.id.SDownButton)
        val tempButton = findViewById<Button>(R.id.TempButton)
        val h = findViewById<TextView>(R.id.hour)
        val s = findViewById<TextView>(R.id.time)
        val m = findViewById<TextView>(R.id.min)
        tempButton.setOnClickListener {
            val intent = Intent(this, PasswordManager::class.java)
            startActivity(intent)
        }

        HUP.setOnClickListener {
            if ((h.text.toString().toInt())+1>60)
                h.text="00"
            else
                h.text=((h.text.toString().toInt())+1).toString()
        }

        MUP.setOnClickListener {
            if ((m.text.toString().toInt())+1>60)
                m.text="00"
            else
                m.text=((m.text.toString().toInt())+1).toString()
        }

        SUP.setOnClickListener {
            if ((s.text.toString().toInt())+1>60)
                s.text="00"
            else
                s.text=((s.text.toString().toInt())+1).toString()
        }

        HDOWN.setOnClickListener {
            if ((h.text.toString().toInt()) - 1 < 0)
                h.text = "60"
            else
                h.text = ((h.text.toString().toInt()) - 1).toString()
        }
        MDOWN.setOnClickListener {
            if ((m.text.toString().toInt())-1<0)
                m.text="60"
            else
                m.text=((m.text.toString().toInt())-1).toString()
        }

        SDOWN.setOnClickListener {
            if ((s.text.toString().toInt())-1<0)
                s.text="60"
            else
                s.text=((s.text.toString().toInt())-1).toString()
        }

    }
}