package com.prasher.landregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prasher.landregistration.databinding.ActivityLandInspectorBinding
import com.prasher.landregistration.databinding.ActivityPrivateKeyLoginBinding

class LandInspectorActivity : AppCompatActivity() {
    private var binding : ActivityLandInspectorBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLandInspectorBinding.inflate(layoutInflater)

        binding?.llVerifyUser?.setOnClickListener {
            val intent = Intent(this,VerifyUserActivity::class.java)
            startActivity(intent)
        }

        binding?.llVerifyLand?.setOnClickListener {
            val intent = Intent(this,VerifyLandActivity::class.java)
            startActivity(intent)
        }

        binding?.llTransferOwnership?.setOnClickListener {
            val intent = Intent(this, TransferOwnershipActivity::class.java)
            startActivity(intent)
        }



        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
    }
}