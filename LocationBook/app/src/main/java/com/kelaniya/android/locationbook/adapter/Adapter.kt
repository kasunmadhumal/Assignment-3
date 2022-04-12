package com.kelaniya.android.locationbook.adapter


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kelaniya.android.locationbook.MainActivity
import com.kelaniya.android.locationbook.MapsActivity
import com.kelaniya.android.locationbook.R
import com.kelaniya.android.locationbook.UpdateLocationDetails


class Adapter: RecyclerView.Adapter<CustomViewHolder>(){

    //number of Items
    override fun getItemCount(): Int {
        return 18
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.item_view_design,parent,false)
        return CustomViewHolder(cellForRow)
    }

        override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
            holder.latitude.text  = "-34.0"
            holder.longitude.text = "151.0"
            holder.name.text = "New York"


    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){
    val name: TextView =    itemView.findViewById(R.id.name)
    val latitude: TextView = itemView.findViewById(R.id.latitude)
    val longitude: TextView = itemView.findViewById(R.id.longitude)
    val editBtn: Button = itemView.findViewById(R.id.edit)
    val deleteBtn:Button = itemView.findViewById(R.id.delete)

    init{
        view.setOnClickListener{
         val intent = Intent(view.context, MapsActivity::class.java)
            intent.putExtra("locationName",name.text)
            intent.putExtra("latitude",latitude.text)
            intent.putExtra("longitude",longitude.text)


            view.context.startActivity(intent)

        }

        editBtn.setOnClickListener {

        }

        deleteBtn.setOnClickListener {

        }


    }
}