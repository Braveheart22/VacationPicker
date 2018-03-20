package com.example.john.vacationpicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val vacationSpots = arrayListOf("Disney", "Hawaii", "Paris", "Okinawa", "Sydney", "Bahamas")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomVacation = random.nextInt(vacationSpots.count())
            vacationTxt.text = vacationSpots[randomVacation]
        }


    }
}