package com.example.dagger.di

import com.example.dagger.MainActivity
import com.example.dagger.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component (modules = [AirConditioningModule::class, LeatherChairsModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun numberOfChairs(@Named("numberOfChairs") numberOfChairs: Int) : Builder

        @BindsInstance
        fun price(@Named("price")  price: Int): Builder
        fun build(): CarComponent
    }
}