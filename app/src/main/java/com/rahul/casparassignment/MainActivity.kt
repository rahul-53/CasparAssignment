package com.rahul.casparassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rahul.casparassignment.adapter.LocationAdapter
import com.rahul.casparassignment.databinding.ActivityMainBinding
import com.rahul.casparassignment.viewmodel.LocationViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel:LocationViewModel
    private lateinit var layoutManager:RecyclerView.LayoutManager
    lateinit var locationsAdapter:LocationAdapter

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = ViewModelProvider(this)[LocationViewModel::class.java]
        viewModel.location.observe(this, Observer {
            Log.d("hello", "data getting")
        })
    }

   /* private fun setRecyclerView(){
        locationsAdapter = LocationAdapter()
        binding.rvLocations.apply {
            adapter = LocationAdapter()
            layoutManager = LinearLayoutManager(activity)
        }
    }*/
}