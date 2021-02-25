package com.example.viewmodelsample

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class HomeFragment: Fragment(R.layout.fragment_home) {

    private val viewModel by viewModels<HomeViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<Button>(R.id.button)
        val tvCount = view.findViewById<TextView>(R.id.textView)

        btn.setOnClickListener {
            viewModel.increment()
        }

        viewModel.count.observe(viewLifecycleOwner) {
            tvCount.text = it.toString()
        }
    }
}