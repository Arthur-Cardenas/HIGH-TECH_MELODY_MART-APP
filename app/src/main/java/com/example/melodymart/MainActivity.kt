package com.example.melodymart;
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Start LoginActivity
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)

        // Finish MainActivity so it's removed from the activity stack
        finish()
    }
}
