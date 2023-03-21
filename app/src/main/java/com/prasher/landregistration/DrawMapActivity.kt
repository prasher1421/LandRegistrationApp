package com.prasher.landregistration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prasher.landregistration.databinding.ActivityDrawMapBinding

class DrawMapActivity : AppCompatActivity() {
    private var binding : ActivityDrawMapBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDrawMapBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)


        
    }
}