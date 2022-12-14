package com.example.tps.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.tps.R
import com.example.tps.databinding.FragmentPinkBinding
import com.example.tps.databinding.FragmentWhiteBinding

class PinkFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentPinkBinding>(inflater, R.layout.fragment_pink, container, false)
        binding.btnGoPink.setOnClickListener {
            if (binding.etNomPink.text.length + binding.etNaissance.text.toString().toInt() > 2000) {
                Navigation.findNavController(it).navigate(R.id.action_pinkFragment_to_greenFragment)
            } else {
                Navigation.findNavController(it).navigate(R.id.action_pinkFragment_to_yellowFragment)
            }
        }

        return binding.root
    }
}