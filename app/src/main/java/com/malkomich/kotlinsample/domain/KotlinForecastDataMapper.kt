package com.malkomich.kotlinsample.domain

import com.malkomich.kotlinsample.data.model.KotlinForecast
import com.malkomich.kotlinsample.data.model.KotlinForecastResult
import com.malkomich.kotlinsample.domain.model.KotlinForecastList
import java.text.DateFormat
import java.util.*
import com.malkomich.kotlinsample.domain.model.KotlinForecast as KotlinModelForecast

/**
 * Created by malkomich on 22/05/2016.
 */
class KotlinForecastDataMapper {

    fun convertFromDataModel(forecast: KotlinForecastResult): KotlinForecastList {
        return KotlinForecastList(forecast.city.name, forecast.city.country, convertForecastListToDomain(forecast.list))
    }

    private fun convertForecastListToDomain(list: List<KotlinForecast>): List<KotlinModelForecast> {
        return list.map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: KotlinForecast): KotlinModelForecast {
        return KotlinModelForecast(convertDate(forecast.dt), forecast.weather[0].description,
                forecast.temp.max.toInt(), forecast.temp.min.toInt())
    }

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }
}