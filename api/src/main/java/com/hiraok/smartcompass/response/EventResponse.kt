package com.hiraok.smartcompass.response

import com.hiraok.smartcompass.Series
import com.squareup.moshi.Json

data class EventResponse(
    @field:Json(name = "event_url") val eventUrl: String,
    @field:Json(name = "event_type") val eventType: String,
    @field:Json(name = "owner_nickname") val ownerNickName: String,
    @field:Json(name = "series") val series: Series?,
    @field:Json(name = "updated_at") val updateAt: String,
    @field:Json(name = "lat") val lat: String?,
    @field:Json(name = "started_at") val startedAt: String,
    @field:Json(name = "hash_tag") val hashTag: String,
    @field:Json(name = "title") val title: String,
    @field:Json(name = "event_id") val eventId: Int,
    @field:Json(name = "lon") val lon: String?,
    @field:Json(name = "waiting") val waiting: Int,
    @field:Json(name = "limit") val limit: Int?,
    @field:Json(name = "owner_id") val ownerId: Int,
    @field:Json(name = "owner_display_name") val ownerDisplayName: String,
    @field:Json(name = "description") val description: String,
    @field:Json(name = "address") val address: String,
    @field:Json(name = "catch") val catch: String,
    @field:Json(name = "accepted") val accepted: Int,
    @field:Json(name = "ended_at") val endedAt: String,
    @field:Json(name = "place") val place: String
)