package com.boys.assets.musicplayer.activity.music.usecase

import com.boys.assets.musicplayer.activity.music.model.MusicModel
import com.boys.assets.musicplayer.activity.music.model.MusicReqModel
import com.boys.assets.musicplayer.di.network.Repository
import com.boys.assets.musicplayer.domain.usecase.UseCase

class MusicUC constructor(
    private val repository: Repository
) : UseCase<MusicModel, Any?>() {

    private val TAG = this::class.java.simpleName

    override suspend fun run(params: Any?): MusicModel {
        return repository.getMusic(params as MusicReqModel)
    }

}