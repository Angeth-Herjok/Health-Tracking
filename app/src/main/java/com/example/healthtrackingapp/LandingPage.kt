package com.example.healthtrackingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthtrackingapp.databinding.ActivityLandingpageBinding

class LandingPage : AppCompatActivity() {
    lateinit var binding: ActivityLandingpageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landingpage)
            binding.ActivityLandingpageBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.tvStart.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.tvStart.setOnClickListener {
            val intent= Intent(this,Login::class.java)
            startActivity(intent)
        }

    }
}