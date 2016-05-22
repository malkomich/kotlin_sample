package com.malkomich.kotlinsample.data

import android.util.Log
import com.google.gson.Gson
import com.malkomich.kotlinsample.data.model.KotlinForecastResult
import java.net.URL

/**
 * Created by malkomich on 22/05/2016.
 */
class KotlinForecastRequest(val zipCode: String) {

    companion object {
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        private val URL = "http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "${URL}&APPID=${APP_ID}&q="
    }

    fun execute(): KotlinForecastResult {
        val forecastJsonStr = URL(COMPLETE_URL + zipCode).readText()
        return Gson().fromJson(forecastJsonStr, KotlinForecastResult::class.java)
    }
}