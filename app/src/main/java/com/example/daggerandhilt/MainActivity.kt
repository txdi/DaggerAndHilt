package com.example.daggerandhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerandhilt.hilt.bean.Truck
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var truck: Truck
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        truck.doWork()
    }
}