package com.prasher.landregistration.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.prasher.landregistration.R
import com.prasher.landregistration.databinding.ActivityMainBinding
import com.prasher.landregistration.fragments.main.*

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
        replaceFragment(Home())

        binding?.navBar?.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(Home())
                R.id.about -> replaceFragment(About())
                R.id.user -> replaceFragment(User())
                R.id.contract_owner -> replaceFragment(ContractOwner())
                R.id.land_inspector -> replaceFragment(LandInspector())

                else -> {}
            }
            true
        }

    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }

}