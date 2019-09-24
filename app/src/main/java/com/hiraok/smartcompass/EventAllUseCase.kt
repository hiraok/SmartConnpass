package com.hiraok.smartcompass

import com.hiraok.smartcompass.data.repository.EventRepository
import javax.inject.Inject

class EventAllUseCase @Inject constructor(
    private val repository: EventRepository
) {

    suspend fun execute(): List<Event> = repository.getEventAll()
}