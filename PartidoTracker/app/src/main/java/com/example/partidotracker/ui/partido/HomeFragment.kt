package com.example.partidotracker.ui.partido

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.partidotracker.R
import com.example.partidotracker.databinding.FragmentHomeBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

//Creating the fragments that will be used in the project\
//Implementing navigation component to all fragments for navigation flow
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var buttonNewPartido: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()

        buttonNewPartido.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_newPartidoFragment)
        }

    }
    companion object {

    }

    private fun bind(){
        buttonNewPartido = view?.findViewById(R.id.new_movie_button) as FloatingActionButton
    }
}