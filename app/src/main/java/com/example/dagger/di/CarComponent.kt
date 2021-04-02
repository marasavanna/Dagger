package com.example.dagger.di

import com.example.dagger.MainActivity
import com.example.dagger.car.Car
import dagger.Component

@Component (modules = [AirConditioningModule::class, SilkChairsModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(activity: MainActivity)
}