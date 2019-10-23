package com.hiraok.smartcompass

data class Event(
    val eventUrl: String,
    val eventType: String,
    val ownerNickName: String,
    val series: Series?,
    val updateAt: String,
    val lat: String?,
    val startedAt: String,
    val hashTag: String,
    val title: String,
    val eventId: Int,
    val lon: String?,
    val waiting: Int,
    val limit: Int,
    val ownerId: Int,
    val ownerDisplayName: String,
    val description: String,
    val address: String,
    val catch: String,
    val accepted: Int,
    val endedAt: String,
    val place: String
)