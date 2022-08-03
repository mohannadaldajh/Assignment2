package com.example.menuapplictation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.content.Intent

/**
 * A simple [Fragment] subclass.
 * Use the [Option1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Option1 : Fragment(R.layout.fragment_option1) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn : Button = view.findViewById(R.id.btnSubmit)
//        btn.setOnClickListener(
//
//        )
    }
}