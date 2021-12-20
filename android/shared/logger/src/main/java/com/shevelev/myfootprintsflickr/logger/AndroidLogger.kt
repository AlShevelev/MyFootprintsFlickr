package com.shevelev.myfootprintsflickr.logger

import android.util.Log

/**
 * A logger for Android platform
 */
class AndroidLogger : Logger {
    override fun v(tag: String, message: String) {
        Log.v(tag, message)
    }

    override fun d(tag: String, message: String) {
        Log.d(tag, message)
    }

    override fun i(tag: String, message: String) {
        Log.i(tag, message)
    }

    override fun w(tag: String, message: String) {
        Log.w(tag, message)
    }

    override fun e(tag: String, message: String) {
        Log.e(tag, message)
    }

    override fun e(tag: String, exception: Exception) {
        Log.e(tag, exception.message, exception)
    }
}