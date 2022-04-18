package ru.zar1official.hackathon_final.domain.models

sealed class MicroclimateType {
    object Comfortable : MicroclimateType()
    object Heating : MicroclimateType()
    object Cooling : MicroclimateType()
}
