package com.dza.register

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dza.register.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ambil data dari Login Page
        val username = intent.getStringExtra("USERNAME")
        val email = intent.getStringExtra("EMAIL")
        val phone = intent.getStringExtra("PHONE")

        with(binding) {
            txtUser.text = username
            txtEmail.text = email
            txtPhone.text = phone
        }
    }
}
