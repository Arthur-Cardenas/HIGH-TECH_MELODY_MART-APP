package com.example.melodymart
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var name: EditText
    private lateinit var password: EditText
    private lateinit var forgotPassword: TextView
    private lateinit var loginButton: Button
    private lateinit var registerButton: Button
    private lateinit var adminLoginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        username = findViewById(R.id.username)
        name = findViewById(R.id.name)
        password = findViewById(R.id.passwordd)
        forgotPassword = findViewById(R.id.forgotpass)
        loginButton = findViewById(R.id.loginbtn)
        registerButton = findViewById(R.id.rgbtn)
        adminLoginButton = findViewById(R.id.login_as_admin)

        loginButton.setOnClickListener {
            // Create an Intent to start the HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        registerButton.setOnClickListener {
            // Handle registration
        }

        adminLoginButton.setOnClickListener {
            // Create an Intent to start the RegisterActivity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
