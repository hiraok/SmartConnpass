package com.hiraok.smartcompass

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class EventViewModel @Inject constructor(
    private val eventAllUseCase: EventAllUseCase
) : ViewModel() {

    private val eventData = MutableLiveData<List<Event>>()

    fun eventAll() {
        viewModelScope.launch {
            val list = eventAllUseCase.execute()
            eventData.postValue(list)
        }
    }
}