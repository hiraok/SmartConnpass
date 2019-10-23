package com.hiraok.smartcompass.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.hiraok.smartcompass.R
import com.hiraok.smartcompass.databinding.FragmentMyPageBinding

/**
 * A simple [Fragment] subclass.
 */
class MyPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMyPageBinding>(
            inflater,
            R.layout.fragment_my_page,
            container,
            false
        )
        return binding.root
    }


}
