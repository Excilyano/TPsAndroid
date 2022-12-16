package com.example.tps.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.tps.R
import com.example.tps.databinding.FragmentLancerDeDeBinding

class LancerDeDeFragment : Fragment() {

    lateinit var viewModel: DeViewModel
    lateinit var binding: FragmentLancerDeDeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_lancer_de_de, container, false)
        viewModel = ViewModelProvider(this)[DeViewModel::class.java]

        binding.vm = viewModel

        binding.btnLancerDe.setOnClickListener{
            viewModel.lancerDe()
            binding.vm = viewModel
        }

        return binding.root
    }
}