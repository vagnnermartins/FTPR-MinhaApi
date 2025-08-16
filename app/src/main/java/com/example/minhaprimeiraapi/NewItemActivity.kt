package com.example.minhaprimeiraapi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.minhaprimeiraapi.databinding.ActivityNewItemBinding

class NewItemActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {

    }
}