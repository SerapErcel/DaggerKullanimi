package com.serapercel.daggerkullanimi

import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    // nerede kullanacagimizi belirtiyoruz (hiltte yok daggerde var)
    fun inject(activity: MainActivity)
}