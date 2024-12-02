package com.dicoding.snapp_smartnutritionapp.ui.Login

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dicoding.snapp_smartnutritionapp.MainActivity
import com.dicoding.snapp_smartnutritionapp.R
import com.dicoding.snapp_smartnutritionapp.databinding.ActivityLoginactivityBinding
import com.dicoding.snapp_smartnutritionapp.databinding.ActivityMainBinding
import com.dicoding.snapp_smartnutritionapp.ui.Navigation.HomeActivity
import com.dicoding.snapp_smartnutritionapp.ui.Register.RegisterActivity

class Loginactivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


        val tvLogin = findViewById<TextView>(R.id.tvLogin)
        tvLogin.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        val tvSignUp = findViewById<TextView>(R.id.tvSignUp)
        tvSignUp.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}