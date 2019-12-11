package com.hiraok.smartconnpass

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.hiraok.smartconnpass.data.repository.EventRepository
import kotlinx.coroutines.flow.collect
import javax.inject.Inject


class GetAllEventUseCase @Inject constructor(
    private val repository: EventRepository
) {
    fun execute(): LiveData<List<Event>> = liveData {
        repository.getAllEvent().collect {
            emit(it)
        }
    }

}