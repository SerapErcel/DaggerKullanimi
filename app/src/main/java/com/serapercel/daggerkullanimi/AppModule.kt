package com.serapercel.daggerkullanimi

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    // Singleton : Bir kere olustur her yerden eris
    @Provides
    fun provideAdres() : Adres{
        return Adres("Osmangazi/Bursa")
    }
}