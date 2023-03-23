package com.prasher.landregistration.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI
import com.prasher.landregistration.R
import com.prasher.landregistration.databinding.ActivityLandInspectorBinding
import com.prasher.landregistration.fragments.land_inspector.DashboardFragment
import com.prasher.landregistration.fragments.land_inspector.TransferOwnershipFragment
import com.prasher.landregistration.fragments.land_inspector.VerifyLandFragment
import com.prasher.landregistration.fragments.land_inspector.VerifyUserFragment

class LandInspectorActivity : AppCompatActivity() {
    private var binding : ActivityLandInspectorBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLandInspectorBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
        replaceFragment(DashboardFragment())

        var navController = NavController(this)
        NavigationUI.setupWithNavController(binding?.navRail!!, navController)

        binding?.navRail?.setOnItemSelectedListener {
            when(it.itemId){
                R.id.dashboard -> replaceFragment(DashboardFragment())
                R.id.verify_land -> replaceFragment(VerifyLandFragment())
                R.id.verify_user -> replaceFragment(VerifyUserFragment())
                R.id.transfer_ownership -> replaceFragment(TransferOwnershipFragment())
                R.id.logout -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                else -> {}
            }
            true
        }

    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fl_land_inspector,fragment)
        fragmentTransaction.commit()
    }
}