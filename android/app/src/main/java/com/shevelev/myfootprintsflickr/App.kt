package com.shevelev.myfootprintsflickr

import android.app.Application
import com.shevelev.myfootprintsflickr.logger.AndroidLogger
import com.shevelev.myfootprintsflickr.logger.Log

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        Log.setLoggers(AndroidLogger())
    }
}