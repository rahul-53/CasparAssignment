package com.rahul.casparassignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahul.casparassignment.databinding.LocationLayoutBinding
import com.rahul.casparassignment.model.LocationResponse
import com.rahul.casparassignment.viewmodel.LocationViewModel

class LocationAdapter( private val locations:List<LocationResponse>)
    :RecyclerView.Adapter<LocationAdapter.LocationViewHolder>() {

    inner class LocationViewHolder(val itemBinding:LocationLayoutBinding):RecyclerView.ViewHolder(itemBinding.root){
        fun bindData(item: LocationResponse){
            itemBinding.locations = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemBinding=LocationLayoutBinding.inflate(inflater,parent, false)
        return LocationViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
        holder.bindData(locations[position])

    }

    override fun getItemCount(): Int {
       return locations.size
    }


}