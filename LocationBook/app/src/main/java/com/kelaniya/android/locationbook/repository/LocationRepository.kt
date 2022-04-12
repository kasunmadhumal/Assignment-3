package com.kelaniya.android.locationbook.repository

import androidx.lifecycle.LiveData
import com.kelaniya.android.locationbook.dao.LocationDao
import com.kelaniya.android.locationbook.data.Location

class LocationRepository(private val locationDao: LocationDao) {

    val readAllData:LiveData<List<Location>> = locationDao.readAllData()

    suspend fun addLocation(location: Location){
        locationDao.addLocation(location)
    }
}