package com.rahul.casparassignment.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    //url =https://aryupay.com/hrportal/public/tracking/viewreport

    fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://aryupay.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}