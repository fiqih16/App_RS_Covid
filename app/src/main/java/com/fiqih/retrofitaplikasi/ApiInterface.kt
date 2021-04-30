package com.fiqih.retrofitaplikasi

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("api/id/covid19/hospitals")
    fun getCEOs(): Call<ArrayList<CEOModel>>
}