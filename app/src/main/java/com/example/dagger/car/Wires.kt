package com.example.dagger.car

// we don't own this class so we cannot annotate it with @Inject
class Wires {
    fun wiresConnected () = println("Wires connected")
}