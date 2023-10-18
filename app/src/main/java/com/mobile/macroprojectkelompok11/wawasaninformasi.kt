package com.mobile.macroprojectkelompok11

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mobile.macroprojectkelompok11.databinding.FragmentWawasaninformasiBinding

class wawasaninformasi : Fragment(R.layout.fragment_wawasaninformasi) {
    private var  binding : FragmentWawasaninformasiBinding?= null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWawasaninformasiBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cardView = binding?.cardView2
        val detailButton = binding?.buttondetailwawasaninformasi2

        detailButton?.setOnClickListener{
            val intent = Intent(context, InfoInformasi::class.java)
            startActivity(intent)
        }
    }


}