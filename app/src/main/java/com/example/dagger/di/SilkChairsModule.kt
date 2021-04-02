package com.example.dagger.di

import com.example.dagger.car.Chairs
import com.example.dagger.car.SilkChairs
import dagger.Module
import dagger.Provides

@Module
class SilkChairsModule(val numberOfChairs: Int) {

    @Provides
    fun provideNumberOfChairs(): Int {
        return numberOfChairs
    }

    @Provides
    fun providesChairs(silkChairs: SilkChairs): Chairs = silkChairs
}