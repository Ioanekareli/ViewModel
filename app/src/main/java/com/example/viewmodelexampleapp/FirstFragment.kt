package com.example.viewmodelexampleapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.viewmodelexampleapp.databinding.FirstFragmentBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FirstFragmentBinding
    private val model:FirstViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FirstFragmentBinding.inflate(inflater, container, false)


        model.getNumber().observe(viewLifecycleOwner, Observer<String>{ randomNumber ->
            binding.textView.text = randomNumber
        })

        binding.button.setOnClickListener {
            model.getNumber().value
        }

        binding.button2.setOnClickListener {

        }

        return binding.root
    }




}