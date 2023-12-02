package com.hokari.i_store

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {


    private fun getRetrofitInstance() =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun getApiDAO() = getRetrofitInstance().create(APiServiceDAO::class.java)

}