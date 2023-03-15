package com.prasher.landregistration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prasher.landregistration.databinding.ActivityTransferOwnershipBinding

class TransferOwnershipActivity : AppCompatActivity() {
    private var binding : ActivityTransferOwnershipBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTransferOwnershipBinding.inflate(layoutInflater)




        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
    }
}