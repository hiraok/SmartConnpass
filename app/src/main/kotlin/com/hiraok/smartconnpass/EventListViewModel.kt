package com.hiraok.smartconnpass

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class EventListViewModel @Inject constructor(
    private val getAllEventUseCase: GetAllEventUseCase
) : ViewModel() {
    val eventList = getAllEventUseCase.execute()
}