package com.example.dagger.car

import javax.inject.Inject
import javax.inject.Named

class LeatherChairs @Inject constructor(@Named("numberOfChairs") val numberOfChairs: Int, @Named("price") val price: Int): Chairs {
    override fun move() {
        println("$numberOfChairs leather chairs are moving")
        println("Their price is $price")
    }
}