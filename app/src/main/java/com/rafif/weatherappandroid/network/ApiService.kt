package com.rafif.weatherappandroid.network

import ForecastResponse
import com.rafif.weatherappandroid.BuildConfig
import com.rafif.weatherappandroid.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather")
    fun weatherByCity(
        @Query("q") city: String,
        @Query("appid") api_key: String = BuildConfig.API_KEY
    ) : Call<WeatherResponse>

    @GET("forecast")
    fun forecastByCity(
        @Query("q") city: String,
        @Query("appid") api_key: String = BuildConfig.API_KEY
    ) : Call<ForecastResponse>

    @GET("weather")
    fun weatherByCurrentLocation(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") api_key: String = BuildConfig.API_KEY
    ) : Call<WeatherResponse>

    @GET("forecast")
    fun forecastByCurrentLocation(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") api_key: String = BuildConfig.API_KEY
    ) : Call<ForecastResponse>
}