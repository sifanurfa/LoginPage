package com.example.loginpage

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    private fun initComponents() {
        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        initComponents()

        loginButton.setOnClickListener {
            val name = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            if (name.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this@MainActivity, "Selamat datang, ${name}!", Toast.LENGTH_SHORT).show()
            } else if (password.isEmpty() && name.isNotEmpty()) {
                Toast.makeText(this@MainActivity, "Masukkan password", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "Masukkan username", Toast.LENGTH_SHORT).show()
            }

            usernameEditText.text.clear()
            passwordEditText.text.clear()
        }
    }
}