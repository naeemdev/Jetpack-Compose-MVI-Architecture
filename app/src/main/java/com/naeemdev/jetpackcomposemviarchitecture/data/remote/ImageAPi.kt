package com.naeemdev.jetpackcomposemviarchitecture.data.remote

import com.naeemdev.jetpackcomposemviarchitecture.data.remote.dto.ImageListDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ImageAPi {
    @GET("search")
    suspend fun getImages(
        @Query("q") q:String
    ):ImageListDto
}