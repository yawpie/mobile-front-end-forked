package com.dicoding.snapp_smartnutritionapp.ui.Register

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.snapp_smartnutritionapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}