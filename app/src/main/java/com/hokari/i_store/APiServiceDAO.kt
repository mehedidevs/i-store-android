package com.hokari.i_store

import com.hokari.i_store.datas.ResponseProducts
import retrofit2.Response
import retrofit2.http.GET

interface APiServiceDAO {

    @GET(PRODUCTS)
    suspend fun getAllProduct(): Response<ResponseProducts>


}