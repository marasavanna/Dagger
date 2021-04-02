package com.example.dagger.car

import javax.inject.Inject

class SilkChairs @Inject constructor(val numberOfChairs: Int) : Chairs {
    override fun move() {
        println("$numberOfChairs Silk chairs are moving")
    }
}