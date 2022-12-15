package com.example.tps.safeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.tps.R
import com.example.tps.databinding.FragmentSafeArgsBinding

class SafeArgsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentSafeArgsBinding>(inflater, R.layout.fragment_safe_args, container, false)

        binding.btnGoHistoire.setOnClickListener {
            val action = SafeArgsFragmentDirections.actionSafeArgsFragmentToHistoireFragment()
            action.histoire = Histoire(binding.etPrenomHistoire.text.toString(), binding.etLieuHistoire.text.toString())

            Navigation.findNavController(it).navigate(action)
        }

        return binding.root
    }
}