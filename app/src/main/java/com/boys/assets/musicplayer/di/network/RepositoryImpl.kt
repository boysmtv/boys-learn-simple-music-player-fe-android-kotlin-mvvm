package com.boys.assets.musicplayer.di.network

import com.boys.assets.musicplayer.activity.music.model.MusicModel
import com.boys.assets.musicplayer.activity.music.model.MusicReqModel
import com.boys.assets.musicplayer.remote.ApiService

class RepositoryImpl (private val apiService: ApiService) : Repository {

    override suspend fun getMusic(model: MusicReqModel): MusicModel {
        return apiService.getMusic(model.term, model.entity)
    }

}