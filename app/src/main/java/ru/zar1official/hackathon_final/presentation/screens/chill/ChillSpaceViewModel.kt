package ru.zar1official.hackathon_final.presentation.screens.chill

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.zar1official.hackathon_final.domain.usecases.chill.ChangeMassageModeUseCase
import ru.zar1official.hackathon_final.domain.usecases.chill.GetChillSpaceStateUseCase

class ChillSpaceViewModel(
    private val getChillSpaceStateUseCase: GetChillSpaceStateUseCase,
    private val changeMassageModeUseCase: ChangeMassageModeUseCase
) :
    ViewModel() {
    val state = MutableLiveData<String>("0")
}