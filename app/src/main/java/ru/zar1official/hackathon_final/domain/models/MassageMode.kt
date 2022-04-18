package ru.zar1official.hackathon_final.domain.models

sealed class MassageMode {
    object None : MassageMode()
    object Vibration : MassageMode()
    object AirCompression : MassageMode()
}