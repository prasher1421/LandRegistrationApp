package com.prasher.landregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prasher.landregistration.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private var binding : ActivitySignUpBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignUpBinding.inflate(layoutInflater)

        binding?.btnContinue?.setOnClickListener {
            val intent = Intent(this,UserActivity::class.java)
            startActivity(intent)
        }

        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
    }
}