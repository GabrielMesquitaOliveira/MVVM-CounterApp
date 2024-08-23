package com.example.mvvm_counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel(){
    private val _repository: CounterRepository = CounterRepository()
    private val _count = mutableStateOf(_repository.getCounter().count)

    // Expose the count as an immutable state
    val count: MutableState<Int> = _count

    fun incrementCount() {
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decrementCount() {
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }


}