package com.example.partidotracker.ui.partido

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.partidotracker.R
import com.example.partidotracker.databinding.FragmentPartidoBinding

//Creating the fragments that will be used in the project
class PartidoFragment : Fragment() {
    private lateinit var binding: FragmentPartidoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPartidoBinding.inflate(inflater, container, false)
        return binding.root
    }
}