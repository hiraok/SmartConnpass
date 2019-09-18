package response

import Event
import com.squareup.moshi.Json

data class EventResponse(
    @field:Json(name = "events") val events: List<Event>,
    @field:Json(name = "results_start") val resultStarts: Int,
    @field:Json(name = "results_available") val resultsAvailable: Int
)