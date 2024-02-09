package edu.temple.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        val bmi= findViewById<ImageView>(R.id.imgBMI)
        val sensor= findViewById<ImageView>(R.id.imgPedoMeter)

        supportActionBar?.hide()

        bmi.setOnClickListener {
            val i= Intent(this, BMIactivity::class.java)
            startActivity(i)
        }
        sensor.setOnClickListener {
            val i2= Intent(this, PedoSensor::class.java)
            startActivity(i2)
        }
    }
}