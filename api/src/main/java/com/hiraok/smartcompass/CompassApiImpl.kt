package com.hiraok.smartcompass

import com.hiraok.smartcompass.response.EventResponse
import retrofit2.Retrofit
import javax.inject.Inject

class CompassApiImpl @Inject constructor(
    private val retrofit: Retrofit
) : CompassApi {
    override suspend fun getEvent(
        eventId: String,
        keyword: String,
        keywordOr: String,
        ym: Int,
        ymd: Int,
        nickName: String,
        ownerNickName: String,
        seriesId: Int,
        start: Int,
        order: Int,
        count: Int,
        format: String
    ): EventResponse {
        val retrofit = retrofit.create(CompassApi::class.java)
        return retrofit.getEvent(
            eventId = eventId,
            keyword = keyword,
            keywordOr = keywordOr,
            ym = ym,
            ymd = ymd,
            nickName = nickName,
            ownerNickName = ownerNickName,
            seriesId = seriesId,
            start = start,
            order = order,
            count = count,
            format = format
        )
    }

}