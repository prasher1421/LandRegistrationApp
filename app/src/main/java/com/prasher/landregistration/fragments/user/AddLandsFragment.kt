package com.prasher.landregistration.fragments.user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.libraries.places.api.Places
import com.prasher.landregistration.R
import com.prasher.landregistration.databinding.FragmentAddLandsBinding
import com.prasher.landregistration.databinding.FragmentContractOwnerBinding

class AddLandsFragment : Fragment() {
    private var _binding : FragmentAddLandsBinding? =null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddLandsBinding.inflate(layoutInflater,container,false)

        if(!Places.isInitialized()){
            Places.initialize(container?.context!!,resources.getString(R.string.google_maps_api_key))
        }


        return binding.root
    }

}