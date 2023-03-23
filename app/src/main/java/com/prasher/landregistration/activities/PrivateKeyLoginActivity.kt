package com.prasher.landregistration.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prasher.landregistration.databinding.ActivityPrivateKeyLoginBinding

class PrivateKeyLoginActivity : AppCompatActivity() {

    private var binding : ActivityPrivateKeyLoginBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityPrivateKeyLoginBinding.inflate(layoutInflater)



        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
    }
}