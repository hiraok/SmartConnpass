package com.hiraok.smartcompass.data.repository

import com.hiraok.smartcompass.*
import javax.inject.Inject

class EventRepository @Inject constructor(
    private val compassApi: CompassApi
) {

    suspend fun getEvent(
        eventId: EventId,
        keyword: String,
        keywordOr: String,
        ym: Int,
        ymd: Int,
        nickName: NickName,
        ownerNickName: String,
        seriesId: SeriesId,
        start: Int,
        order: Int,
        count: Int
    ): List<Event> {
        return compassApi.getEvent(
            eventId = eventId.id,
            keyword = keyword,
            keywordOr = keywordOr,
            ym = ym,
            ymd = ymd,
            nickName = nickName.nickName,
            ownerNickName = ownerNickName,
            seriesId = seriesId.id,
            start = start,
            order = order,
            count = count,
            format = "json"
        ).events
    }
}