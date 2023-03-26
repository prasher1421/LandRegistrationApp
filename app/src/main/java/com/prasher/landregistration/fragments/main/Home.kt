package com.prasher.landregistration.fragments.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
//
//        val navController = Navigation.findNavController(requireActivity(),R.id.nav_graph_main)
//        navController.navigate(R.id.home2)

        val navController=NavController(requireContext())
//
//        binding.fragmentHome.findNavController()

//        val navController = NavHostFragment.findNavController(this)


        binding.cvContractOwner.setOnClickListener {
//            navController.navigate(R.id.action_home2_to_contractOwner)
            findNavController().navigate(R.id.action_home2_to_contractOwner)
        }
//
//        binding.cvContractOwner.setOnClickListener {
//            navController.navigate(R.id.action_home2_to_contractOwner)
////            findNavController().navigate(R.id.action_home2_to_contractOwner)
//        }
//        binding.cvLandInspector.setOnClickListener {
//            navController.navigate(R.id.action_home2_to_landInspector)
////            findNavController().navigate(R.id.action_home2_to_landInspector)
//        }
//        binding.cvUser.setOnClickListener {
//            navController.navigate(R.id.action_home2_to_user2)
////            findNavController().navigate(R.id.action_home2_to_user2)
//        }



        return binding.root

    }

}