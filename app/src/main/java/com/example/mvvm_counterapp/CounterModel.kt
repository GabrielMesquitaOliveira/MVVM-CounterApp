package com.example.mvvm_counterapp

data class CounterModel(var count : Int)

class CounterRepository {
    private var _counterModel = CounterModel(0)

    fun getCounter() = _counterModel

    fun incrementCounter() {
        _counterModel.count++
    }

    fun decrementCounter() {
        _counterModel.count--
    }
}