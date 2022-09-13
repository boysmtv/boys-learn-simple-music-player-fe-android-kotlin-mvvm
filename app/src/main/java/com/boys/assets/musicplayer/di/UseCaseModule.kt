package com.boys.assets.musicplayer.di

import com.boys.assets.musicplayer.activity.music.usecase.MusicUC
import com.boys.assets.musicplayer.di.network.Repository

fun getMusicUC(repository: Repository): MusicUC {
    return MusicUC(repository)
}