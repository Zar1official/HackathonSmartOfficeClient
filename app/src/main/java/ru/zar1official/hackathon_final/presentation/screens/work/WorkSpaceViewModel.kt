package ru.zar1official.hackathon_final.presentation.screens.work

import androidx.lifecycle.ViewModel
import ru.zar1official.hackathon_final.domain.usecases.chill.GetChillSpaceStateUseCase
import ru.zar1official.hackathon_final.domain.usecases.work.ChangeBrightUseCase
import ru.zar1official.hackathon_final.domain.usecases.work.ChangeBusyStatusUseCase
import ru.zar1official.hackathon_final.domain.usecases.work.ChangeLightWarmUseCase
import ru.zar1official.hackathon_final.domain.usecases.work.ChangeMicroclimateTypeUseCase

class WorkSpaceViewModel(
    private val getChillSpaceStateUseCase: GetChillSpaceStateUseCase,
    private val changeBrightUseCase: ChangeBrightUseCase,
    private val changeBusyStatusUseCase: ChangeBusyStatusUseCase,
    private val changeMicroclimateTypeUseCase: ChangeMicroclimateTypeUseCase,
    private val changeLightWarmUseCase: ChangeLightWarmUseCase
) :
    ViewModel() {
}