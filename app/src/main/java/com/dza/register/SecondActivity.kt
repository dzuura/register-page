package com.dza.register

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dza.register.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private var registeredUsername: String? = null
    private var registeredPassword: String? = null
    private var email: String? = null
    private var phone: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ambil data yang dikirim dari Register Page
        registeredUsername = intent.getStringExtra("USERNAME")
        registeredPassword = intent.getStringExtra("PASSWORD")
        email = intent.getStringExtra("EMAIL")
        phone = intent.getStringExtra("PHONE")

        binding.btnLogin.setOnClickListener {
            val inputUsername = binding.txtUser.text.toString()
            val inputPassword = binding.txtPassword.text.toString()

            // Cek jika username dan password cocok
            if (inputUsername == registeredUsername && inputPassword == registeredPassword) {
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("USERNAME", registeredUsername)
                intent.putExtra("EMAIL", email)
                intent.putExtra("PHONE", phone)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Incorrect username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
