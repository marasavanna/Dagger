package com.example.dagger.car

import com.example.dagger.car.Car
import javax.inject.Inject

class RemoteKey @Inject constructor() {

    fun setListener(car: Car) {
        println("Remote connected")
    }
}