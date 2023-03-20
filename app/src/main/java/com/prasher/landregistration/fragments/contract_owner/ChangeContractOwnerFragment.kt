package com.prasher.landregistration.fragments.contract_owner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prasher.landregistration.R
import com.prasher.landregistration.databinding.FragmentChangeContractOwnerBinding

class ChangeContractOwnerFragment : Fragment() {

    private var _binding : FragmentChangeContractOwnerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChangeContractOwnerBinding.inflate(layoutInflater,container,false)


        return binding.root
    }

}