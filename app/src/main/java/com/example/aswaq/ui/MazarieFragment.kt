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
import com.example.aswaq.databinding.FragmentDisplayBinding
import com.example.aswaq.databinding.FragmentMazarieBinding


class MazarieFragment : Fragment(R.layout.fragment_mazarie_) {
    private lateinit var binding: FragmentMazarieBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMazarieBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        binding.next.setOnClickListener()
        {
            val bundle = bundleOf("key" to "vegetable_fruit")
            it.findNavController().navigate(R.id.action_mazarieFragment_to_display, bundle)
        }
    }
}