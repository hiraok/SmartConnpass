package com.hiraok.smartconnpass.data.repository

import com.hiraok.smartconnpass.CompassApi
import com.hiraok.smartconnpass.Event
import com.hiraok.smartconnpass.response.EventResponse
import javax.inject.Inject

class EventRepository @Inject constructor(
    private val compassApi: CompassApi
) {

    suspend fun getEventAll(): List<Event> = compassApi.getEventAll().events.map { it.toDomain() }

    private fun EventResponse.toDomain(): Event {
        return Event(
            eventUrl = eventUrl,
            eventType = eventType,
            ownerNickName = ownerNickName,
            updateAt = updateAt,
            series = series,
            lat = lat,
            startedAt = startedAt,
            hashTag = hashTag,
            title = title,
            eventId = eventId,
            lon = lon,
            waiting = waiting,
            limit = limit,
            ownerId = ownerId,
            ownerDisplayName = ownerDisplayName,
            description = description,
            address = address,
            catch = catch,
            accepted = accepted,
            endedAt = endedAt,
            place = place
        )
    }
}