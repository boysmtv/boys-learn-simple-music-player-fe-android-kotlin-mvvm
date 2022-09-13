package com.boys.assets.musicplayer.di

import com.boys.assets.musicplayer.di.network.Repository
import com.boys.assets.musicplayer.di.network.RepositoryImpl
import com.boys.assets.musicplayer.remote.ApiService

fun createRepository(apiService: ApiService): Repository {
    return RepositoryImpl(apiService)
}