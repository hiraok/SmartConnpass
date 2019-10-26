package com.hiraok.smartcompass.paging

import androidx.paging.PageKeyedDataSource
import com.hiraok.smartcompass.Event
import com.hiraok.smartcompass.EventAllUseCase
import com.xwray.groupie.Item
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class PageKeyedEventDataSource<T : Item<*>>(
    private val useCase: EventAllUseCase,
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
        GlobalScope.launch {
            useCase.execute().collect {
                callback(it, next)
                next = page + 1
            }
        }

    }
}