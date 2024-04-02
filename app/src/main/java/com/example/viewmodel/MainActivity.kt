package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var myViewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //ViewModel can handle system configuration changes

        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.text.text = myViewModel.getIntialCount().toString()

        binding.button.setOnClickListener {
            binding.text.text = myViewModel.getUpdatedCounter().toString()
        }
    }
}