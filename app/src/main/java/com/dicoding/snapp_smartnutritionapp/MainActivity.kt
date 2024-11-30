package com.dicoding.snapp_smartnutritionapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.snapp_smartnutritionapp.data.response.LoginRequest
import com.dicoding.snapp_smartnutritionapp.data.response.RegisterRequest
import com.dicoding.snapp_smartnutritionapp.data.retrofit.ApiConfig
import com.dicoding.snapp_smartnutritionapp.data.retrofit.ApiService
import com.dicoding.snapp_smartnutritionapp.databinding.ActivityMainBinding
import com.dicoding.snapp_smartnutritionapp.ui.Register.RegisterActivity
import retrofit2.Callback

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tvSignUp = findViewById<TextView>(R.id.tvSignUp)
        tvSignUp.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

//    private fun loginUser(email: String, password: String) {
//        showLoading(true)
//        val request = LoginRequest(email, password)
//        val client = ApiConfig.getApiService().login(request)
//        client.enqueue(object : Callback<RegisterRequest> {
//
//        })
//        client.enqueue(object : Callback<LoginResponse> {
//            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
//                showLoading(false)
//                if (response.isSuccessful) {
//                    response.body()?.let {
//                        if (it.error == null) {
//                            Log.d(TAG, "Login Success: ${it.message}")
//                            showToast("Login sukses")
//                            // Simpan token jika ada
//                            val token = it.token
//                            // Lanjutkan ke activity berikutnya atau simpan token
//                            navigateToHome()
//                        } else {
//                            Log.e(TAG, "Login Failed: ${it.error}")
//                            showToast("Login gagal: ${it.error}")
//                        }
//                    }
//                } else {
//                    Log.e(TAG, "Login Failed: ${response.message()}")
//                    showToast("Login gagal: ${response.message()}")
//                }
//            }
//
//            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
//                showLoading(false)
//                Log.e(TAG, "onFailure: ${t.message}")
//                showToast("Login gagal: ${t.message}")
//            }
//        })
//    }
//
//    private fun validateInput(email: String, password: String): Boolean {
//        if (email.isEmpty()) {
//            binding.editEmail.error = "Email harus diisi"
//            return false
//        }
//        if (password.isEmpty()) {
//            binding.editPassword.error = "Password harus diisi"
//            return false
//        }
//        return true
//    }
//
//    private fun showLoading(isLoading: Boolean) {
//        binding.progressBar.visibility = if (isLoading) View.VISIBLE else View.GONE
//    }
//
//    private fun showToast(message: String) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//    }
//
//    private fun navigateToHome() {
//        // Navigasi ke HomeActivity atau halaman lain setelah login berhasil
//        val intent = Intent(this, HomeActivity::class.java)
//        startActivity(intent)
//        finish()
//    }
}