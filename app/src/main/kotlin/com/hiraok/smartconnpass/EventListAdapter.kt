package com.hiraok.smartconnpass

import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Section

class EventListAdapter : GroupAdapter<GroupieViewHolder>() {

    fun update(items: List<com.hiraok.smartconnpass.Event>) {
        items.forEach {
            val section = Section().apply {
                add(EventItem(it))
            }
            add(section)
        }
    }
}