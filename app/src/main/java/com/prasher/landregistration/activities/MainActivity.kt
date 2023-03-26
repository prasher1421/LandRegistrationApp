package com.prasher.landregistration.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
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

//        val navController = Navigation.findNavController(this,R.id.nav_graph_main)
//
//        navController.navigate(R.id.home2)
        NavController(this)

//        binding?.myNavHostFragment?.findNavController()

//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment
//        val navController = navHostFragment.navController
//
//        NavigationUI.setupWithNavController(binding?.navBar!!,navController)

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
        fragmentTransaction.replace(R.id.my_nav_host_fragment,fragment)
        fragmentTransaction.commit()
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }

}