package com.example.tps.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.tps.R
import com.example.tps.databinding.FragmentRedBinding
import com.example.tps.databinding.FragmentWhiteBinding

class RedFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentRedBinding>(inflater, R.layout.fragment_red, container, false)
        binding.btnGoRed.setOnClickListener {
            if (binding.etNom.text.length + binding.etHasard.text.length > 10) {
                Navigation.findNavController(it).navigate(R.id.action_redFragment_to_blueFragment)
            } else {
                Navigation.findNavController(it).navigate(R.id.action_redFragment_to_orangeFragment)
            }
        }

        return binding.root
    }
}