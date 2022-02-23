package com.rahul.casparassignment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rahul.casparassignment.model.LocationResponse
import com.rahul.casparassignment.repository.LocationRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LocationViewModel:ViewModel() {
    private val repository= LocationRepository()
    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getLocation()
        }
    }
    val location: LiveData<LocationResponse>
        get() = repository.locations
}