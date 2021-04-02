package com.example.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger.car.Car
import com.example.dagger.di.CarComponent
import com.example.dagger.di.DaggerCarComponent
import com.example.dagger.di.SilkChairsModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //FIELD INJECTION
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent = DaggerCarComponent.builder().silkChairsModule(
            SilkChairsModule(4)
        ).build()
        carComponent.inject(this)
        car.drive()
    }
}