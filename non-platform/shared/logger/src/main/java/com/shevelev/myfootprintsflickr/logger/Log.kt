package com.shevelev.myfootprintsflickr.logger

/**
 * A facade for logging
 */
class Log private constructor(private val loggers: List<Logger>) : Logger {
    override fun v(tag: String, message: String) =
        loggers.forEach { it.v(tag, message) }

    override fun d(tag: String, message: String) =
        loggers.forEach { it.d(tag, message) }

    override fun i(tag: String, message: String) =
        loggers.forEach { it.i(tag, message) }

    override fun w(tag: String, message: String) =
        loggers.forEach { it.w(tag, message) }


    override fun e(tag: String, message: String) =
        loggers.forEach { it.e(tag, message) }

    override fun e(tag: String, exception: Exception) =
        loggers.forEach { it.e(tag, exception) }

    companion object {
        val instance: Logger by lazy { Log(loggers) }

        @Volatile
        private var loggers = listOf<Logger>(SimpleLogger())

        fun setLoggers(vararg loggers: Logger) {
            this.loggers = loggers.toList()
        }
    }
}