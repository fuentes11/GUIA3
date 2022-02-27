package com.example.guianumero3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_fragment1, container, false)
        val FinalSalary : Button = view.findViewById(R.id.btn_total)
        FinalSalary.setOnClickListener {
            val editText1 : EditText = view.findViewById(R.id.Et_horas)
            val editText2 : EditText = view.findViewById(R.id.Et_name)
            val hours = editText1.text.toString().toDouble()
            val salary = hours*8.50-((hours*8.50*0.02)+(hours*8.50*0.03)+(hours*8.50*0.04))
            val name = editText2.text.toString()
            val fragment = Fragment2(salary,name)
            fragmentManager?.beginTransaction()?.replace(R.id.yessir,fragment)?.commit()
        }
        return view
    }

}