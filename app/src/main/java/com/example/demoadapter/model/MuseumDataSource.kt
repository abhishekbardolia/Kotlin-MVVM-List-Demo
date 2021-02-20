package com.example.demoadapter.model

import com.example.demoadapter.data.OperationalCallback

interface MuseumDataSource {
fun retreiveMuseums(callback:OperationalCallback<Museum>)
fun cancel()
}