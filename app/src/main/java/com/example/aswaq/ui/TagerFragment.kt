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
import com.bumptech.glide.Glide
import com.example.aswaq.R
import com.example.aswaq.databinding.FragmentMonshaaBinding
import com.example.aswaq.databinding.FragmentTagerBinding


class Tager_Fragment : Fragment(R.layout.fragment_tager_) {
    private lateinit var binding: FragmentTagerBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTagerBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        Glide.with(requireContext()).load(R.drawable.pic2).into(binding.imageView3)
        binding.fr.setOnClickListener()
        {
            val bundle = bundleOf("key" to "fruit")
            it.findNavController().navigate(R.id.action_tager_Fragment_to_display, bundle)
        }
        binding.veg.setOnClickListener()
        {
            val bundle = bundleOf("key" to "vegetable")
            it.findNavController().navigate(R.id.action_tager_Fragment_to_display, bundle)
        }
    }
}