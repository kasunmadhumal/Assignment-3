package com.kelaniya.android.locationbook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lacations")
data class Location(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name:String,
    val latitude:String,
    val longitude:String

)


