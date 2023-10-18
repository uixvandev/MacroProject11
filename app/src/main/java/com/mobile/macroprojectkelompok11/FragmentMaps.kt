package com.mobile.macroprojectkelompok11

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class FragmentMaps : Fragment(), OnMapReadyCallback {
    // TODO: Rename and change types of parameters
    private lateinit var mapView: MapView
    private lateinit var mMap: GoogleMap


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_maps, container, false)
        mapView = rootView.findViewById(R.id.mapView)
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync(this)

        val btnProfileActivity = rootView.findViewById<ImageView>(R.id.profile)

        val btnUdaraBersih = rootView.findViewById<ImageView>(R.id.btnUdaraBersih)
        val imageView15 = rootView.findViewById<ImageView>(R.id.imageView15)
        var isAlternateImage = false
        var originalImage: Int = R.drawable.zona_merah // Simpan gambar awal di sini

        btnUdaraBersih.setOnClickListener {
            if (isAlternateImage) {
                // Ganti zona menjadi zona merah
                imageView15.setImageResource(R.drawable.zona_merah)
                btnUdaraBersih.setImageResource(R.drawable.buttonhijau) // Ganti dengan gambar hijau
            } else {
                // Ganti zona menjadi zona hijau
                imageView15.setImageResource(R.drawable.zona_hijau)
                btnUdaraBersih.setImageResource(R.drawable.btnmerah)
            }

            isAlternateImage = !isAlternateImage
        }


        btnProfileActivity.setOnClickListener{
            val intent = Intent(context, ProfileActivity::class.java)
            startActivity(intent)
        }








        // ...

        return rootView
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val locations = ArrayList<LatLng>()

        // Tambahkan lokasi-lokasi yang berbeda ke dalam array
        locations.add(LatLng(-6.203099, 106.810961))
        // Tambahkan lokasi lainnya sesuai kebutuhan

        // Loop melalui array lokasi dan tambahkan marker untuk setiap lokasi
        for (location in locations) {
            val markerOptions = MarkerOptions()
                .position(location)
                .title("Marker Title")
                .snippet("Marker Snippet")

            mMap.addMarker(markerOptions)
        }

        // Pindahkan kamera ke lokasi terakhir dalam array (atau lokasi tertentu)
        if (locations.isNotEmpty()) {
            val lastLocation = locations.last()
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lastLocation, 11f))
        }
    }


    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }
}