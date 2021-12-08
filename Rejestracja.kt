package com.example.noweupg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Rejestracja : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rejestracja)

       val goToLoginButton = findViewById<Button>(R.id.goToLoginButton)
        val goToRegistrationButton = findViewById<Button>(R.id.goToRegistrationButton)
        val RegistrationButton = findViewById<Button>(R.id.RegistrationButton)
        val loginInput = findViewById<EditText>(R.id.loginInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val passwordRepeatInput = findViewById<EditText>(R.id.passwordRepeatInput)
        var testowo = findViewById<EditText>(R.id.testowo)




        goToLoginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        goToRegistrationButton.setOnClickListener {

            Toast.makeText(this, "Już jesteś w ekranie rejestracji!", Toast.LENGTH_SHORT).show()
        }

        RegistrationButton.setOnClickListener {
            var loginInput = loginInput.text;
            var passwordInput = passwordInput.text;
            var passwordRepeatInput = passwordRepeatInput.text;


            if (passwordInput === passwordRepeatInput){
                Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Hasła różnią się", Toast.LENGTH_SHORT).show()
            }

            Toast.makeText(this, "Witaj $loginInput!", Toast.LENGTH_SHORT).show()




    }
}}