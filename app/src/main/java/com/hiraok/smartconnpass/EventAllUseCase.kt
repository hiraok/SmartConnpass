package com.hiraok.smartconnpass

import com.hiraok.smartconnpass.data.repository.EventRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class EventAllUseCase @Inject constructor(
    private val repository: EventRepository
) {

    suspend fun execute(): Flow<List<Event>> = flow {
        emit(repository.getEventAll())
    }
}