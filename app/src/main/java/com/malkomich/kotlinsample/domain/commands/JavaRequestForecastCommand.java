package com.malkomich.kotlinsample.domain.commands;

import com.malkomich.kotlinsample.data.JavaForecastRequest;
import com.malkomich.kotlinsample.domain.JavaForecastDataMapper;
import com.malkomich.kotlinsample.domain.model.JavaForecastList;

/**
 * Created by malkomich on 22/05/2016.
 */
public class JavaRequestForecastCommand implements JavaCommand<JavaForecastList> {

    private String zipCode;

    public JavaRequestForecastCommand(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public JavaForecastList execute() {
        JavaForecastRequest forecastRequest = new JavaForecastRequest(zipCode);
        return new JavaForecastDataMapper().convertFromDataModel(forecastRequest.execute());
    }
}
