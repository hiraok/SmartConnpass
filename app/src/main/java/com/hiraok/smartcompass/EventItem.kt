package com.hiraok.smartcompass

import com.hiraok.smartcompass.databinding.EventItemBinding
import com.xwray.groupie.databinding.BindableItem
import org.jsoup.Jsoup

class EventItem(
    private val event: Event
) : BindableItem<EventItemBinding>() {
    override fun getLayout(): Int = R.layout.event_item

    override fun bind(viewBinding: EventItemBinding, position: Int) {
        viewBinding.apply {
            title.text = event.title
            startDate.text = event.startedAt
            endDate.text = event.endedAt
            desc.text = Jsoup.parse(event.description).text()
        }
    }
}