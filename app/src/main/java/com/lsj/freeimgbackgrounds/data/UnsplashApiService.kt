package com.lsj.freeimgbackgrounds.data

import com.lsj.freeimgbackgrounds.BuildConfig
import com.lsj.freeimgbackgrounds.data.models.PhotoResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface UnsplashApiService {

    @GET("photos/random?" +
            "client_id=${BuildConfig.UNSPLASH_ACCESS_KEY}" +
            "&count=30")
    suspend fun getRandomPhotos(
        @Query("query") query: String?
    ): Response<List<PhotoResponse>>
}