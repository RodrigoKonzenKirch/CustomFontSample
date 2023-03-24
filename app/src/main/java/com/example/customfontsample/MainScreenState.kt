package com.example.customfontsample

import kotlinx.coroutines.flow.Flow

data class MainScreenState(
    val listContent: Flow<List<String>>
)