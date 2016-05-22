package com.malkomich.kotlinsample.domain.commands

/**
 * Created by malkomich on 22/05/2016.
 */
interface KotlinCommand<T> {
    fun execute(): T
}