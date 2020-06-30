package com.califeri.androidxbiometric

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import com.califeri.androidxbiometric.PasswordManager
import com.byteops.timer.settings
import com.google.android.material.button.MaterialButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var button: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
    }

    private fun initializeViews() {
        button = findViewById(R.id.mb_use_biometric)
        button.setOnClickListener {
            showBiometricPrompt()
        }
    }

    private fun showBiometricPrompt() {
        val biometricPromptUtils = BiometricPromptUtils(this, object : BiometricPromptUtils.BiometricListener {
            override fun onAuthenticationLockoutError() {
                // implement your lockout error UI prompt
            }

            override fun onAuthenticationPermanentLockoutError() {
                // implement your permanent lockout error UI prompt
            }

            override fun onAuthenticationSuccess() {

                val intentAct: Intent = Intent(this@MainActivity,Activity::class.java)
                startActivity(intentAct)
                onAuthenticationSuccess()

            }

            override fun onAuthenticationFailed() {
                // implement your authentication failed UI prompt
            }

            override fun onAuthenticationError() {
                // implement your authentication error UI prompt
            }
        })
        biometricPromptUtils.showBiometricPrompt(
            resources.getString(R.string.confirmYourBiometricsKey),
            resources.getString(R.string.cancelKey),
            confirmationRequired = false
        )
    }
}
