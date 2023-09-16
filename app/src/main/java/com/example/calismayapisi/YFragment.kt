package com.example.calismayapisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation

class YFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val geriTusu = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                view?.let { Navigation.findNavController(it).navigate(R.id.action_YFragment_to_mainFragment) }
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(geriTusu)
        return inflater.inflate(R.layout.fragment_y, container, false)
    }

}