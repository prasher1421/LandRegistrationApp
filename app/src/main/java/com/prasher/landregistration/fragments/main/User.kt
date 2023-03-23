package com.prasher.landregistration.fragments.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.prasher.landregistration.activities.SignUpActivity
import com.prasher.landregistration.activities.UserActivity
import com.prasher.landregistration.databinding.FragmentUserBinding

class User : Fragment() {

    private var _binding : FragmentUserBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentUserBinding.inflate(layoutInflater, container, false)

        binding.btnSignup.setOnClickListener {
            val intent = Intent(activity, SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener {
            val intent = Intent(activity, UserActivity::class.java)
            startActivity(intent)
        }


        return binding.root
        }

}