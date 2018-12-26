package com.example.android.gocar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.footer.*
import kotlinx.android.synthetic.main.header.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val fManager = supportFragmentManager
        dsignin.setOnClickListener {
            Toast.makeText(this@MainActivity,"Driver Sign in(QA)",Toast.LENGTH_SHORT).show()

            val tx = fManager.beginTransaction()
            tx.replace(R.id.fragment1, DriverSignin())
            tx.addToBackStack("true")
            tx.commit()

        }
        psignup.setOnClickListener {
            Toast.makeText(this@MainActivity,"passenger Sign up(QA)",Toast.LENGTH_SHORT).show()

            val tx = fManager.beginTransaction()
            tx.replace(R.id.fragment1, passengersignup())
            tx.addToBackStack("true")
            tx.commit()

        }
        psignin.setOnClickListener {
        Toast.makeText(this@MainActivity,"Passenger Sign in(QA)",Toast.LENGTH_SHORT).show()

            val tx=fManager.beginTransaction()
            tx.replace(R.id.fragment1,PassengerSignin())
            tx.addToBackStack("true")

            tx.commit()
        }


        dsignup.setOnClickListener {
            Toast.makeText(this@MainActivity,"Driver Sign up(QA)",Toast.LENGTH_SHORT).show()

            val tx = fManager.beginTransaction()
            tx.replace(R.id.fragment1,DriverSignup())
            tx.addToBackStack("true")
            tx.commit()

            wview.webViewClient= WebViewClient()
            wview.settings.builtInZoomControls=true
            wview.settings.javaScriptEnabled=true

        }
        google.setOnClickListener {
            Toast.makeText(this@MainActivity,"google.com",Toast.LENGTH_LONG).show()
            wview.loadUrl("www.google.com")


        }
    }//oncreate

}
