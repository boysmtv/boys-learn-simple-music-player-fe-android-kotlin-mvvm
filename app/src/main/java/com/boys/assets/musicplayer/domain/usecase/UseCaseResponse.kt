package com.boys.assets.musicplayer.domain.usecase

import com.boys.assets.musicplayer.domain.model.ApiError

interface UseCaseResponse<Type> {

    fun onSuccess(result: Type)

    fun onError(apiError: ApiError)

}

