package com.mobile.macroprojectkelompok11

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mobile.macroprojectkelompok11.databinding.FragmentKlikdaerahBinding
import com.mobile.macroprojectkelompok11.databinding.FragmentWawasaninformasiBinding

class klikdaerah : Fragment() {

    private var  binding : FragmentKlikdaerahBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentKlikdaerahBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cardView = binding?.chard2

        cardView?.setOnClickListener{
            val intent = Intent(context, DetailDataLokasiActivity::class.java)
            startActivity(intent)
        }
    }
}