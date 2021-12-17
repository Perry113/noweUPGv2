package com.example.noweupg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Logowanie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logowanie)




        val goToLoginButton = findViewById<Button>(R.id.goToLoginButton)
        val goToRegistrationButton = findViewById<Button>(R.id.goToRegistrationButton)
        val loginButton = findViewById<Button>(R.id.LoginButton)
        val loginInput = findViewById<EditText>(R.id.loginInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)



        goToLoginButton.setOnClickListener {
            Toast.makeText(this, "Już jesteś w ekranie logowania!", Toast.LENGTH_SHORT).show()

        }
        goToRegistrationButton.setOnClickListener {
            val intent = Intent(this, Rejestracja::class.java)
            startActivity(intent)
        }
        loginButton.setOnClickListener {
            val loginInput = loginInput.text;
            val passwordInput = passwordInput.text;
            Toast.makeText(this, "Witaj $loginInput!", Toast.LENGTH_SHORT).show()
        }





    }
}