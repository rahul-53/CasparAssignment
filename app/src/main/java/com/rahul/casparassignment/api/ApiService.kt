package com.rahul.casparassignment.api

import com.rahul.casparassignment.model.LocationResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("hrportal/public/tracking/viewreport")
    suspend fun getLocation(): Response<LocationResponse>
}