package com.dza.register

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dza.register.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            val username = binding.txtUser.text.toString()
            val email = binding.txtEmail.text.toString()
            val phone = binding.txtPhone.text.toString()
            val password = binding.txtPassword.text.toString()

            // Validasi input kosong
            if (username.isNotEmpty() && email.isNotEmpty() && phone.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("USERNAME", username)
                intent.putExtra("PASSWORD", password)
                intent.putExtra("EMAIL", email)
                intent.putExtra("PHONE", phone)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

