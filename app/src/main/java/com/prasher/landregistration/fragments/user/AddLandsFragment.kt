package com.prasher.landregistration.fragments.user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.internal.ui.AutocompleteImplFragment
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import com.prasher.landregistration.R
import com.prasher.landregistration.databinding.FragmentAddLandsBinding
import com.prasher.landregistration.databinding.FragmentContractOwnerBinding

class AddLandsFragment : Fragment() {
    private var _binding : FragmentAddLandsBinding? =null
    private val binding get() = _binding!!
    private var mLatitude : Double = 0.0
    private var mLongitude : Double = 0.0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddLandsBinding.inflate(layoutInflater,container,false)

        if(!Places.isInitialized()){
            Places.initialize(container?.context!!,resources.getString(R.string.google_maps_api_key))
        }


        binding.btnDrawLandMap.setOnClickListener {
            try {
                //all fields that have to be passed
                val fields = listOf(Place.Field.ID,Place.Field.NAME,Place.Field.LAT_LNG,Place.Field.LAT_LNG)

                //Start the autocomplete intent with a unique request code
                val intent =
                    Autocomplete.IntentBuilder(AutocompleteActivityMode.FULLSCREEN,fields)
                        .build(requireContext())
                startActivityForResult(intent)
                val place : Place = Autocomplete.getPlaceFromIntent(intent)
                mLatitude = place.latLng!!.latitude
                mLongitude = place.latLng!!.longitude
            }
            catch (e:Exception){
                e.printStackTrace()
            }
        }

        return binding.root
    }

}