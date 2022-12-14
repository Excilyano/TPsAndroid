package com.example.tps.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.tps.R
import com.example.tps.databinding.FragmentWhiteBinding

class WhiteFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentWhiteBinding>(inflater, R.layout.fragment_white, container, false)
        binding.btnGoWhite.setOnClickListener {
            if (binding.etPrenom.text.length > 10) {
                Navigation.findNavController(it).navigate(R.id.action_whiteFragment_to_pinkFragment)
            } else {
                Navigation.findNavController(it).navigate(R.id.action_whiteFragment_to_redFragment)
            }
        }

        return binding.root
    }
}