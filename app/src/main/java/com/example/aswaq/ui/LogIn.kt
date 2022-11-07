package com.example.aswaq.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.example.aswaq.R
import com.example.aswaq.databinding.FragmentInterfaceeBinding
import com.example.aswaq.databinding.FragmentLogInBinding

class LogIn : Fragment(R.layout.fragment_log_in) {
    private lateinit var binding: FragmentLogInBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLogInBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()

        Glide.with(requireContext()).load(R.drawable.pic).into(binding.imageView3)
        binding.tg.setOnClickListener()
        { navController.navigate(R.id.action_logIn_to_tager_Fragment) }
        binding.mn.setOnClickListener()
        { navController.navigate(R.id.action_logIn_to_monshaa_Fragment) }
        binding.mz.setOnClickListener()
        { navController.navigate(R.id.action_logIn_to_mazarieFragment) }

    }
}