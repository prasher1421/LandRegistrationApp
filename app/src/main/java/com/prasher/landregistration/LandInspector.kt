package com.prasher.landregistration

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prasher.landregistration.databinding.FragmentLandInspectorBinding


class LandInspector : Fragment() {

    private var _binding : FragmentLandInspectorBinding? =null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentLandInspectorBinding.inflate(layoutInflater,container,false)

        binding.btnContinue.setOnClickListener {
            continueToLandInspectorPage()
        }

        return binding.root
    }

    private fun continueToLandInspectorPage() {
        val intent = Intent(activity,LandInspectorActivity::class.java)
        startActivity(intent)
    }

}