package com.hiraok.smartcompass.paging

import androidx.paging.DataSource
import com.hiraok.smartcompass.Event
import com.hiraok.smartcompass.EventAllUseCase
import javax.inject.Inject

class DataSourceFactory @Inject constructor(useCase: EventAllUseCase) :
    DataSource.Factory<Int, Event>() {

    val pageKeyedEventDataSource = PageKeyedEventDataSource(useCase)

    override fun create(): DataSource<Int, Event> {
        return pageKeyedEventDataSource
    }
}