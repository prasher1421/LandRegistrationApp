package com.prasher.landregistration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prasher.landregistration.databinding.FragmentContractOwnerBinding


class ContractOwner : Fragment() {

    private var _binding : FragmentContractOwnerBinding? =null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentContractOwnerBinding.inflate(layoutInflater,container,false)



        return binding.root
    }


}