package com.dicoding.snapp_smartnutritionapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.snapp_smartnutritionapp.databinding.ActivityMainBinding
import com.dicoding.snapp_smartnutritionapp.ui.Login.Loginactivity


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val tvStarted = findViewById<TextView>(R.id.Started)
        tvStarted.setOnClickListener {
            val intent = Intent(this, Loginactivity::class.java)
            startActivity(intent)
        }
    }
}