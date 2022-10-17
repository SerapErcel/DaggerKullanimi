package com.serapercel.daggerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var kargo: Kargo

    @Inject
    lateinit var internet: Internet
    // Dagger kutuphanesi inject nesnesi olustururken private kullanilmaz!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().build().inject(this)

        //kargo = Kargo()
        kargo.gonder()

        //internet = Internet()
        internet.basvuruYap()
    }
}