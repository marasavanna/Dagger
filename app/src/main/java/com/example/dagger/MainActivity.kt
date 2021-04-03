package com.example.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger.car.Car
import com.example.dagger.di.CarComponent
import com.example.dagger.di.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //FIELD INJECTION
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent = DaggerCarComponent.builder().numberOfChairs(4).price(20).build()
        carComponent.inject(this)
        car.drive()
    }
}