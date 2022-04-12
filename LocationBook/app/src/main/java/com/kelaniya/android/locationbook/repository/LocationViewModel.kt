package com.kelaniya.android.locationbook.repository

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.kelaniya.android.locationbook.data.Location
import com.kelaniya.android.locationbook.database.LocationDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class LocationViewModel(application: Application) : AndroidViewModel(application) {

    private val readAllData: LiveData<List<Location>>
    private val repository : LocationRepository

    init {
        val locationDao  = LocationDatabase.getDatabase(application).locationDao()
        repository = LocationRepository(locationDao)
        readAllData = repository.readAllData
    }

    fun addLocation(location:Location){
         viewModelScope.launch(Dispatchers.IO) {
             repository.addLocation(location)


         }

        }
    }

