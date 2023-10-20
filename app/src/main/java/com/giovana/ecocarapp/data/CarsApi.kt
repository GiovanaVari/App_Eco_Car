package com.giovana.ecocarapp.data

import com.giovana.ecocarapp.domain.Carro
import retrofit2.Call
import retrofit2.http.GET

interface CarsApi {

    @GET("cars.json")
    fun getAllCars(): Call<List<Carro>>

}