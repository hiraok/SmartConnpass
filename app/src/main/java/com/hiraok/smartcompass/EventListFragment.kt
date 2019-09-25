package com.hiraok.smartcompass


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.hiraok.smartcompass.databinding.FragmentEventListBinding

/**
 * A simple [Fragment] subclass.
 */
class EventListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentEventListBinding>(
            inflater,
            R.layout.fragment_event_list,
            container,
            false
        )
        return binding.root
    }


}
