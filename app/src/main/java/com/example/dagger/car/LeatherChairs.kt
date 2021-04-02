package com.example.dagger.car

import javax.inject.Inject

class LeatherChairs @Inject constructor(): Chairs {
    override fun move() {
        println("Leather chairs are moving")
    }
}