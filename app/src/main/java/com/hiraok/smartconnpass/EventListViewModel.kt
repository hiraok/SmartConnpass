package com.hiraok.smartconnpass

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class EventListViewModel @Inject constructor(
    private val eventAllUseCase: EventAllUseCase
) : ViewModel() {

    val eventList = MutableLiveData<List<Event>>()

    fun eventList() {
        viewModelScope.launch {
            eventAllUseCase.execute().collect {
                eventList.postValue(it)
            }
        }
    }
}