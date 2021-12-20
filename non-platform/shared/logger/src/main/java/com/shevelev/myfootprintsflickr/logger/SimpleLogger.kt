package com.shevelev.myfootprintsflickr.logger

/**
 * Simple cross-platform logger
 */
class SimpleLogger : Logger {
    override fun v(tag: String, message: String) = printLog("VERBOSE", tag, message)

    override fun d(tag: String, message: String) = printLog("DEBUG", tag, message)

    override fun i(tag: String, message: String) = printLog("INFO", tag, message)

    override fun w(tag: String, message: String) = printLog("WARN", tag, message)

    override fun e(tag: String, message: String) = printLog("ERROR", tag, message)

    override fun e(tag: String, exception: Exception) =
        e(tag, exception.message ?: exception::class.java.simpleName)

    private fun printLog(level: String, tag: String, m: String) {
        println("$level $tag $m")
    }
}