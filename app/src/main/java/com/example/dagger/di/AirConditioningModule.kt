package com.example.dagger.di

import com.example.dagger.car.AirConditioning
import com.example.dagger.car.Wires
import dagger.Module
import dagger.Provides

@Module
class AirConditioningModule {
    @Provides
    fun provideWires() : Wires {
        val wires = Wires()
        wires.wiresConnected()
        return wires
    }
    @Provides
    fun provideAirConditioning(wires: Wires) = AirConditioning(wires)
}