package com.prasher.landregistration.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI
import com.prasher.landregistration.R
import com.prasher.landregistration.databinding.ActivityUserBinding
import com.prasher.landregistration.fragments.user.*

class UserActivity : AppCompatActivity() {
    private var binding : ActivityUserBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityUserBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
        replaceFragment(DashboardFragment())

        val navController = NavController(this)
        NavigationUI.setupWithNavController(binding?.navRail!!, navController)

        binding?.navRail?.setOnItemSelectedListener {
            when(it.itemId){
                R.id.dashboard -> replaceFragment(DashboardFragment())
                R.id.add_lands -> replaceFragment(AddLandsFragment())
                R.id.my_lands -> replaceFragment(MyLandsFragment())
                R.id.land_gallery -> replaceFragment(LandGalleryFragment())
                R.id.sent_requests -> replaceFragment(SentRequestsFragment())
                R.id.received_requests -> replaceFragment(ReceivedRequestsFragment())
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
        fragmentTransaction.replace(R.id.fl_user,fragment)
        fragmentTransaction.commit()
    }
}