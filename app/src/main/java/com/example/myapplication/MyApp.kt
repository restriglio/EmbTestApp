package com.example.myapplication

import android.app.Application
import io.embrace.android.embracesdk.Embrace

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Embrace.getInstance().start(this, false)
    }
}