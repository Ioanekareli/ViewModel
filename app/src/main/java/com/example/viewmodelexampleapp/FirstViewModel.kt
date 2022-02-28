package com.example.viewmodelexampleapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstViewModel : ViewModel() {

    val number:MutableLiveData<String> by lazy {
        MutableLiveData<String>().also {
            getRandomNumber()
        }
    }

    private fun getRandomNumber() = (-10..10).random().toString()

    fun getNumber():LiveData<String>{
        return number
    }


}