package com.example.demoadapter.model

import com.example.demoadapter.data.OperationalCallback

class MuseumRepository(private val museumDataSource: MuseumDataSource) {
    fun fetchMuseums(callback: OperationalCallback<Museum>) {
        museumDataSource.retreiveMuseums(callback);
    }

    fun cancel() {
        museumDataSource.cancel()
    }
}