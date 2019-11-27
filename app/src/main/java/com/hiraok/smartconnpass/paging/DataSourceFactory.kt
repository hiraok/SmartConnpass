package com.hiraok.smartconnpass.paging

import androidx.paging.DataSource
import com.hiraok.smartconnpass.Event
import com.hiraok.smartconnpass.EventAllUseCase
import javax.inject.Inject

class DataSourceFactory @Inject constructor(useCase: EventAllUseCase) :
    DataSource.Factory<Int, Event>() {

    val pageKeyedEventDataSource = PageKeyedEventDataSource(useCase)

    override fun create(): DataSource<Int, Event> {
        return pageKeyedEventDataSource
    }
}