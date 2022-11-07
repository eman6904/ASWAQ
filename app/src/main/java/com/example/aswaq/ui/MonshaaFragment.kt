package com.example.aswaq.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.aswaq.R
import com.example.aswaq.databinding.FragmentMazarieBinding
import com.example.aswaq.databinding.FragmentMonshaaBinding

class Monshaa_Fragment : Fragment(R.layout.fragment_monshaa_) {
    private lateinit var binding: FragmentMonshaaBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMonshaaBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()

        binding.fr2.setOnClickListener()
        {
            val bundle = bundleOf("key" to "fruit")
            it.findNavController().navigate(R.id.action_monshaa_Fragment_to_display, bundle)
        }
        binding.veg2.setOnClickListener()
        {
            val bundle = bundleOf("key" to "vegetable")
            it.findNavController().navigate(R.id.action_monshaa_Fragment_to_display, bundle)
        }
    }
}