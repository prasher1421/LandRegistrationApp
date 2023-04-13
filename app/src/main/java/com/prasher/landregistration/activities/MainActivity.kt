package com.prasher.landregistration.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.prasher.landregistration.R
import com.prasher.landregistration.fragments.main.*

class MainActivity : AppCompatActivity() {

//    private var binding : ActivityMainBinding? = null

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
//        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(Home())

//        navController = findNavController(R.id.my_nav_host_fragment)
//
//        binding?.navBar?.setupWithNavController(navController)


        val navBar = findViewById<BottomNavigationView>(R.id.nav_bar)

        navBar?.setOnItemSelectedListener {
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

}