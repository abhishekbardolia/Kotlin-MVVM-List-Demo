package com.emedinaa.kotlinmvvm.di

import androidx.lifecycle.ViewModelProvider
import com.example.demoadapter.data.ApiClient
import com.example.demoadapter.data.MuseumRemoteDataSource
import com.example.demoadapter.model.MuseumDataSource
import com.example.demoadapter.model.MuseumRepository
import com.example.demoadapter.viewmodel.ViewModelFactory

object Injection {

    private val museumDataSource: MuseumDataSource = MuseumRemoteDataSource(ApiClient)
    private val museumRepository = MuseumRepository(museumDataSource)
    private val museumViewModelFactory = ViewModelFactory(museumRepository)


    fun provideViewModelFactory(): ViewModelProvider.Factory {
        return museumViewModelFactory
    }
}