package com.prasher.landregistration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prasher.landregistration.databinding.ActivityLandInspectorBinding
import com.prasher.landregistration.databinding.ActivityVerifyLandBinding

class VerifyLandActivity : AppCompatActivity(){

    private var binding : ActivityVerifyLandBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityVerifyLandBinding.inflate(layoutInflater)



        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
    }
}