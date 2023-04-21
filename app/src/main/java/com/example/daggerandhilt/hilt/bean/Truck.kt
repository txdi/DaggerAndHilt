package com.example.daggerandhilt.hilt.bean

import javax.inject.Inject

class Truck @Inject constructor() {
    fun doWork() {
        println("truck do work")
    }
}