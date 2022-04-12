package com.kelaniya.android.locationbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.kelaniya.android.locationbook.repository.LocationViewModel

class AddLocationActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_location)

        val addLocationBtn: Button = findViewById(R.id.save)
        addLocationBtn.setOnClickListener {
            insertDataToDatabase()
        }
    }

    private fun insertDataToDatabase(){

    }
}