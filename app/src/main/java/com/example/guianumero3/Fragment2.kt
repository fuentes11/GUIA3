package com.example.guianumero3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Fragment2(val salary:Double, val name:String) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_fragment2, container, false)
        val textView1 : TextView = view.findViewById(R.id.Salary)

        textView1.text = salary.toString()
        val textView2 : TextView = view.findViewById(R.id.Name)

        textView2.text = name
        return view
    }

}