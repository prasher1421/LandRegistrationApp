package com.prasher.landregistration.fragments.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.prasher.landregistration.R
import com.prasher.landregistration.databinding.FragmentHomeBinding

class Home : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)



//        binding.cvContractOwner.setOnClickListener {
//            val action = HomeDirections.actionHome2ToContractOwner()
//            findNavController().navigate(action)
//        }
//        binding.cvLandInspector.setOnClickListener {
//            val action = HomeDirections.actionHome2ToLandInspector()
//            findNavController().navigate(action)
//        }
//        binding.cvUser.setOnClickListener {
//            val action = HomeDirections.actionHome2ToUser2()
//            findNavController().navigate(action)
//        }



        return binding.root

    }

}