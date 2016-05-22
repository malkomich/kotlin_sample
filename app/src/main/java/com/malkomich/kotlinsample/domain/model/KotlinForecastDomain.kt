package com.malkomich.kotlinsample.domain.model

/**
 * Created by malkomich on 22/05/2016.
 */
data class KotlinForecastList(val city: String, val country: String, val dailyForecast:List<KotlinForecast>) {

    operator fun get(position: Int): KotlinForecast = dailyForecast[position]
    fun size(): Int = dailyForecast.size
}

data class KotlinForecast(val date: String, val description: String, val high: Int, val low: Int)