package com.zzia.tf

import android.app.Application
import android.content.Context

class TfApplication : Application() {

    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}