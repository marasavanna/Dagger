package com.example.dagger.di

import com.example.dagger.car.Chairs
import com.example.dagger.car.LeatherChairs
import dagger.Binds
import dagger.Module

@Module
abstract class LeatherChairsModule {
   //WE USE BINDS INSTEAD OF PROVIDES WHEN WE WANT TO PROVIDE, OR BIND, AN IMPLEMENTATION OF AN INTERFACE
   @Binds
   abstract fun bindsChairs(leatherChairs: LeatherChairs) : Chairs
}