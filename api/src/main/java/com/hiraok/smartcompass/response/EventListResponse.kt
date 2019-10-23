package com.hiraok.smartcompass.response

import com.squareup.moshi.Json

data class EventListResponse(
    @field:Json(name = "events") val events: List<EventResponse>,
    @field:Json(name = "results_start") val resultStarts: Int,
    @field:Json(name = "results_available") val resultsAvailable: Int
)

