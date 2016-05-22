package com.malkomich.kotlinsample;

import com.malkomich.kotlinsample.domain.model.JavaForecastList;

/**
 * Created by malkomich on 22/05/2016.
 */
public interface OnResultListener {

    void onResult(JavaForecastList items);
}
