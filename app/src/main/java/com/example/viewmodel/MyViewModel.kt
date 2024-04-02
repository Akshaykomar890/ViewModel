package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    //Model
    private var count = 0

    fun getIntialCount():Int{
        return count
    }

    fun getUpdatedCounter():Int{
        return ++count
    }

}

