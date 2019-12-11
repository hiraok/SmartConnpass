package com.hiraok.smartconnpass.paging

import androidx.lifecycle.LifecycleOwner
import androidx.paging.DataSource
import com.hiraok.smartconnpass.Event
import com.hiraok.smartconnpass.GetAllEventUseCase
import com.xwray.groupie.Item
import javax.inject.Inject

class DataSourceFactory<T : Item<*>> @Inject constructor(
    lifecycleOwner: LifecycleOwner,
    useCase: GetAllEventUseCase,
    converter: (Event) -> T
) : DataSource.Factory<Int, T>() {
    private val pageKeyedEventDataSource =
        PageKeyedEventDataSource(lifecycleOwner, useCase, converter)

    override fun create(): DataSource<Int, T> {
        return pageKeyedEventDataSource
    }
}