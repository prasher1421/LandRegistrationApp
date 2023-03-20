package com.prasher.landregistration.fragments.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.prasher.landregistration.ContractOwnerActivity
import com.prasher.landregistration.databinding.FragmentContractOwnerBinding

class ContractOwner : Fragment() {

    private var _binding : FragmentContractOwnerBinding? =null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentContractOwnerBinding.inflate(layoutInflater, container, false)

        binding.btnContinue.setOnClickListener {
            val intent = Intent(activity,ContractOwnerActivity::class.java)
            startActivity(intent)
        }


        return binding.root
    }


}