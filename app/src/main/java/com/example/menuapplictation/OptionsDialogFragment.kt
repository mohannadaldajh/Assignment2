package com.example.menuapplictation

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class OptionsDialogFragment:DialogFragment(R.layout.fragment_dialog_options) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val txt : TextView = view.findViewById(R.id.txtOption1)
        val btnCanc : Button = view.findViewById(R.id.btnCancel)
        val btnSub : Button = view.findViewById(R.id.btnSubmit)
        btnCanc.setOnClickListener{
            dismiss()
        }
        btnSub.setOnClickListener{
//            Toast.makeText(this,"this is the first item page ",Toast.LENGTH_SHORT).show()
//            val m1 :MainActivity= activity() as MainActivity;
            dismiss()
        }
    }
}