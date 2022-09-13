package com.boys.assets.musicplayer.remote

import com.boys.assets.musicplayer.activity.music.model.MusicModel
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {

    @Headers("Content-Type: application/json")
    @GET("search")
    suspend fun getMusic(
        @Query("term") query: String?,
        @Query("entity") sort: String?
    ) : MusicModel

}