package com.baskara.twowaysdatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var text = MutableLiveData<String>()

    init {
        text.value = "Test"
    }
}