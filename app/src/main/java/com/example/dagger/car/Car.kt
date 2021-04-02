package com.example.dagger.car

import javax.inject.Inject

//CONSTRUCTOR INJECTION
data class Car @Inject constructor(var engine: Engine, var wheels: Wheels, var airConditioning: AirConditioning, var chairs: Chairs) {

    fun drive() {
        chairs.move()
        println("Vroom")
    }

    //MEMBER INJECTION
    @Inject
    fun enableRemote(remoteKey: RemoteKey) {
        remoteKey.setListener(this)
    }
}