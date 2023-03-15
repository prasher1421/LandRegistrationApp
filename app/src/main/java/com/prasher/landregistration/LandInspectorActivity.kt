package com.prasher.landregistration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prasher.landregistration.databinding.ActivityLandInspectorBinding
import com.prasher.landregistration.databinding.ActivityPrivateKeyLoginBinding

class LandInspectorActivity : AppCompatActivity() {
    private var binding : ActivityLandInspectorBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLandInspectorBinding.inflate(layoutInflater)



        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
    }
}