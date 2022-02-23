package com.rahul.casparassignment.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.rahul.casparassignment.api.ApiService
import com.rahul.casparassignment.api.RetrofitInstance
import com.rahul.casparassignment.model.LocationResponse

class LocationRepository {
    fun apiService() = RetrofitInstance.getInstance().create(ApiService::class.java)

    private val locationLiveData = MutableLiveData<LocationResponse>()
    val locations : LiveData<LocationResponse>
        get() = locationLiveData

    suspend fun getLocation(){
        val result = apiService().getLocation()
        if (result?.body()!=null){
            locationLiveData.postValue(result.body())
        }
    }
}