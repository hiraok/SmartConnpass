package com.hiraok.smartconnpass.paging

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.paging.PageKeyedDataSource
import com.hiraok.smartconnpass.Event
import com.hiraok.smartconnpass.GetAllEventUseCase
import com.xwray.groupie.Item

class PageKeyedEventDataSource<T : Item<*>>(
    private val lifecycleOwner: LifecycleOwner,
    private val useCase: GetAllEventUseCase,
    private val converter: (Event) -> T
) : PageKeyedDataSource<Int, T>() {

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, T>
    ) {
        call(1) { events, start ->
            callback.onResult(events.map { converter(it) }, null, start)
        }
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, T>) {
        call(params.key) { events, start ->
            callback.onResult(events.map { converter(it) }, start)
        }
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, T>) {
    }

    private fun call(
        page: Int,
        callback: (events: List<Event>, start: Int) -> Unit
    ) {

        var next = 0
        useCase.execute().observe(lifecycleOwner, Observer {
            callback(it, next)
        })
        next = page + 10

    }
}