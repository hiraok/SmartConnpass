package com.hiraok.smartcompass

import com.hiraok.smartcompass.response.EventResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CompassApi {
    @GET("/api/v1/event/")
    suspend fun getEvent(
        @Query("event_id") eventId: String,
        @Query("keyword") keyword: String,
        @Query("keyword_or") keywordOr: String,
        @Query("ym") ym: Int,
        @Query("ymd") ymd: Int,
        @Query("nickname") nickName: String,
        @Query("owner_nickname") ownerNickName: String,
        @Query("series_id") seriesId: Int,
        @Query("start") start: Int,
        @Query("order") order: Int,
        @Query("count") count: Int,
        @Query("format") format: String
    ): EventResponse
}
