package com.example.aswaq.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.aswaq.R
import com.example.aswaq.databinding.FragmentInterfaceeBinding
import com.bumptech.glide.Glide


class Interfacee : Fragment(R.layout.fragment_interfacee) {
    private lateinit var binding: FragmentInterfaceeBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInterfaceeBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()

        binding.logo.setOnClickListener()
        {navController.navigate(R.id.action_interface1_to_logIn)}
    }
}