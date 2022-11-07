package com.example.aswaq.ui

import android.content.ClipData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.aswaq.R
import com.example.aswaq.databinding.FragmentDisplayBinding
import com.example.aswaq.model.Adapterr
import com.example.aswaq.model.ArraysGroup

class Display : Fragment(R.layout.fragment_display) {
    private lateinit var binding: FragmentDisplayBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDisplayBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        val res = arguments?.getString("key")
        if (res == "fruit") {
            val obj = ArraysGroup()
            obj.setFruit()
            binding.gridView.adapter = Adapterr(requireContext(), obj.list)
            binding.name.text = "فاكهة"
        } else if (res=="vegetable") {
            val obj = ArraysGroup()
            obj.setVegetable()
            binding.gridView.adapter = Adapterr(requireContext(), obj.list)
            binding.name.text = "خضار"
        }else if(res=="vegetable_fruit"){
            val obj = ArraysGroup()
            obj.setVegetableFruit()
            binding.gridView.adapter = Adapterr(requireContext(), obj.list)
            binding.name.text = "المنتجات المطلوب التعاقد عليها"
        }
    }
}