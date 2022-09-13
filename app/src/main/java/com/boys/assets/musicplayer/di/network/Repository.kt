package com.boys.assets.musicplayer.di.network

import com.boys.assets.musicplayer.activity.music.model.MusicModel
import com.boys.assets.musicplayer.activity.music.model.MusicReqModel

interface Repository {

    suspend fun getMusic(model: MusicReqModel): MusicModel

}