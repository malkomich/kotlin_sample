package com.malkomich.kotlinsample.domain;

import com.malkomich.kotlinsample.data.model.JavaForecast;
import com.malkomich.kotlinsample.data.model.JavaForecastResult;
import com.malkomich.kotlinsample.domain.model.JavaForecastList;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaForecastDataMapper {

    public JavaForecastList convertFromDataModel(JavaForecastResult forecast) {
        return new JavaForecastList(
            forecast.getCity().getName(),
            forecast.getCity().getCountry(),
            convertForecastListToDomain(forecast.getList())
        );
    }

    private List<com.malkomich.kotlinsample.domain.model.JavaForecast> convertForecastListToDomain(
        List<JavaForecast> list) {

        List<com.malkomich.kotlinsample.domain.model.JavaForecast> result = new ArrayList();

        for (JavaForecast forecast : list) {
            result.add(convertForecastItemToDomain(forecast));
        }
        return result;
    }

    private com.malkomich.kotlinsample.domain.model.JavaForecast convertForecastItemToDomain(JavaForecast forecast) {
        return new com.malkomich.kotlinsample.domain.model.JavaForecast(
            convertDate(forecast.getDt()),
            forecast.getWeather().get(0).getDescription(),
            (int) forecast.getTemp().getMax(),
            (int) forecast.getTemp().getMin()
        );
    }

    private String convertDate(long date) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault());
        return df.format(date * 1000);
    }
}
