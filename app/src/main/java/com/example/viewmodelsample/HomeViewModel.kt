package com.example.viewmodelsample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {

    val count = MutableLiveData(0)

    fun increment() {
        count.postValue(count.value?.inc())
    }
}