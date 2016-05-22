package com.malkomich.kotlinsample.domain.commands;

/**
 * Created by malkomich on 22/05/2016.
 */
public interface JavaCommand<T> {
    T execute();
}
