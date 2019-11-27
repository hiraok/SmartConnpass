package com.hiraok.smartconnpass

import androidx.paging.AsyncPagedListDiffer
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListUpdateCallback
import com.xwray.groupie.Group
import com.xwray.groupie.GroupDataObserver
import com.xwray.groupie.Item

class PagedListGroup<T : Item<*>> : Group, GroupDataObserver {

    private var dataObserver: GroupDataObserver? = null

    private val listUpdateCallback = object : ListUpdateCallback {

        override fun onChanged(position: Int, count: Int, payload: Any?) {
            dataObserver?.onItemRangeInserted(PagedListGroup<T>(), position, count)
        }

        override fun onMoved(fromPosition: Int, toPosition: Int) {
            dataObserver?.onItemMoved(PagedListGroup<T>(), fromPosition, toPosition)
        }

        override fun onInserted(position: Int, count: Int) {
            dataObserver?.onItemRangeInserted(PagedListGroup<T>(), position, count)
        }

        override fun onRemoved(position: Int, count: Int) {
            dataObserver?.onItemRangeRemoved(PagedListGroup<T>(), position, count)
        }

    }

    private val differ: AsyncPagedListDiffer<T> = AsyncPagedListDiffer<T>(
        listUpdateCallback,
        AsyncDifferConfig.Builder(object : DiffUtil.ItemCallback<T>() {
            override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
                return newItem.isSameAs(oldItem)
            }

            override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
                return newItem.equals(oldItem)
            }

        }).build()
    )

    override fun registerGroupDataObserver(groupDataObserver: GroupDataObserver) {
        this.dataObserver = groupDataObserver
    }

    override fun unregisterGroupDataObserver(groupDataObserver: GroupDataObserver) {
        this.dataObserver = null
    }

    override fun getItemCount(): Int = differ.itemCount

    override fun getItem(position: Int): Item<*> {
        val item = differ.getItem(position) as Item<*>
        item.registerGroupDataObserver(this)
        return item
    }

    override fun getPosition(item: Item<*>): Int {
        val currentList = differ.currentList ?: return -1
        return currentList.indexOf(item)
    }


    override fun onChanged(group: Group) {
        dataObserver?.onChanged(group)
    }

    override fun onItemRangeRemoved(group: Group, positionStart: Int, itemCount: Int) {
        val index = differ.currentList?.indexOf(group) ?: -1
        if (index > 0) {
            dataObserver?.onItemRangeRemoved(group, positionStart, itemCount)
        }
    }

    override fun onItemInserted(group: Group, position: Int) {
        val index = differ.currentList?.indexOf(group) ?: -1
        if (index > 0) {
            dataObserver?.onItemInserted(group, position)
        }
    }

    override fun onItemRemoved(group: Group, position: Int) {
        val index = differ.currentList?.indexOf(group) ?: -1
        if (index > 0) {
            dataObserver?.onItemRemoved(group, position)
        }
    }

    override fun onItemChanged(group: Group, position: Int) {
        val index = differ.currentList?.indexOf(group) ?: -1
        if (index > 0) {
            dataObserver?.onItemChanged(group, position)
        }
    }

    override fun onItemChanged(group: Group, position: Int, payload: Any?) {
        val index = differ.currentList?.indexOf(group) ?: -1
        if (index > 0) {
            dataObserver?.onItemChanged(group, position, payload)
        }
    }

    override fun onItemRangeInserted(group: Group, positionStart: Int, itemCount: Int) {
        val index = differ.currentList?.indexOf(group) ?: -1
        if (index > 0) {
            dataObserver?.onItemRangeInserted(group, positionStart, itemCount)
        }
    }

    override fun onItemMoved(group: Group, fromPosition: Int, toPosition: Int) {
        val index = differ.currentList?.indexOf(group) ?: -1
        if (index > 0) {
            dataObserver?.onItemMoved(group, fromPosition, toPosition)
        }
    }

    override fun onItemRangeChanged(group: Group, positionStart: Int, itemCount: Int) {
        val index = differ.currentList?.indexOf(group) ?: -1
        if (index > 0) {
            dataObserver?.onItemRangeChanged(group, positionStart, itemCount)
        }
    }

    override fun onItemRangeChanged(
        group: Group,
        positionStart: Int,
        itemCount: Int,
        payload: Any?
    ) {
        val index = differ.currentList?.indexOf(group) ?: -1
        if (index > 0) {
            dataObserver?.onItemRangeChanged(group, positionStart, itemCount, payload)
        }
    }

}