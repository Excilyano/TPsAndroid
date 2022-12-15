package com.example.tps.safeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.tps.R
import com.example.tps.databinding.FragmentHistoireBinding

class HistoireFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentHistoireBinding>(inflater, R.layout.fragment_histoire, container, false)

        val args = arguments?.let{ HistoireFragmentArgs.fromBundle(it)}
        binding.histoire = args?.histoire

        return binding.root
    }
}