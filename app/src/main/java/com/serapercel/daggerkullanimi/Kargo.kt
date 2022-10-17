package com.serapercel.daggerkullanimi

import android.util.Log
import javax.inject.Inject

class Kargo @Inject constructor(var adres: Adres){

    fun gonder(){
        Log.e("Sonuc", "Kargo ${adres.adresBilgisi} adresine gonderildi")
    }
}