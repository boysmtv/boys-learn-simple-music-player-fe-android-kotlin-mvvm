package com.boys.assets.musicplayer.activity.music.presentation

import com.boys.assets.musicplayer.activity.music.model.MusicResultModel
import com.boys.assets.musicplayer.databinding.ActivitySearchListItemBinding

interface SearchOnClickListener<T> {
    fun onItemClick(itemBinding: ActivitySearchListItemBinding, position: Int, model: MusicResultModel)
}