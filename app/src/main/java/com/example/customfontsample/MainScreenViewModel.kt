package com.example.customfontsample

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainsScreenViewModel(
    repository: Repository = Repository()
): ViewModel() {
    private var _state = mutableStateOf(MainScreenState(repository.data))
    val state: State<MainScreenState> = _state
}