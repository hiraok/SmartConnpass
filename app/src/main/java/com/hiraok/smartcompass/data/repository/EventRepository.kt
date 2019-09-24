package com.hiraok.smartcompass.data.repository

import com.hiraok.smartcompass.CompassApi
import com.hiraok.smartcompass.Event
import javax.inject.Inject

class EventRepository @Inject constructor(
    private val compassApi: CompassApi
) {

    suspend fun getEventAll(
    ): List<Event> {
        return compassApi.getEventAll().events
    }
}