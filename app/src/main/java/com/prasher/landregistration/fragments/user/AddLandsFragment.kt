package com.prasher.landregistration.fragments.user

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import com.prasher.landregistration.R
import com.prasher.landregistration.databinding.FragmentAddLandsBinding

class AddLandsFragment : Fragment() {
    private var _binding : FragmentAddLandsBinding? =null
    private val binding get() = _binding!!
    private var mLatitude : Double = 0.0
    private var mLongitude : Double = 0.0

    private val googleMapsInitializer = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result -> processResult(result.resultCode,result.data!!)
    }


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
                googleMapsInitializer.launch(intent)
//                startActivityForResult(intent, PLACE_AUTOCOMPLETE_REQUEST_CODE)

            }
            catch (e:Exception){
                e.printStackTrace()
            }
        }

        return binding.root
    }

//    @Deprecated("Deprecated in Java")
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        processResult(resultCode, data)
//    }

    private fun processResult(
        resultCode: Int,
        data: Intent?
    ) {
        when (resultCode) {
            Activity.RESULT_OK -> {
                val place: Place = Autocomplete.getPlaceFromIntent(data!!)
                var address_location = place.address
                mLatitude = place.latLng!!.latitude
                mLongitude = place.latLng!!.longitude
            }
            Activity.RESULT_CANCELED -> {
                Log.e("Cancelled", "Cancelled")
            }
        }
    }



    companion object {
        private const val PLACE_AUTOCOMPLETE_REQUEST_CODE = 1
    }

}