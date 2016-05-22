package com.malkomich.kotlinsample.data.model

import java.util.*

/**
 * Created by malkomich on 22/05/2016.
 */
data class KotlinForecastResult(val city: KotlinCity, val list: List<KotlinForecast>)

data class KotlinCity(val id: Long, val name: String, val coord: KotlinCoordinates, val country: String, val
population: Int)

data class KotlinCoordinates(val lon: Float, val lat: Float)

data class KotlinForecast(val date: Long, val temperature: KotlinTemperature, val pressure: Float, val humidity: Int,
                          val weather: List<KotlinWeather>, val speed: Float, val degrees: Int, val clouds: Int, val rain:
                          Float)

data class KotlinTemperature(val day: Float, val min: Float, val max: Float, val night: Float, val evening: Float,
                             val morning: Float)

data class KotlinWeather(val id: Long, val main: String, val description: String, val icon: String)