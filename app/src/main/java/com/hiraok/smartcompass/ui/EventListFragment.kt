package com.hiraok.smartcompass.ui


import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.hiraok.smartcompass.EventListAdapter
import com.hiraok.smartcompass.EventListViewModel
import com.hiraok.smartcompass.R
import com.hiraok.smartcompass.ViewModelFactory
import com.hiraok.smartcompass.databinding.FragmentEventListBinding
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 */
class EventListFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private val eventListViewModel: EventListViewModel by viewModels { viewModelFactory }

    private lateinit var binding: FragmentEventListBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_event_list,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupRecyclerView()
        binding.lifecycleOwner = this
        binding.viewModel = eventListViewModel
        eventListViewModel.eventList()
    }

    private fun setupRecyclerView() {
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = EventListAdapter()
        }
    }
}
