package com.prasher.landregistration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prasher.landregistration.databinding.ActivityVerifyUserBinding

class VerifyUserActivity : AppCompatActivity() {
    private var binding : ActivityVerifyUserBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityVerifyUserBinding.inflate(layoutInflater)


        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
    }
}