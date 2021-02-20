package com.example.demoadapter.data

interface OperationalCallback<T> {

    fun onSuccess(data: List<T>?)
    fun onError(error: String?)

}