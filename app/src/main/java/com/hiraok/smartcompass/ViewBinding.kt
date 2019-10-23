package com.hiraok.smartcompass

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter(value = ["items"])
fun RecyclerView.setItems(items: List<Event>?) {
    items ?: return
    (adapter as EventListAdapter).update(items)
}