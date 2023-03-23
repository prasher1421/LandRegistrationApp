package com.prasher.landregistration.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.fragment.app.Fragment
import androidx.navigation.ui.NavigationUI
import com.prasher.landregistration.R
import com.prasher.landregistration.databinding.ActivityContractOwnerBinding
import com.prasher.landregistration.fragments.contract_owner.AddLandInspectorFragment
import com.prasher.landregistration.fragments.contract_owner.AllLandInspectorsFragment
import com.prasher.landregistration.fragments.contract_owner.ChangeContractOwnerFragment

class ContractOwnerActivity : AppCompatActivity() {
    private var binding :ActivityContractOwnerBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityContractOwnerBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
        replaceFragment(AddLandInspectorFragment())

        val navController = NavController(this)
        NavigationUI.setupWithNavController(binding?.navRail!!, navController)

        binding?.navRail?.setOnItemSelectedListener {
            when(it.itemId){
                R.id.add_land_inspector -> replaceFragment(AddLandInspectorFragment())
                R.id.all_land_inspectors -> replaceFragment(AllLandInspectorsFragment())
                R.id.change_contract_owner -> replaceFragment(ChangeContractOwnerFragment())
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
        fragmentTransaction.replace(R.id.fl_contract_owner,fragment)
        fragmentTransaction.commit()
    }
}