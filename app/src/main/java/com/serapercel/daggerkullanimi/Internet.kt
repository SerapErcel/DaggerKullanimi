package com.serapercel.daggerkullanimi

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor(var adres: Adres){

    fun basvuruYap(){
        Log.e("Sonuc", "Internet Basvurusu ${adres.adresBilgisi} adresine yapildi")
    }
}