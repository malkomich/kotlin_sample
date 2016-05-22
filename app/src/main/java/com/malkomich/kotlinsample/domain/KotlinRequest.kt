package com.malkomich.kotlinsample.domain

import android.util.Log
import java.net.URL

/**
 * Created by malkomich on 22/05/2016.
 */
class KotlinRequest(val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}