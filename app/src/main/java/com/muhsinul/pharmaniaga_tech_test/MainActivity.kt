package com.muhsinul.pharmaniaga_tech_test

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val btnMenu = findViewById<ImageView>(R.id.iv_menu)
        val content1 = findViewById<CardView>(R.id.cv_content1)
        val content2 = findViewById<CardView>(R.id.cv_content2)
        val content3 = findViewById<CardView>(R.id.cv_content3)
        val content4 = findViewById<CardView>(R.id.cv_content4)
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navDrawer = findViewById<NavigationView>(R.id.nav_drawer)
        val bottomSheet = FragmentBottomSheet()

        btnMenu.setOnClickListener {
            drawerLayout.open()
        }
        content1.setOnClickListener{
            bottomSheet.show(supportFragmentManager, FragmentBottomSheet.TAG)
        }
        content2.setOnClickListener{
            bottomSheet.show(supportFragmentManager, FragmentBottomSheet.TAG)
        }
        content3.setOnClickListener{
            bottomSheet.show(supportFragmentManager, FragmentBottomSheet.TAG)
        }
        content4.setOnClickListener{
            bottomSheet.show(supportFragmentManager, FragmentBottomSheet.TAG)
        }
        navDrawer.setNavigationItemSelectedListener {
            when (it.itemId){
                R.id.item_dash -> {
                    Toast.makeText(this, "Dashboard", Toast.LENGTH_SHORT).show()
                }
                R.id.item_cashier -> {
                    Toast.makeText(this, "Cashier", Toast.LENGTH_SHORT).show()
                }
                R.id.item_report -> {
                    Toast.makeText(this, "Report", Toast.LENGTH_SHORT).show()
                }
                R.id.item_management -> {
                    Toast.makeText(this, "Management", Toast.LENGTH_SHORT).show()
                }
                R.id.item_disc -> {
                    Toast.makeText(this, "Discount & Voucher", Toast.LENGTH_SHORT).show()
                }
                R.id.item_setting -> {
                    Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }

}