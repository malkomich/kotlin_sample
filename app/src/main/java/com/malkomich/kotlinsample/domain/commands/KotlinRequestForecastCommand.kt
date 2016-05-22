package com.malkomich.kotlinsample.domain.commands

import com.malkomich.kotlinsample.data.KotlinForecastRequest
import com.malkomich.kotlinsample.domain.KotlinForecastDataMapper
import com.malkomich.kotlinsample.domain.model.KotlinForecastList

/**
 * Created by malkomich on 22/05/2016.
 */
class KotlinRequestForecastCommand(val zipCode: String) : KotlinCommand<KotlinForecastList> {

    override fun execute(): KotlinForecastList {
        val forecastRequest = KotlinForecastRequest(zipCode)
        return KotlinForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }

}